package com.google.blockToBq;

import com.google.blockToBq.AvroWriter.Callback;
import com.google.blockToBq.ThreadHelpers.ThreadPool;
import com.google.blockToBq.generated.AvroBitcoinBlock;
import com.google.blockToBq.generated.AvroBitcoinInput;
import com.google.blockToBq.generated.AvroBitcoinOutput;
import com.google.blockToBq.generated.AvroBitcoinTransaction;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread.UncaughtExceptionHandler;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import org.bitcoinj.core.Block;
import org.bitcoinj.core.ScriptException;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.core.TransactionInput;
import org.bitcoinj.core.TransactionOutput;
import org.bitcoinj.params.MainNetParams;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitcoinBlockHandler implements BitcoinBlockDownloader.BlockListener {
  public final int WRITE_RETRIES = 3;
  private AvroWriter writer;
  private ThreadPool executor;
  private static final Logger log = LoggerFactory.getLogger(Main.class);
  private static final BigInteger teraHashUnit = new BigDecimal("10.0E+10").toBigIntegerExact();


  public BitcoinBlockHandler(AvroWriter writer, Integer maxWorkers) {
    log.info("Starting threadpool to handle block downloads with " + maxWorkers + " workers");
    this.executor = new ThreadHelpers.ThreadPool(
        1, maxWorkers, 500L,
        TimeUnit.MILLISECONDS);
    this.writer = writer;
  }

  /** Gets number of pending tasks. */
  public int getQueueSize() {
    return this.executor.getQueue().size();
  }

  /** Called whenver a new block is downloaded. */
  public void onBlock(Block block) {
    executor.execute(() -> processBlock(block));
  }

  /** Handles the processing of new blocks. */
  private void processBlock(Block block) {
    AvroBitcoinBlock avroBlock = convertBlockToAvro(block);

    Exception exception = null;
    for (int i = 0; i < WRITE_RETRIES; ++i) {
      try {
        writer.write(avroBlock);
        return;
      } catch (Exception e) {
        exception  = e;
      }
    }
    if (exception  != null) {
      exception.printStackTrace();
    }
  }

  /** Stops accepting new blocks & flushes queue. **/
  public void stop() {
    executor.stop();
  }

  /** Converts a Bitcoinj Block to Avro representation. */
  public static AvroBitcoinBlock convertBlockToAvro(Block block) {

    AvroBitcoinBlock.Builder blockBuilder = AvroBitcoinBlock.newBuilder()
        .setBlockId(block.getHashAsString())
        .setPreviousBlock(block.getPrevBlockHash().toString())
        .setMerkleRoot(block.getMerkleRoot().toString())
        .setTimestamp(block.getTime().getTime())
        .setDifficultyTarget(block.getDifficultyTarget())
        .setNonce(block.getNonce())
        .setVersion(block.getVersion());

    try {
      BigInteger workTeraHash = block.getWork().divide(teraHashUnit);
      blockBuilder.setWorkTerahash(workTeraHash.longValueExact());
    } catch (ArithmeticException e) {
      blockBuilder.setWorkTerahash(null);
      blockBuilder.setWorkError(e.getMessage());
    }

    if (block.getTransactions() == null) {
      blockBuilder.setTransactions(new ArrayList<>());
    } else {
      blockBuilder.setTransactions(block.getTransactions().stream()
          .map(BitcoinBlockHandler::convertTransctionToAvro)
          .collect(Collectors.toList()));
    }

    return blockBuilder.build();
  }

  public static AvroBitcoinTransaction convertTransctionToAvro(Transaction transaction) {
    AvroBitcoinTransaction.Builder transactionBuilder = AvroBitcoinTransaction.newBuilder();

    transactionBuilder.setTransactionId(transaction.getHashAsString());

    transactionBuilder.setInputs(transaction.getInputs().stream()
        .map(BitcoinBlockHandler::convertInputToAvro)
        .collect(Collectors.toList()));

    transactionBuilder.setOutputs(transaction.getOutputs().stream()
        .map(BitcoinBlockHandler::convertOutputToAvro)
        .collect(Collectors.toList()));

    return transactionBuilder.build();
  }

  public static AvroBitcoinInput convertInputToAvro(TransactionInput input) {
    AvroBitcoinInput.Builder builder = AvroBitcoinInput.newBuilder()
        .setInputScriptBytes(ByteBuffer.wrap(input.getScriptBytes()))
        .setInputSequenceNumber(input.getSequenceNumber());

    // Parse script string
    try {
      builder.setInputScriptString(input.getScriptSig().toString());
    } catch (ScriptException e) {
      builder.setInputScriptString(null);
      builder.setInputScriptStringError(e.getMessage());
    }

    // Parse input address
    if (input.isCoinBase()) {
      builder.setInputPubkeyBase58("");
    } else {

      try {
        builder.setInputPubkeyBase58(input.getFromAddress().toBase58());
      } catch (ScriptException e) {
        builder.setInputPubkeyBase58(null);
        builder.setInputPubkeyBase58Error(e.getMessage());
      }
    }

    return builder.build();
  }

  public static AvroBitcoinOutput convertOutputToAvro(TransactionOutput output) {
    AvroBitcoinOutput.Builder builder = AvroBitcoinOutput.newBuilder()
        .setOutputScriptBytes(ByteBuffer.wrap(output.getScriptBytes()));

    // parse out satoshis
    if (output.getValue() != null) {
      builder.setOutputSatoshis(output.getValue().getValue());
    } else {
      builder.setOutputSatoshis(null);
    }

    // parse script string
    try {
      builder.setOutputScriptString(output.getScriptPubKey().toString());
    } catch (ScriptException e) {
      builder.setOutputScriptString(null);
      builder.setOutputScriptStringError(e.getMessage());
    }

    // parse pubkey
    try {
      builder.setOutputPubkeyBase58(output.getScriptPubKey().getToAddress(MainNetParams.get()).toBase58());
    } catch (ScriptException e) {
      builder.setOutputPubkeyBase58(null);
      builder.setOutputPubkeyBase58Error(e.getMessage());
    }

    return builder.build();
  }
}


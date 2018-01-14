/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.google.blockToBq.generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class AvroBitcoinTransaction extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4699315326344019730L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroBitcoinTransaction\",\"namespace\":\"com.google.blockToBq.generated\",\"fields\":[{\"name\":\"transaction_id\",\"type\":\"string\"},{\"name\":\"inputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBitcoinInput\",\"fields\":[{\"name\":\"script_bytes\",\"type\":\"bytes\"},{\"name\":\"script_string\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"script_string_error\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"sequence_number\",\"type\":\"long\"},{\"name\":\"pubkey_base58\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"pubkey_base58_error\",\"type\":[\"null\",\"string\"],\"default\":null}]}}},{\"name\":\"outputs\",\"type\":{\"type\":\"array\",\"items\":{\"type\":\"record\",\"name\":\"AvroBitcoinOutput\",\"fields\":[{\"name\":\"satoshis\",\"type\":[\"long\",\"null\"]},{\"name\":\"script_bytes\",\"type\":\"bytes\"},{\"name\":\"script_string\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"script_string_error\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"pubkey_base58\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"pubkey_base58_error\",\"type\":[\"null\",\"string\"],\"default\":null}]}}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroBitcoinTransaction> ENCODER =
      new BinaryMessageEncoder<AvroBitcoinTransaction>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroBitcoinTransaction> DECODER =
      new BinaryMessageDecoder<AvroBitcoinTransaction>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroBitcoinTransaction> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroBitcoinTransaction> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroBitcoinTransaction>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroBitcoinTransaction to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroBitcoinTransaction from a ByteBuffer. */
  public static AvroBitcoinTransaction fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence transaction_id;
  @Deprecated public java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> inputs;
  @Deprecated public java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> outputs;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroBitcoinTransaction() {}

  /**
   * All-args constructor.
   * @param transaction_id The new value for transaction_id
   * @param inputs The new value for inputs
   * @param outputs The new value for outputs
   */
  public AvroBitcoinTransaction(java.lang.CharSequence transaction_id, java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> inputs, java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> outputs) {
    this.transaction_id = transaction_id;
    this.inputs = inputs;
    this.outputs = outputs;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return transaction_id;
    case 1: return inputs;
    case 2: return outputs;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: transaction_id = (java.lang.CharSequence)value$; break;
    case 1: inputs = (java.util.List<com.google.blockToBq.generated.AvroBitcoinInput>)value$; break;
    case 2: outputs = (java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput>)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'transaction_id' field.
   * @return The value of the 'transaction_id' field.
   */
  public java.lang.CharSequence getTransactionId() {
    return transaction_id;
  }

  /**
   * Sets the value of the 'transaction_id' field.
   * @param value the value to set.
   */
  public void setTransactionId(java.lang.CharSequence value) {
    this.transaction_id = value;
  }

  /**
   * Gets the value of the 'inputs' field.
   * @return The value of the 'inputs' field.
   */
  public java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> getInputs() {
    return inputs;
  }

  /**
   * Sets the value of the 'inputs' field.
   * @param value the value to set.
   */
  public void setInputs(java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> value) {
    this.inputs = value;
  }

  /**
   * Gets the value of the 'outputs' field.
   * @return The value of the 'outputs' field.
   */
  public java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> getOutputs() {
    return outputs;
  }

  /**
   * Sets the value of the 'outputs' field.
   * @param value the value to set.
   */
  public void setOutputs(java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> value) {
    this.outputs = value;
  }

  /**
   * Creates a new AvroBitcoinTransaction RecordBuilder.
   * @return A new AvroBitcoinTransaction RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinTransaction.Builder newBuilder() {
    return new com.google.blockToBq.generated.AvroBitcoinTransaction.Builder();
  }

  /**
   * Creates a new AvroBitcoinTransaction RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroBitcoinTransaction RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinTransaction.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinTransaction.Builder other) {
    return new com.google.blockToBq.generated.AvroBitcoinTransaction.Builder(other);
  }

  /**
   * Creates a new AvroBitcoinTransaction RecordBuilder by copying an existing AvroBitcoinTransaction instance.
   * @param other The existing instance to copy.
   * @return A new AvroBitcoinTransaction RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinTransaction.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinTransaction other) {
    return new com.google.blockToBq.generated.AvroBitcoinTransaction.Builder(other);
  }

  /**
   * RecordBuilder for AvroBitcoinTransaction instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroBitcoinTransaction>
    implements org.apache.avro.data.RecordBuilder<AvroBitcoinTransaction> {

    private java.lang.CharSequence transaction_id;
    private java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> inputs;
    private java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> outputs;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinTransaction.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.transaction_id)) {
        this.transaction_id = data().deepCopy(fields()[0].schema(), other.transaction_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inputs)) {
        this.inputs = data().deepCopy(fields()[1].schema(), other.inputs);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputs)) {
        this.outputs = data().deepCopy(fields()[2].schema(), other.outputs);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroBitcoinTransaction instance
     * @param other The existing instance to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinTransaction other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.transaction_id)) {
        this.transaction_id = data().deepCopy(fields()[0].schema(), other.transaction_id);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.inputs)) {
        this.inputs = data().deepCopy(fields()[1].schema(), other.inputs);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.outputs)) {
        this.outputs = data().deepCopy(fields()[2].schema(), other.outputs);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'transaction_id' field.
      * @return The value.
      */
    public java.lang.CharSequence getTransactionId() {
      return transaction_id;
    }

    /**
      * Sets the value of the 'transaction_id' field.
      * @param value The value of 'transaction_id'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder setTransactionId(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.transaction_id = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'transaction_id' field has been set.
      * @return True if the 'transaction_id' field has been set, false otherwise.
      */
    public boolean hasTransactionId() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'transaction_id' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder clearTransactionId() {
      transaction_id = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'inputs' field.
      * @return The value.
      */
    public java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> getInputs() {
      return inputs;
    }

    /**
      * Sets the value of the 'inputs' field.
      * @param value The value of 'inputs'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder setInputs(java.util.List<com.google.blockToBq.generated.AvroBitcoinInput> value) {
      validate(fields()[1], value);
      this.inputs = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'inputs' field has been set.
      * @return True if the 'inputs' field has been set, false otherwise.
      */
    public boolean hasInputs() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'inputs' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder clearInputs() {
      inputs = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'outputs' field.
      * @return The value.
      */
    public java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> getOutputs() {
      return outputs;
    }

    /**
      * Sets the value of the 'outputs' field.
      * @param value The value of 'outputs'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder setOutputs(java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput> value) {
      validate(fields()[2], value);
      this.outputs = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'outputs' field has been set.
      * @return True if the 'outputs' field has been set, false otherwise.
      */
    public boolean hasOutputs() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'outputs' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinTransaction.Builder clearOutputs() {
      outputs = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroBitcoinTransaction build() {
      try {
        AvroBitcoinTransaction record = new AvroBitcoinTransaction();
        record.transaction_id = fieldSetFlags()[0] ? this.transaction_id : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.inputs = fieldSetFlags()[1] ? this.inputs : (java.util.List<com.google.blockToBq.generated.AvroBitcoinInput>) defaultValue(fields()[1]);
        record.outputs = fieldSetFlags()[2] ? this.outputs : (java.util.List<com.google.blockToBq.generated.AvroBitcoinOutput>) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroBitcoinTransaction>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroBitcoinTransaction>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroBitcoinTransaction>
    READER$ = (org.apache.avro.io.DatumReader<AvroBitcoinTransaction>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

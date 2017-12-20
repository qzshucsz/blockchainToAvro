/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.google.BlockToBq.Generated;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class BitcoinInput extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6172084288968257226L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"BitcoinInput\",\"namespace\":\"com.google.BlockToBq.Generated\",\"fields\":[{\"name\":\"script_bytes\",\"type\":\"bytes\"},{\"name\":\"script_string\",\"type\":\"string\"},{\"name\":\"sequence_number\",\"type\":\"long\"}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<BitcoinInput> ENCODER =
      new BinaryMessageEncoder<BitcoinInput>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<BitcoinInput> DECODER =
      new BinaryMessageDecoder<BitcoinInput>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<BitcoinInput> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<BitcoinInput> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<BitcoinInput>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this BitcoinInput to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a BitcoinInput from a ByteBuffer. */
  public static BitcoinInput fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.nio.ByteBuffer script_bytes;
  @Deprecated public java.lang.CharSequence script_string;
  @Deprecated public long sequence_number;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public BitcoinInput() {}

  /**
   * All-args constructor.
   * @param script_bytes The new value for script_bytes
   * @param script_string The new value for script_string
   * @param sequence_number The new value for sequence_number
   */
  public BitcoinInput(java.nio.ByteBuffer script_bytes, java.lang.CharSequence script_string, java.lang.Long sequence_number) {
    this.script_bytes = script_bytes;
    this.script_string = script_string;
    this.sequence_number = sequence_number;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return script_bytes;
    case 1: return script_string;
    case 2: return sequence_number;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: script_bytes = (java.nio.ByteBuffer)value$; break;
    case 1: script_string = (java.lang.CharSequence)value$; break;
    case 2: sequence_number = (java.lang.Long)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'script_bytes' field.
   * @return The value of the 'script_bytes' field.
   */
  public java.nio.ByteBuffer getScriptBytes() {
    return script_bytes;
  }

  /**
   * Sets the value of the 'script_bytes' field.
   * @param value the value to set.
   */
  public void setScriptBytes(java.nio.ByteBuffer value) {
    this.script_bytes = value;
  }

  /**
   * Gets the value of the 'script_string' field.
   * @return The value of the 'script_string' field.
   */
  public java.lang.CharSequence getScriptString() {
    return script_string;
  }

  /**
   * Sets the value of the 'script_string' field.
   * @param value the value to set.
   */
  public void setScriptString(java.lang.CharSequence value) {
    this.script_string = value;
  }

  /**
   * Gets the value of the 'sequence_number' field.
   * @return The value of the 'sequence_number' field.
   */
  public java.lang.Long getSequenceNumber() {
    return sequence_number;
  }

  /**
   * Sets the value of the 'sequence_number' field.
   * @param value the value to set.
   */
  public void setSequenceNumber(java.lang.Long value) {
    this.sequence_number = value;
  }

  /**
   * Creates a new BitcoinInput RecordBuilder.
   * @return A new BitcoinInput RecordBuilder
   */
  public static com.google.BlockToBq.Generated.BitcoinInput.Builder newBuilder() {
    return new com.google.BlockToBq.Generated.BitcoinInput.Builder();
  }

  /**
   * Creates a new BitcoinInput RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new BitcoinInput RecordBuilder
   */
  public static com.google.BlockToBq.Generated.BitcoinInput.Builder newBuilder(com.google.BlockToBq.Generated.BitcoinInput.Builder other) {
    return new com.google.BlockToBq.Generated.BitcoinInput.Builder(other);
  }

  /**
   * Creates a new BitcoinInput RecordBuilder by copying an existing BitcoinInput instance.
   * @param other The existing instance to copy.
   * @return A new BitcoinInput RecordBuilder
   */
  public static com.google.BlockToBq.Generated.BitcoinInput.Builder newBuilder(com.google.BlockToBq.Generated.BitcoinInput other) {
    return new com.google.BlockToBq.Generated.BitcoinInput.Builder(other);
  }

  /**
   * RecordBuilder for BitcoinInput instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<BitcoinInput>
    implements org.apache.avro.data.RecordBuilder<BitcoinInput> {

    private java.nio.ByteBuffer script_bytes;
    private java.lang.CharSequence script_string;
    private long sequence_number;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.google.BlockToBq.Generated.BitcoinInput.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.script_bytes)) {
        this.script_bytes = data().deepCopy(fields()[0].schema(), other.script_bytes);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.script_string)) {
        this.script_string = data().deepCopy(fields()[1].schema(), other.script_string);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sequence_number)) {
        this.sequence_number = data().deepCopy(fields()[2].schema(), other.sequence_number);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing BitcoinInput instance
     * @param other The existing instance to copy.
     */
    private Builder(com.google.BlockToBq.Generated.BitcoinInput other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.script_bytes)) {
        this.script_bytes = data().deepCopy(fields()[0].schema(), other.script_bytes);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.script_string)) {
        this.script_string = data().deepCopy(fields()[1].schema(), other.script_string);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.sequence_number)) {
        this.sequence_number = data().deepCopy(fields()[2].schema(), other.sequence_number);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'script_bytes' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getScriptBytes() {
      return script_bytes;
    }

    /**
      * Sets the value of the 'script_bytes' field.
      * @param value The value of 'script_bytes'.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder setScriptBytes(java.nio.ByteBuffer value) {
      validate(fields()[0], value);
      this.script_bytes = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'script_bytes' field has been set.
      * @return True if the 'script_bytes' field has been set, false otherwise.
      */
    public boolean hasScriptBytes() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'script_bytes' field.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder clearScriptBytes() {
      script_bytes = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'script_string' field.
      * @return The value.
      */
    public java.lang.CharSequence getScriptString() {
      return script_string;
    }

    /**
      * Sets the value of the 'script_string' field.
      * @param value The value of 'script_string'.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder setScriptString(java.lang.CharSequence value) {
      validate(fields()[1], value);
      this.script_string = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'script_string' field has been set.
      * @return True if the 'script_string' field has been set, false otherwise.
      */
    public boolean hasScriptString() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'script_string' field.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder clearScriptString() {
      script_string = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'sequence_number' field.
      * @return The value.
      */
    public java.lang.Long getSequenceNumber() {
      return sequence_number;
    }

    /**
      * Sets the value of the 'sequence_number' field.
      * @param value The value of 'sequence_number'.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder setSequenceNumber(long value) {
      validate(fields()[2], value);
      this.sequence_number = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'sequence_number' field has been set.
      * @return True if the 'sequence_number' field has been set, false otherwise.
      */
    public boolean hasSequenceNumber() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'sequence_number' field.
      * @return This builder.
      */
    public com.google.BlockToBq.Generated.BitcoinInput.Builder clearSequenceNumber() {
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public BitcoinInput build() {
      try {
        BitcoinInput record = new BitcoinInput();
        record.script_bytes = fieldSetFlags()[0] ? this.script_bytes : (java.nio.ByteBuffer) defaultValue(fields()[0]);
        record.script_string = fieldSetFlags()[1] ? this.script_string : (java.lang.CharSequence) defaultValue(fields()[1]);
        record.sequence_number = fieldSetFlags()[2] ? this.sequence_number : (java.lang.Long) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<BitcoinInput>
    WRITER$ = (org.apache.avro.io.DatumWriter<BitcoinInput>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<BitcoinInput>
    READER$ = (org.apache.avro.io.DatumReader<BitcoinInput>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

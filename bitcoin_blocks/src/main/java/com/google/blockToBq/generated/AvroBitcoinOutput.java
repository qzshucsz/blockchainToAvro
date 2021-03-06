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
public class AvroBitcoinOutput extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -4542975615842625460L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"AvroBitcoinOutput\",\"namespace\":\"com.google.blockToBq.generated\",\"fields\":[{\"name\":\"output_satoshis\",\"type\":[\"long\",\"null\"]},{\"name\":\"output_script_bytes\",\"type\":\"bytes\"},{\"name\":\"output_script_string\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"output_script_string_error\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"output_pubkey_base58\",\"type\":[\"null\",\"string\"],\"default\":null},{\"name\":\"output_pubkey_base58_error\",\"type\":[\"null\",\"string\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<AvroBitcoinOutput> ENCODER =
      new BinaryMessageEncoder<AvroBitcoinOutput>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<AvroBitcoinOutput> DECODER =
      new BinaryMessageDecoder<AvroBitcoinOutput>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<AvroBitcoinOutput> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<AvroBitcoinOutput> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<AvroBitcoinOutput>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this AvroBitcoinOutput to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a AvroBitcoinOutput from a ByteBuffer. */
  public static AvroBitcoinOutput fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Long output_satoshis;
  @Deprecated public java.nio.ByteBuffer output_script_bytes;
  @Deprecated public java.lang.CharSequence output_script_string;
  @Deprecated public java.lang.CharSequence output_script_string_error;
  @Deprecated public java.lang.CharSequence output_pubkey_base58;
  @Deprecated public java.lang.CharSequence output_pubkey_base58_error;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public AvroBitcoinOutput() {}

  /**
   * All-args constructor.
   * @param output_satoshis The new value for output_satoshis
   * @param output_script_bytes The new value for output_script_bytes
   * @param output_script_string The new value for output_script_string
   * @param output_script_string_error The new value for output_script_string_error
   * @param output_pubkey_base58 The new value for output_pubkey_base58
   * @param output_pubkey_base58_error The new value for output_pubkey_base58_error
   */
  public AvroBitcoinOutput(java.lang.Long output_satoshis, java.nio.ByteBuffer output_script_bytes, java.lang.CharSequence output_script_string, java.lang.CharSequence output_script_string_error, java.lang.CharSequence output_pubkey_base58, java.lang.CharSequence output_pubkey_base58_error) {
    this.output_satoshis = output_satoshis;
    this.output_script_bytes = output_script_bytes;
    this.output_script_string = output_script_string;
    this.output_script_string_error = output_script_string_error;
    this.output_pubkey_base58 = output_pubkey_base58;
    this.output_pubkey_base58_error = output_pubkey_base58_error;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return output_satoshis;
    case 1: return output_script_bytes;
    case 2: return output_script_string;
    case 3: return output_script_string_error;
    case 4: return output_pubkey_base58;
    case 5: return output_pubkey_base58_error;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: output_satoshis = (java.lang.Long)value$; break;
    case 1: output_script_bytes = (java.nio.ByteBuffer)value$; break;
    case 2: output_script_string = (java.lang.CharSequence)value$; break;
    case 3: output_script_string_error = (java.lang.CharSequence)value$; break;
    case 4: output_pubkey_base58 = (java.lang.CharSequence)value$; break;
    case 5: output_pubkey_base58_error = (java.lang.CharSequence)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'output_satoshis' field.
   * @return The value of the 'output_satoshis' field.
   */
  public java.lang.Long getOutputSatoshis() {
    return output_satoshis;
  }

  /**
   * Sets the value of the 'output_satoshis' field.
   * @param value the value to set.
   */
  public void setOutputSatoshis(java.lang.Long value) {
    this.output_satoshis = value;
  }

  /**
   * Gets the value of the 'output_script_bytes' field.
   * @return The value of the 'output_script_bytes' field.
   */
  public java.nio.ByteBuffer getOutputScriptBytes() {
    return output_script_bytes;
  }

  /**
   * Sets the value of the 'output_script_bytes' field.
   * @param value the value to set.
   */
  public void setOutputScriptBytes(java.nio.ByteBuffer value) {
    this.output_script_bytes = value;
  }

  /**
   * Gets the value of the 'output_script_string' field.
   * @return The value of the 'output_script_string' field.
   */
  public java.lang.CharSequence getOutputScriptString() {
    return output_script_string;
  }

  /**
   * Sets the value of the 'output_script_string' field.
   * @param value the value to set.
   */
  public void setOutputScriptString(java.lang.CharSequence value) {
    this.output_script_string = value;
  }

  /**
   * Gets the value of the 'output_script_string_error' field.
   * @return The value of the 'output_script_string_error' field.
   */
  public java.lang.CharSequence getOutputScriptStringError() {
    return output_script_string_error;
  }

  /**
   * Sets the value of the 'output_script_string_error' field.
   * @param value the value to set.
   */
  public void setOutputScriptStringError(java.lang.CharSequence value) {
    this.output_script_string_error = value;
  }

  /**
   * Gets the value of the 'output_pubkey_base58' field.
   * @return The value of the 'output_pubkey_base58' field.
   */
  public java.lang.CharSequence getOutputPubkeyBase58() {
    return output_pubkey_base58;
  }

  /**
   * Sets the value of the 'output_pubkey_base58' field.
   * @param value the value to set.
   */
  public void setOutputPubkeyBase58(java.lang.CharSequence value) {
    this.output_pubkey_base58 = value;
  }

  /**
   * Gets the value of the 'output_pubkey_base58_error' field.
   * @return The value of the 'output_pubkey_base58_error' field.
   */
  public java.lang.CharSequence getOutputPubkeyBase58Error() {
    return output_pubkey_base58_error;
  }

  /**
   * Sets the value of the 'output_pubkey_base58_error' field.
   * @param value the value to set.
   */
  public void setOutputPubkeyBase58Error(java.lang.CharSequence value) {
    this.output_pubkey_base58_error = value;
  }

  /**
   * Creates a new AvroBitcoinOutput RecordBuilder.
   * @return A new AvroBitcoinOutput RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinOutput.Builder newBuilder() {
    return new com.google.blockToBq.generated.AvroBitcoinOutput.Builder();
  }

  /**
   * Creates a new AvroBitcoinOutput RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new AvroBitcoinOutput RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinOutput.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinOutput.Builder other) {
    return new com.google.blockToBq.generated.AvroBitcoinOutput.Builder(other);
  }

  /**
   * Creates a new AvroBitcoinOutput RecordBuilder by copying an existing AvroBitcoinOutput instance.
   * @param other The existing instance to copy.
   * @return A new AvroBitcoinOutput RecordBuilder
   */
  public static com.google.blockToBq.generated.AvroBitcoinOutput.Builder newBuilder(com.google.blockToBq.generated.AvroBitcoinOutput other) {
    return new com.google.blockToBq.generated.AvroBitcoinOutput.Builder(other);
  }

  /**
   * RecordBuilder for AvroBitcoinOutput instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<AvroBitcoinOutput>
    implements org.apache.avro.data.RecordBuilder<AvroBitcoinOutput> {

    private java.lang.Long output_satoshis;
    private java.nio.ByteBuffer output_script_bytes;
    private java.lang.CharSequence output_script_string;
    private java.lang.CharSequence output_script_string_error;
    private java.lang.CharSequence output_pubkey_base58;
    private java.lang.CharSequence output_pubkey_base58_error;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinOutput.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.output_satoshis)) {
        this.output_satoshis = data().deepCopy(fields()[0].schema(), other.output_satoshis);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.output_script_bytes)) {
        this.output_script_bytes = data().deepCopy(fields()[1].schema(), other.output_script_bytes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.output_script_string)) {
        this.output_script_string = data().deepCopy(fields()[2].schema(), other.output_script_string);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.output_script_string_error)) {
        this.output_script_string_error = data().deepCopy(fields()[3].schema(), other.output_script_string_error);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.output_pubkey_base58)) {
        this.output_pubkey_base58 = data().deepCopy(fields()[4].schema(), other.output_pubkey_base58);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.output_pubkey_base58_error)) {
        this.output_pubkey_base58_error = data().deepCopy(fields()[5].schema(), other.output_pubkey_base58_error);
        fieldSetFlags()[5] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing AvroBitcoinOutput instance
     * @param other The existing instance to copy.
     */
    private Builder(com.google.blockToBq.generated.AvroBitcoinOutput other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.output_satoshis)) {
        this.output_satoshis = data().deepCopy(fields()[0].schema(), other.output_satoshis);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.output_script_bytes)) {
        this.output_script_bytes = data().deepCopy(fields()[1].schema(), other.output_script_bytes);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.output_script_string)) {
        this.output_script_string = data().deepCopy(fields()[2].schema(), other.output_script_string);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.output_script_string_error)) {
        this.output_script_string_error = data().deepCopy(fields()[3].schema(), other.output_script_string_error);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.output_pubkey_base58)) {
        this.output_pubkey_base58 = data().deepCopy(fields()[4].schema(), other.output_pubkey_base58);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.output_pubkey_base58_error)) {
        this.output_pubkey_base58_error = data().deepCopy(fields()[5].schema(), other.output_pubkey_base58_error);
        fieldSetFlags()[5] = true;
      }
    }

    /**
      * Gets the value of the 'output_satoshis' field.
      * @return The value.
      */
    public java.lang.Long getOutputSatoshis() {
      return output_satoshis;
    }

    /**
      * Sets the value of the 'output_satoshis' field.
      * @param value The value of 'output_satoshis'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputSatoshis(java.lang.Long value) {
      validate(fields()[0], value);
      this.output_satoshis = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'output_satoshis' field has been set.
      * @return True if the 'output_satoshis' field has been set, false otherwise.
      */
    public boolean hasOutputSatoshis() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'output_satoshis' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputSatoshis() {
      output_satoshis = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'output_script_bytes' field.
      * @return The value.
      */
    public java.nio.ByteBuffer getOutputScriptBytes() {
      return output_script_bytes;
    }

    /**
      * Sets the value of the 'output_script_bytes' field.
      * @param value The value of 'output_script_bytes'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputScriptBytes(java.nio.ByteBuffer value) {
      validate(fields()[1], value);
      this.output_script_bytes = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'output_script_bytes' field has been set.
      * @return True if the 'output_script_bytes' field has been set, false otherwise.
      */
    public boolean hasOutputScriptBytes() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'output_script_bytes' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputScriptBytes() {
      output_script_bytes = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'output_script_string' field.
      * @return The value.
      */
    public java.lang.CharSequence getOutputScriptString() {
      return output_script_string;
    }

    /**
      * Sets the value of the 'output_script_string' field.
      * @param value The value of 'output_script_string'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputScriptString(java.lang.CharSequence value) {
      validate(fields()[2], value);
      this.output_script_string = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'output_script_string' field has been set.
      * @return True if the 'output_script_string' field has been set, false otherwise.
      */
    public boolean hasOutputScriptString() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'output_script_string' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputScriptString() {
      output_script_string = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'output_script_string_error' field.
      * @return The value.
      */
    public java.lang.CharSequence getOutputScriptStringError() {
      return output_script_string_error;
    }

    /**
      * Sets the value of the 'output_script_string_error' field.
      * @param value The value of 'output_script_string_error'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputScriptStringError(java.lang.CharSequence value) {
      validate(fields()[3], value);
      this.output_script_string_error = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'output_script_string_error' field has been set.
      * @return True if the 'output_script_string_error' field has been set, false otherwise.
      */
    public boolean hasOutputScriptStringError() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'output_script_string_error' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputScriptStringError() {
      output_script_string_error = null;
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'output_pubkey_base58' field.
      * @return The value.
      */
    public java.lang.CharSequence getOutputPubkeyBase58() {
      return output_pubkey_base58;
    }

    /**
      * Sets the value of the 'output_pubkey_base58' field.
      * @param value The value of 'output_pubkey_base58'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputPubkeyBase58(java.lang.CharSequence value) {
      validate(fields()[4], value);
      this.output_pubkey_base58 = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'output_pubkey_base58' field has been set.
      * @return True if the 'output_pubkey_base58' field has been set, false otherwise.
      */
    public boolean hasOutputPubkeyBase58() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'output_pubkey_base58' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputPubkeyBase58() {
      output_pubkey_base58 = null;
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'output_pubkey_base58_error' field.
      * @return The value.
      */
    public java.lang.CharSequence getOutputPubkeyBase58Error() {
      return output_pubkey_base58_error;
    }

    /**
      * Sets the value of the 'output_pubkey_base58_error' field.
      * @param value The value of 'output_pubkey_base58_error'.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder setOutputPubkeyBase58Error(java.lang.CharSequence value) {
      validate(fields()[5], value);
      this.output_pubkey_base58_error = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'output_pubkey_base58_error' field has been set.
      * @return True if the 'output_pubkey_base58_error' field has been set, false otherwise.
      */
    public boolean hasOutputPubkeyBase58Error() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'output_pubkey_base58_error' field.
      * @return This builder.
      */
    public com.google.blockToBq.generated.AvroBitcoinOutput.Builder clearOutputPubkeyBase58Error() {
      output_pubkey_base58_error = null;
      fieldSetFlags()[5] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public AvroBitcoinOutput build() {
      try {
        AvroBitcoinOutput record = new AvroBitcoinOutput();
        record.output_satoshis = fieldSetFlags()[0] ? this.output_satoshis : (java.lang.Long) defaultValue(fields()[0]);
        record.output_script_bytes = fieldSetFlags()[1] ? this.output_script_bytes : (java.nio.ByteBuffer) defaultValue(fields()[1]);
        record.output_script_string = fieldSetFlags()[2] ? this.output_script_string : (java.lang.CharSequence) defaultValue(fields()[2]);
        record.output_script_string_error = fieldSetFlags()[3] ? this.output_script_string_error : (java.lang.CharSequence) defaultValue(fields()[3]);
        record.output_pubkey_base58 = fieldSetFlags()[4] ? this.output_pubkey_base58 : (java.lang.CharSequence) defaultValue(fields()[4]);
        record.output_pubkey_base58_error = fieldSetFlags()[5] ? this.output_pubkey_base58_error : (java.lang.CharSequence) defaultValue(fields()[5]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<AvroBitcoinOutput>
    WRITER$ = (org.apache.avro.io.DatumWriter<AvroBitcoinOutput>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<AvroBitcoinOutput>
    READER$ = (org.apache.avro.io.DatumReader<AvroBitcoinOutput>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}

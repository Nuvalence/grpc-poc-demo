// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: horoscope/horoscope.proto

package com.proto;

/**
 * Protobuf enum {@code ZodiacSign}
 */
public enum ZodiacSign
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ARIES = 0;</code>
   */
  ARIES(0),
  /**
   * <code>TAURUS = 1;</code>
   */
  TAURUS(1),
  /**
   * <code>GEMINI = 2;</code>
   */
  GEMINI(2),
  /**
   * <code>CANCER = 3;</code>
   */
  CANCER(3),
  /**
   * <code>LEO = 4;</code>
   */
  LEO(4),
  /**
   * <code>VIRGO = 5;</code>
   */
  VIRGO(5),
  /**
   * <code>LIBRA = 6;</code>
   */
  LIBRA(6),
  /**
   * <code>SCORPIO = 7;</code>
   */
  SCORPIO(7),
  /**
   * <code>SAGITTARIUS = 8;</code>
   */
  SAGITTARIUS(8),
  /**
   * <code>CAPRICORN = 9;</code>
   */
  CAPRICORN(9),
  /**
   * <code>AQUARIUS = 10;</code>
   */
  AQUARIUS(10),
  /**
   * <code>PISCES = 11;</code>
   */
  PISCES(11),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ARIES = 0;</code>
   */
  public static final int ARIES_VALUE = 0;
  /**
   * <code>TAURUS = 1;</code>
   */
  public static final int TAURUS_VALUE = 1;
  /**
   * <code>GEMINI = 2;</code>
   */
  public static final int GEMINI_VALUE = 2;
  /**
   * <code>CANCER = 3;</code>
   */
  public static final int CANCER_VALUE = 3;
  /**
   * <code>LEO = 4;</code>
   */
  public static final int LEO_VALUE = 4;
  /**
   * <code>VIRGO = 5;</code>
   */
  public static final int VIRGO_VALUE = 5;
  /**
   * <code>LIBRA = 6;</code>
   */
  public static final int LIBRA_VALUE = 6;
  /**
   * <code>SCORPIO = 7;</code>
   */
  public static final int SCORPIO_VALUE = 7;
  /**
   * <code>SAGITTARIUS = 8;</code>
   */
  public static final int SAGITTARIUS_VALUE = 8;
  /**
   * <code>CAPRICORN = 9;</code>
   */
  public static final int CAPRICORN_VALUE = 9;
  /**
   * <code>AQUARIUS = 10;</code>
   */
  public static final int AQUARIUS_VALUE = 10;
  /**
   * <code>PISCES = 11;</code>
   */
  public static final int PISCES_VALUE = 11;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ZodiacSign valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ZodiacSign forNumber(int value) {
    switch (value) {
      case 0: return ARIES;
      case 1: return TAURUS;
      case 2: return GEMINI;
      case 3: return CANCER;
      case 4: return LEO;
      case 5: return VIRGO;
      case 6: return LIBRA;
      case 7: return SCORPIO;
      case 8: return SAGITTARIUS;
      case 9: return CAPRICORN;
      case 10: return AQUARIUS;
      case 11: return PISCES;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ZodiacSign>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ZodiacSign> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ZodiacSign>() {
          public ZodiacSign findValueByNumber(int number) {
            return ZodiacSign.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return com.proto.Horoscope.getDescriptor().getEnumTypes().get(0);
  }

  private static final ZodiacSign[] VALUES = values();

  public static ZodiacSign valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ZodiacSign(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ZodiacSign)
}


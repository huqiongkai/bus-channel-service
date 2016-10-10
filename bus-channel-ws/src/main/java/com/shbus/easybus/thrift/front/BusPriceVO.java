/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.shbus.easybus.thrift.front;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
/**
 * 车次价格信息VO
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-31")
public class BusPriceVO implements org.apache.thrift.TBase<BusPriceVO, BusPriceVO._Fields>, java.io.Serializable, Cloneable, Comparable<BusPriceVO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BusPriceVO");

  private static final org.apache.thrift.protocol.TField PRICE_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("priceId", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField PRICE_FULL_FIELD_DESC = new org.apache.thrift.protocol.TField("priceFull", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField PRICE_SEMI_FIELD_DESC = new org.apache.thrift.protocol.TField("priceSemi", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BASE_PRICE_FULL_FIELD_DESC = new org.apache.thrift.protocol.TField("basePriceFull", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField BASE_PRICE_SEMI_FIELD_DESC = new org.apache.thrift.protocol.TField("basePriceSemi", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BusPriceVOStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BusPriceVOTupleSchemeFactory());
  }

  /**
   * 票价id(暂时不用)
   */
  public String priceId; // required
  /**
   * 全票价
   */
  public int priceFull; // required
  /**
   * 半票价(暂时不用)
   */
  public int priceSemi; // required
  /**
   * 基准票价(暂时不用)
   */
  public int basePriceFull; // required
  /**
   * 基准半票价(暂时不用)
   */
  public int basePriceSemi; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 票价id(暂时不用)
     */
    PRICE_ID((short)1, "priceId"),
    /**
     * 全票价
     */
    PRICE_FULL((short)2, "priceFull"),
    /**
     * 半票价(暂时不用)
     */
    PRICE_SEMI((short)3, "priceSemi"),
    /**
     * 基准票价(暂时不用)
     */
    BASE_PRICE_FULL((short)4, "basePriceFull"),
    /**
     * 基准半票价(暂时不用)
     */
    BASE_PRICE_SEMI((short)5, "basePriceSemi");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PRICE_ID
          return PRICE_ID;
        case 2: // PRICE_FULL
          return PRICE_FULL;
        case 3: // PRICE_SEMI
          return PRICE_SEMI;
        case 4: // BASE_PRICE_FULL
          return BASE_PRICE_FULL;
        case 5: // BASE_PRICE_SEMI
          return BASE_PRICE_SEMI;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __PRICEFULL_ISSET_ID = 0;
  private static final int __PRICESEMI_ISSET_ID = 1;
  private static final int __BASEPRICEFULL_ISSET_ID = 2;
  private static final int __BASEPRICESEMI_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRICE_ID, new org.apache.thrift.meta_data.FieldMetaData("priceId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.PRICE_FULL, new org.apache.thrift.meta_data.FieldMetaData("priceFull", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRICE_SEMI, new org.apache.thrift.meta_data.FieldMetaData("priceSemi", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BASE_PRICE_FULL, new org.apache.thrift.meta_data.FieldMetaData("basePriceFull", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.BASE_PRICE_SEMI, new org.apache.thrift.meta_data.FieldMetaData("basePriceSemi", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BusPriceVO.class, metaDataMap);
  }

  public BusPriceVO() {
  }

  public BusPriceVO(
    String priceId,
    int priceFull,
    int priceSemi,
    int basePriceFull,
    int basePriceSemi)
  {
    this();
    this.priceId = priceId;
    this.priceFull = priceFull;
    setPriceFullIsSet(true);
    this.priceSemi = priceSemi;
    setPriceSemiIsSet(true);
    this.basePriceFull = basePriceFull;
    setBasePriceFullIsSet(true);
    this.basePriceSemi = basePriceSemi;
    setBasePriceSemiIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BusPriceVO(BusPriceVO other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetPriceId()) {
      this.priceId = other.priceId;
    }
    this.priceFull = other.priceFull;
    this.priceSemi = other.priceSemi;
    this.basePriceFull = other.basePriceFull;
    this.basePriceSemi = other.basePriceSemi;
  }

  public BusPriceVO deepCopy() {
    return new BusPriceVO(this);
  }

  @Override
  public void clear() {
    this.priceId = null;
    setPriceFullIsSet(false);
    this.priceFull = 0;
    setPriceSemiIsSet(false);
    this.priceSemi = 0;
    setBasePriceFullIsSet(false);
    this.basePriceFull = 0;
    setBasePriceSemiIsSet(false);
    this.basePriceSemi = 0;
  }

  /**
   * 票价id(暂时不用)
   */
  public String getPriceId() {
    return this.priceId;
  }

  /**
   * 票价id(暂时不用)
   */
  public BusPriceVO setPriceId(String priceId) {
    this.priceId = priceId;
    return this;
  }

  public void unsetPriceId() {
    this.priceId = null;
  }

  /** Returns true if field priceId is set (has been assigned a value) and false otherwise */
  public boolean isSetPriceId() {
    return this.priceId != null;
  }

  public void setPriceIdIsSet(boolean value) {
    if (!value) {
      this.priceId = null;
    }
  }

  /**
   * 全票价
   */
  public int getPriceFull() {
    return this.priceFull;
  }

  /**
   * 全票价
   */
  public BusPriceVO setPriceFull(int priceFull) {
    this.priceFull = priceFull;
    setPriceFullIsSet(true);
    return this;
  }

  public void unsetPriceFull() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRICEFULL_ISSET_ID);
  }

  /** Returns true if field priceFull is set (has been assigned a value) and false otherwise */
  public boolean isSetPriceFull() {
    return EncodingUtils.testBit(__isset_bitfield, __PRICEFULL_ISSET_ID);
  }

  public void setPriceFullIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRICEFULL_ISSET_ID, value);
  }

  /**
   * 半票价(暂时不用)
   */
  public int getPriceSemi() {
    return this.priceSemi;
  }

  /**
   * 半票价(暂时不用)
   */
  public BusPriceVO setPriceSemi(int priceSemi) {
    this.priceSemi = priceSemi;
    setPriceSemiIsSet(true);
    return this;
  }

  public void unsetPriceSemi() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRICESEMI_ISSET_ID);
  }

  /** Returns true if field priceSemi is set (has been assigned a value) and false otherwise */
  public boolean isSetPriceSemi() {
    return EncodingUtils.testBit(__isset_bitfield, __PRICESEMI_ISSET_ID);
  }

  public void setPriceSemiIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRICESEMI_ISSET_ID, value);
  }

  /**
   * 基准票价(暂时不用)
   */
  public int getBasePriceFull() {
    return this.basePriceFull;
  }

  /**
   * 基准票价(暂时不用)
   */
  public BusPriceVO setBasePriceFull(int basePriceFull) {
    this.basePriceFull = basePriceFull;
    setBasePriceFullIsSet(true);
    return this;
  }

  public void unsetBasePriceFull() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BASEPRICEFULL_ISSET_ID);
  }

  /** Returns true if field basePriceFull is set (has been assigned a value) and false otherwise */
  public boolean isSetBasePriceFull() {
    return EncodingUtils.testBit(__isset_bitfield, __BASEPRICEFULL_ISSET_ID);
  }

  public void setBasePriceFullIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BASEPRICEFULL_ISSET_ID, value);
  }

  /**
   * 基准半票价(暂时不用)
   */
  public int getBasePriceSemi() {
    return this.basePriceSemi;
  }

  /**
   * 基准半票价(暂时不用)
   */
  public BusPriceVO setBasePriceSemi(int basePriceSemi) {
    this.basePriceSemi = basePriceSemi;
    setBasePriceSemiIsSet(true);
    return this;
  }

  public void unsetBasePriceSemi() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BASEPRICESEMI_ISSET_ID);
  }

  /** Returns true if field basePriceSemi is set (has been assigned a value) and false otherwise */
  public boolean isSetBasePriceSemi() {
    return EncodingUtils.testBit(__isset_bitfield, __BASEPRICESEMI_ISSET_ID);
  }

  public void setBasePriceSemiIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BASEPRICESEMI_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRICE_ID:
      if (value == null) {
        unsetPriceId();
      } else {
        setPriceId((String)value);
      }
      break;

    case PRICE_FULL:
      if (value == null) {
        unsetPriceFull();
      } else {
        setPriceFull((Integer)value);
      }
      break;

    case PRICE_SEMI:
      if (value == null) {
        unsetPriceSemi();
      } else {
        setPriceSemi((Integer)value);
      }
      break;

    case BASE_PRICE_FULL:
      if (value == null) {
        unsetBasePriceFull();
      } else {
        setBasePriceFull((Integer)value);
      }
      break;

    case BASE_PRICE_SEMI:
      if (value == null) {
        unsetBasePriceSemi();
      } else {
        setBasePriceSemi((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRICE_ID:
      return getPriceId();

    case PRICE_FULL:
      return getPriceFull();

    case PRICE_SEMI:
      return getPriceSemi();

    case BASE_PRICE_FULL:
      return getBasePriceFull();

    case BASE_PRICE_SEMI:
      return getBasePriceSemi();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRICE_ID:
      return isSetPriceId();
    case PRICE_FULL:
      return isSetPriceFull();
    case PRICE_SEMI:
      return isSetPriceSemi();
    case BASE_PRICE_FULL:
      return isSetBasePriceFull();
    case BASE_PRICE_SEMI:
      return isSetBasePriceSemi();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BusPriceVO)
      return this.equals((BusPriceVO)that);
    return false;
  }

  public boolean equals(BusPriceVO that) {
    if (that == null)
      return false;

    boolean this_present_priceId = true && this.isSetPriceId();
    boolean that_present_priceId = true && that.isSetPriceId();
    if (this_present_priceId || that_present_priceId) {
      if (!(this_present_priceId && that_present_priceId))
        return false;
      if (!this.priceId.equals(that.priceId))
        return false;
    }

    boolean this_present_priceFull = true;
    boolean that_present_priceFull = true;
    if (this_present_priceFull || that_present_priceFull) {
      if (!(this_present_priceFull && that_present_priceFull))
        return false;
      if (this.priceFull != that.priceFull)
        return false;
    }

    boolean this_present_priceSemi = true;
    boolean that_present_priceSemi = true;
    if (this_present_priceSemi || that_present_priceSemi) {
      if (!(this_present_priceSemi && that_present_priceSemi))
        return false;
      if (this.priceSemi != that.priceSemi)
        return false;
    }

    boolean this_present_basePriceFull = true;
    boolean that_present_basePriceFull = true;
    if (this_present_basePriceFull || that_present_basePriceFull) {
      if (!(this_present_basePriceFull && that_present_basePriceFull))
        return false;
      if (this.basePriceFull != that.basePriceFull)
        return false;
    }

    boolean this_present_basePriceSemi = true;
    boolean that_present_basePriceSemi = true;
    if (this_present_basePriceSemi || that_present_basePriceSemi) {
      if (!(this_present_basePriceSemi && that_present_basePriceSemi))
        return false;
      if (this.basePriceSemi != that.basePriceSemi)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_priceId = true && (isSetPriceId());
    list.add(present_priceId);
    if (present_priceId)
      list.add(priceId);

    boolean present_priceFull = true;
    list.add(present_priceFull);
    if (present_priceFull)
      list.add(priceFull);

    boolean present_priceSemi = true;
    list.add(present_priceSemi);
    if (present_priceSemi)
      list.add(priceSemi);

    boolean present_basePriceFull = true;
    list.add(present_basePriceFull);
    if (present_basePriceFull)
      list.add(basePriceFull);

    boolean present_basePriceSemi = true;
    list.add(present_basePriceSemi);
    if (present_basePriceSemi)
      list.add(basePriceSemi);

    return list.hashCode();
  }

  @Override
  public int compareTo(BusPriceVO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPriceId()).compareTo(other.isSetPriceId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriceId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priceId, other.priceId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriceFull()).compareTo(other.isSetPriceFull());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriceFull()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priceFull, other.priceFull);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPriceSemi()).compareTo(other.isSetPriceSemi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPriceSemi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.priceSemi, other.priceSemi);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBasePriceFull()).compareTo(other.isSetBasePriceFull());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBasePriceFull()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.basePriceFull, other.basePriceFull);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBasePriceSemi()).compareTo(other.isSetBasePriceSemi());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBasePriceSemi()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.basePriceSemi, other.basePriceSemi);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BusPriceVO(");
    boolean first = true;

    sb.append("priceId:");
    if (this.priceId == null) {
      sb.append("null");
    } else {
      sb.append(this.priceId);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("priceFull:");
    sb.append(this.priceFull);
    first = false;
    if (!first) sb.append(", ");
    sb.append("priceSemi:");
    sb.append(this.priceSemi);
    first = false;
    if (!first) sb.append(", ");
    sb.append("basePriceFull:");
    sb.append(this.basePriceFull);
    first = false;
    if (!first) sb.append(", ");
    sb.append("basePriceSemi:");
    sb.append(this.basePriceSemi);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BusPriceVOStandardSchemeFactory implements SchemeFactory {
    public BusPriceVOStandardScheme getScheme() {
      return new BusPriceVOStandardScheme();
    }
  }

  private static class BusPriceVOStandardScheme extends StandardScheme<BusPriceVO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BusPriceVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRICE_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.priceId = iprot.readString();
              struct.setPriceIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // PRICE_FULL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priceFull = iprot.readI32();
              struct.setPriceFullIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // PRICE_SEMI
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.priceSemi = iprot.readI32();
              struct.setPriceSemiIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BASE_PRICE_FULL
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.basePriceFull = iprot.readI32();
              struct.setBasePriceFullIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // BASE_PRICE_SEMI
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.basePriceSemi = iprot.readI32();
              struct.setBasePriceSemiIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BusPriceVO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.priceId != null) {
        oprot.writeFieldBegin(PRICE_ID_FIELD_DESC);
        oprot.writeString(struct.priceId);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(PRICE_FULL_FIELD_DESC);
      oprot.writeI32(struct.priceFull);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PRICE_SEMI_FIELD_DESC);
      oprot.writeI32(struct.priceSemi);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BASE_PRICE_FULL_FIELD_DESC);
      oprot.writeI32(struct.basePriceFull);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BASE_PRICE_SEMI_FIELD_DESC);
      oprot.writeI32(struct.basePriceSemi);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BusPriceVOTupleSchemeFactory implements SchemeFactory {
    public BusPriceVOTupleScheme getScheme() {
      return new BusPriceVOTupleScheme();
    }
  }

  private static class BusPriceVOTupleScheme extends TupleScheme<BusPriceVO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BusPriceVO struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPriceId()) {
        optionals.set(0);
      }
      if (struct.isSetPriceFull()) {
        optionals.set(1);
      }
      if (struct.isSetPriceSemi()) {
        optionals.set(2);
      }
      if (struct.isSetBasePriceFull()) {
        optionals.set(3);
      }
      if (struct.isSetBasePriceSemi()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetPriceId()) {
        oprot.writeString(struct.priceId);
      }
      if (struct.isSetPriceFull()) {
        oprot.writeI32(struct.priceFull);
      }
      if (struct.isSetPriceSemi()) {
        oprot.writeI32(struct.priceSemi);
      }
      if (struct.isSetBasePriceFull()) {
        oprot.writeI32(struct.basePriceFull);
      }
      if (struct.isSetBasePriceSemi()) {
        oprot.writeI32(struct.basePriceSemi);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BusPriceVO struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.priceId = iprot.readString();
        struct.setPriceIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.priceFull = iprot.readI32();
        struct.setPriceFullIsSet(true);
      }
      if (incoming.get(2)) {
        struct.priceSemi = iprot.readI32();
        struct.setPriceSemiIsSet(true);
      }
      if (incoming.get(3)) {
        struct.basePriceFull = iprot.readI32();
        struct.setBasePriceFullIsSet(true);
      }
      if (incoming.get(4)) {
        struct.basePriceSemi = iprot.readI32();
        struct.setBasePriceSemiIsSet(true);
      }
    }
  }

}


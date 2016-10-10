/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.shbus.easybus.thrift.back;

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
 * 身份验证vo
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-03")
public class AuthVO implements org.apache.thrift.TBase<AuthVO, AuthVO._Fields>, java.io.Serializable, Cloneable, Comparable<AuthVO> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AuthVO");

  private static final org.apache.thrift.protocol.TField KEY_FIELD_DESC = new org.apache.thrift.protocol.TField("key", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SIGN_FIELD_DESC = new org.apache.thrift.protocol.TField("sign", org.apache.thrift.protocol.TType.STRING, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AuthVOStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AuthVOTupleSchemeFactory());
  }

  /**
   * 用户key
   */
  public String key; // required
  /**
   * 用户签名  签名格式:md5(key+password)
   * 对用户的key password 进行md5加密，
   * key和password 会为每个渠道分配不同的值
   */
  public String sign; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 用户key
     */
    KEY((short)1, "key"),
    /**
     * 用户签名  签名格式:md5(key+password)
     * 对用户的key password 进行md5加密，
     * key和password 会为每个渠道分配不同的值
     */
    SIGN((short)2, "sign");

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
        case 1: // KEY
          return KEY;
        case 2: // SIGN
          return SIGN;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEY, new org.apache.thrift.meta_data.FieldMetaData("key", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SIGN, new org.apache.thrift.meta_data.FieldMetaData("sign", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AuthVO.class, metaDataMap);
  }

  public AuthVO() {
  }

  public AuthVO(
    String key,
    String sign)
  {
    this();
    this.key = key;
    this.sign = sign;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AuthVO(AuthVO other) {
    if (other.isSetKey()) {
      this.key = other.key;
    }
    if (other.isSetSign()) {
      this.sign = other.sign;
    }
  }

  public AuthVO deepCopy() {
    return new AuthVO(this);
  }

  @Override
  public void clear() {
    this.key = null;
    this.sign = null;
  }

  /**
   * 用户key
   */
  public String getKey() {
    return this.key;
  }

  /**
   * 用户key
   */
  public AuthVO setKey(String key) {
    this.key = key;
    return this;
  }

  public void unsetKey() {
    this.key = null;
  }

  /** Returns true if field key is set (has been assigned a value) and false otherwise */
  public boolean isSetKey() {
    return this.key != null;
  }

  public void setKeyIsSet(boolean value) {
    if (!value) {
      this.key = null;
    }
  }

  /**
   * 用户签名  签名格式:md5(key+password)
   * 对用户的key password 进行md5加密，
   * key和password 会为每个渠道分配不同的值
   */
  public String getSign() {
    return this.sign;
  }

  /**
   * 用户签名  签名格式:md5(key+password)
   * 对用户的key password 进行md5加密，
   * key和password 会为每个渠道分配不同的值
   */
  public AuthVO setSign(String sign) {
    this.sign = sign;
    return this;
  }

  public void unsetSign() {
    this.sign = null;
  }

  /** Returns true if field sign is set (has been assigned a value) and false otherwise */
  public boolean isSetSign() {
    return this.sign != null;
  }

  public void setSignIsSet(boolean value) {
    if (!value) {
      this.sign = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEY:
      if (value == null) {
        unsetKey();
      } else {
        setKey((String)value);
      }
      break;

    case SIGN:
      if (value == null) {
        unsetSign();
      } else {
        setSign((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEY:
      return getKey();

    case SIGN:
      return getSign();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEY:
      return isSetKey();
    case SIGN:
      return isSetSign();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AuthVO)
      return this.equals((AuthVO)that);
    return false;
  }

  public boolean equals(AuthVO that) {
    if (that == null)
      return false;

    boolean this_present_key = true && this.isSetKey();
    boolean that_present_key = true && that.isSetKey();
    if (this_present_key || that_present_key) {
      if (!(this_present_key && that_present_key))
        return false;
      if (!this.key.equals(that.key))
        return false;
    }

    boolean this_present_sign = true && this.isSetSign();
    boolean that_present_sign = true && that.isSetSign();
    if (this_present_sign || that_present_sign) {
      if (!(this_present_sign && that_present_sign))
        return false;
      if (!this.sign.equals(that.sign))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_key = true && (isSetKey());
    list.add(present_key);
    if (present_key)
      list.add(key);

    boolean present_sign = true && (isSetSign());
    list.add(present_sign);
    if (present_sign)
      list.add(sign);

    return list.hashCode();
  }

  @Override
  public int compareTo(AuthVO other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKey()).compareTo(other.isSetKey());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKey()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.key, other.key);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSign()).compareTo(other.isSetSign());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSign()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.sign, other.sign);
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
    StringBuilder sb = new StringBuilder("AuthVO(");
    boolean first = true;

    sb.append("key:");
    if (this.key == null) {
      sb.append("null");
    } else {
      sb.append(this.key);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("sign:");
    if (this.sign == null) {
      sb.append("null");
    } else {
      sb.append(this.sign);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (key == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'key' was not present! Struct: " + toString());
    }
    if (sign == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'sign' was not present! Struct: " + toString());
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class AuthVOStandardSchemeFactory implements SchemeFactory {
    public AuthVOStandardScheme getScheme() {
      return new AuthVOStandardScheme();
    }
  }

  private static class AuthVOStandardScheme extends StandardScheme<AuthVO> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AuthVO struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEY
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.key = iprot.readString();
              struct.setKeyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SIGN
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.sign = iprot.readString();
              struct.setSignIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AuthVO struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.key != null) {
        oprot.writeFieldBegin(KEY_FIELD_DESC);
        oprot.writeString(struct.key);
        oprot.writeFieldEnd();
      }
      if (struct.sign != null) {
        oprot.writeFieldBegin(SIGN_FIELD_DESC);
        oprot.writeString(struct.sign);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AuthVOTupleSchemeFactory implements SchemeFactory {
    public AuthVOTupleScheme getScheme() {
      return new AuthVOTupleScheme();
    }
  }

  private static class AuthVOTupleScheme extends TupleScheme<AuthVO> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AuthVO struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeString(struct.key);
      oprot.writeString(struct.sign);
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AuthVO struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.key = iprot.readString();
      struct.setKeyIsSet(true);
      struct.sign = iprot.readString();
      struct.setSignIsSet(true);
    }
  }

}


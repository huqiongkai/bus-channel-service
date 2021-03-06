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
 * 根据外部订单号修改出票状态请求VO
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-03")
public class TChangeTicketStatusByExOrderIdReq implements org.apache.thrift.TBase<TChangeTicketStatusByExOrderIdReq, TChangeTicketStatusByExOrderIdReq._Fields>, java.io.Serializable, Cloneable, Comparable<TChangeTicketStatusByExOrderIdReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TChangeTicketStatusByExOrderIdReq");

  private static final org.apache.thrift.protocol.TField CHANNEL_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("channelId", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField EX_ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("exOrderId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TICKET_STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("ticketStatus", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userId", org.apache.thrift.protocol.TType.I64, (short)4);
  private static final org.apache.thrift.protocol.TField USER_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("userName", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TChangeTicketStatusByExOrderIdReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TChangeTicketStatusByExOrderIdReqTupleSchemeFactory());
  }

  /**
   * 购票的渠道id
   */
  public long channelId; // optional
  /**
   * 外部订单号
   */
  public String exOrderId; // optional
  /**
   * 需要修改为的订单状态
   */
  public String ticketStatus; // optional
  /**
   * 修改出票状态用户id
   */
  public long userId; // optional
  /**
   * 修改出票状态用户名称
   */
  public String userName; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 购票的渠道id
     */
    CHANNEL_ID((short)1, "channelId"),
    /**
     * 外部订单号
     */
    EX_ORDER_ID((short)2, "exOrderId"),
    /**
     * 需要修改为的订单状态
     */
    TICKET_STATUS((short)3, "ticketStatus"),
    /**
     * 修改出票状态用户id
     */
    USER_ID((short)4, "userId"),
    /**
     * 修改出票状态用户名称
     */
    USER_NAME((short)5, "userName");

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
        case 1: // CHANNEL_ID
          return CHANNEL_ID;
        case 2: // EX_ORDER_ID
          return EX_ORDER_ID;
        case 3: // TICKET_STATUS
          return TICKET_STATUS;
        case 4: // USER_ID
          return USER_ID;
        case 5: // USER_NAME
          return USER_NAME;
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
  private static final int __CHANNELID_ISSET_ID = 0;
  private static final int __USERID_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.CHANNEL_ID,_Fields.EX_ORDER_ID,_Fields.TICKET_STATUS,_Fields.USER_ID,_Fields.USER_NAME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.CHANNEL_ID, new org.apache.thrift.meta_data.FieldMetaData("channelId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.EX_ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("exOrderId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TICKET_STATUS, new org.apache.thrift.meta_data.FieldMetaData("ticketStatus", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.USER_NAME, new org.apache.thrift.meta_data.FieldMetaData("userName", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TChangeTicketStatusByExOrderIdReq.class, metaDataMap);
  }

  public TChangeTicketStatusByExOrderIdReq() {
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TChangeTicketStatusByExOrderIdReq(TChangeTicketStatusByExOrderIdReq other) {
    __isset_bitfield = other.__isset_bitfield;
    this.channelId = other.channelId;
    if (other.isSetExOrderId()) {
      this.exOrderId = other.exOrderId;
    }
    if (other.isSetTicketStatus()) {
      this.ticketStatus = other.ticketStatus;
    }
    this.userId = other.userId;
    if (other.isSetUserName()) {
      this.userName = other.userName;
    }
  }

  public TChangeTicketStatusByExOrderIdReq deepCopy() {
    return new TChangeTicketStatusByExOrderIdReq(this);
  }

  @Override
  public void clear() {
    setChannelIdIsSet(false);
    this.channelId = 0;
    this.exOrderId = null;
    this.ticketStatus = null;
    setUserIdIsSet(false);
    this.userId = 0;
    this.userName = null;
  }

  /**
   * 购票的渠道id
   */
  public long getChannelId() {
    return this.channelId;
  }

  /**
   * 购票的渠道id
   */
  public TChangeTicketStatusByExOrderIdReq setChannelId(long channelId) {
    this.channelId = channelId;
    setChannelIdIsSet(true);
    return this;
  }

  public void unsetChannelId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CHANNELID_ISSET_ID);
  }

  /** Returns true if field channelId is set (has been assigned a value) and false otherwise */
  public boolean isSetChannelId() {
    return EncodingUtils.testBit(__isset_bitfield, __CHANNELID_ISSET_ID);
  }

  public void setChannelIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CHANNELID_ISSET_ID, value);
  }

  /**
   * 外部订单号
   */
  public String getExOrderId() {
    return this.exOrderId;
  }

  /**
   * 外部订单号
   */
  public TChangeTicketStatusByExOrderIdReq setExOrderId(String exOrderId) {
    this.exOrderId = exOrderId;
    return this;
  }

  public void unsetExOrderId() {
    this.exOrderId = null;
  }

  /** Returns true if field exOrderId is set (has been assigned a value) and false otherwise */
  public boolean isSetExOrderId() {
    return this.exOrderId != null;
  }

  public void setExOrderIdIsSet(boolean value) {
    if (!value) {
      this.exOrderId = null;
    }
  }

  /**
   * 需要修改为的订单状态
   */
  public String getTicketStatus() {
    return this.ticketStatus;
  }

  /**
   * 需要修改为的订单状态
   */
  public TChangeTicketStatusByExOrderIdReq setTicketStatus(String ticketStatus) {
    this.ticketStatus = ticketStatus;
    return this;
  }

  public void unsetTicketStatus() {
    this.ticketStatus = null;
  }

  /** Returns true if field ticketStatus is set (has been assigned a value) and false otherwise */
  public boolean isSetTicketStatus() {
    return this.ticketStatus != null;
  }

  public void setTicketStatusIsSet(boolean value) {
    if (!value) {
      this.ticketStatus = null;
    }
  }

  /**
   * 修改出票状态用户id
   */
  public long getUserId() {
    return this.userId;
  }

  /**
   * 修改出票状态用户id
   */
  public TChangeTicketStatusByExOrderIdReq setUserId(long userId) {
    this.userId = userId;
    setUserIdIsSet(true);
    return this;
  }

  public void unsetUserId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userId is set (has been assigned a value) and false otherwise */
  public boolean isSetUserId() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  /**
   * 修改出票状态用户名称
   */
  public String getUserName() {
    return this.userName;
  }

  /**
   * 修改出票状态用户名称
   */
  public TChangeTicketStatusByExOrderIdReq setUserName(String userName) {
    this.userName = userName;
    return this;
  }

  public void unsetUserName() {
    this.userName = null;
  }

  /** Returns true if field userName is set (has been assigned a value) and false otherwise */
  public boolean isSetUserName() {
    return this.userName != null;
  }

  public void setUserNameIsSet(boolean value) {
    if (!value) {
      this.userName = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CHANNEL_ID:
      if (value == null) {
        unsetChannelId();
      } else {
        setChannelId((Long)value);
      }
      break;

    case EX_ORDER_ID:
      if (value == null) {
        unsetExOrderId();
      } else {
        setExOrderId((String)value);
      }
      break;

    case TICKET_STATUS:
      if (value == null) {
        unsetTicketStatus();
      } else {
        setTicketStatus((String)value);
      }
      break;

    case USER_ID:
      if (value == null) {
        unsetUserId();
      } else {
        setUserId((Long)value);
      }
      break;

    case USER_NAME:
      if (value == null) {
        unsetUserName();
      } else {
        setUserName((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CHANNEL_ID:
      return getChannelId();

    case EX_ORDER_ID:
      return getExOrderId();

    case TICKET_STATUS:
      return getTicketStatus();

    case USER_ID:
      return getUserId();

    case USER_NAME:
      return getUserName();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CHANNEL_ID:
      return isSetChannelId();
    case EX_ORDER_ID:
      return isSetExOrderId();
    case TICKET_STATUS:
      return isSetTicketStatus();
    case USER_ID:
      return isSetUserId();
    case USER_NAME:
      return isSetUserName();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TChangeTicketStatusByExOrderIdReq)
      return this.equals((TChangeTicketStatusByExOrderIdReq)that);
    return false;
  }

  public boolean equals(TChangeTicketStatusByExOrderIdReq that) {
    if (that == null)
      return false;

    boolean this_present_channelId = true && this.isSetChannelId();
    boolean that_present_channelId = true && that.isSetChannelId();
    if (this_present_channelId || that_present_channelId) {
      if (!(this_present_channelId && that_present_channelId))
        return false;
      if (this.channelId != that.channelId)
        return false;
    }

    boolean this_present_exOrderId = true && this.isSetExOrderId();
    boolean that_present_exOrderId = true && that.isSetExOrderId();
    if (this_present_exOrderId || that_present_exOrderId) {
      if (!(this_present_exOrderId && that_present_exOrderId))
        return false;
      if (!this.exOrderId.equals(that.exOrderId))
        return false;
    }

    boolean this_present_ticketStatus = true && this.isSetTicketStatus();
    boolean that_present_ticketStatus = true && that.isSetTicketStatus();
    if (this_present_ticketStatus || that_present_ticketStatus) {
      if (!(this_present_ticketStatus && that_present_ticketStatus))
        return false;
      if (!this.ticketStatus.equals(that.ticketStatus))
        return false;
    }

    boolean this_present_userId = true && this.isSetUserId();
    boolean that_present_userId = true && that.isSetUserId();
    if (this_present_userId || that_present_userId) {
      if (!(this_present_userId && that_present_userId))
        return false;
      if (this.userId != that.userId)
        return false;
    }

    boolean this_present_userName = true && this.isSetUserName();
    boolean that_present_userName = true && that.isSetUserName();
    if (this_present_userName || that_present_userName) {
      if (!(this_present_userName && that_present_userName))
        return false;
      if (!this.userName.equals(that.userName))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_channelId = true && (isSetChannelId());
    list.add(present_channelId);
    if (present_channelId)
      list.add(channelId);

    boolean present_exOrderId = true && (isSetExOrderId());
    list.add(present_exOrderId);
    if (present_exOrderId)
      list.add(exOrderId);

    boolean present_ticketStatus = true && (isSetTicketStatus());
    list.add(present_ticketStatus);
    if (present_ticketStatus)
      list.add(ticketStatus);

    boolean present_userId = true && (isSetUserId());
    list.add(present_userId);
    if (present_userId)
      list.add(userId);

    boolean present_userName = true && (isSetUserName());
    list.add(present_userName);
    if (present_userName)
      list.add(userName);

    return list.hashCode();
  }

  @Override
  public int compareTo(TChangeTicketStatusByExOrderIdReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetChannelId()).compareTo(other.isSetChannelId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetChannelId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.channelId, other.channelId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetExOrderId()).compareTo(other.isSetExOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.exOrderId, other.exOrderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTicketStatus()).compareTo(other.isSetTicketStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTicketStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.ticketStatus, other.ticketStatus);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserId()).compareTo(other.isSetUserId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userId, other.userId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUserName()).compareTo(other.isSetUserName());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserName()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userName, other.userName);
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
    StringBuilder sb = new StringBuilder("TChangeTicketStatusByExOrderIdReq(");
    boolean first = true;

    if (isSetChannelId()) {
      sb.append("channelId:");
      sb.append(this.channelId);
      first = false;
    }
    if (isSetExOrderId()) {
      if (!first) sb.append(", ");
      sb.append("exOrderId:");
      if (this.exOrderId == null) {
        sb.append("null");
      } else {
        sb.append(this.exOrderId);
      }
      first = false;
    }
    if (isSetTicketStatus()) {
      if (!first) sb.append(", ");
      sb.append("ticketStatus:");
      if (this.ticketStatus == null) {
        sb.append("null");
      } else {
        sb.append(this.ticketStatus);
      }
      first = false;
    }
    if (isSetUserId()) {
      if (!first) sb.append(", ");
      sb.append("userId:");
      sb.append(this.userId);
      first = false;
    }
    if (isSetUserName()) {
      if (!first) sb.append(", ");
      sb.append("userName:");
      if (this.userName == null) {
        sb.append("null");
      } else {
        sb.append(this.userName);
      }
      first = false;
    }
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

  private static class TChangeTicketStatusByExOrderIdReqStandardSchemeFactory implements SchemeFactory {
    public TChangeTicketStatusByExOrderIdReqStandardScheme getScheme() {
      return new TChangeTicketStatusByExOrderIdReqStandardScheme();
    }
  }

  private static class TChangeTicketStatusByExOrderIdReqStandardScheme extends StandardScheme<TChangeTicketStatusByExOrderIdReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TChangeTicketStatusByExOrderIdReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CHANNEL_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.channelId = iprot.readI64();
              struct.setChannelIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // EX_ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.exOrderId = iprot.readString();
              struct.setExOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TICKET_STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.ticketStatus = iprot.readString();
              struct.setTicketStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userId = iprot.readI64();
              struct.setUserIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // USER_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.userName = iprot.readString();
              struct.setUserNameIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TChangeTicketStatusByExOrderIdReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.isSetChannelId()) {
        oprot.writeFieldBegin(CHANNEL_ID_FIELD_DESC);
        oprot.writeI64(struct.channelId);
        oprot.writeFieldEnd();
      }
      if (struct.exOrderId != null) {
        if (struct.isSetExOrderId()) {
          oprot.writeFieldBegin(EX_ORDER_ID_FIELD_DESC);
          oprot.writeString(struct.exOrderId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.ticketStatus != null) {
        if (struct.isSetTicketStatus()) {
          oprot.writeFieldBegin(TICKET_STATUS_FIELD_DESC);
          oprot.writeString(struct.ticketStatus);
          oprot.writeFieldEnd();
        }
      }
      if (struct.isSetUserId()) {
        oprot.writeFieldBegin(USER_ID_FIELD_DESC);
        oprot.writeI64(struct.userId);
        oprot.writeFieldEnd();
      }
      if (struct.userName != null) {
        if (struct.isSetUserName()) {
          oprot.writeFieldBegin(USER_NAME_FIELD_DESC);
          oprot.writeString(struct.userName);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TChangeTicketStatusByExOrderIdReqTupleSchemeFactory implements SchemeFactory {
    public TChangeTicketStatusByExOrderIdReqTupleScheme getScheme() {
      return new TChangeTicketStatusByExOrderIdReqTupleScheme();
    }
  }

  private static class TChangeTicketStatusByExOrderIdReqTupleScheme extends TupleScheme<TChangeTicketStatusByExOrderIdReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TChangeTicketStatusByExOrderIdReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetChannelId()) {
        optionals.set(0);
      }
      if (struct.isSetExOrderId()) {
        optionals.set(1);
      }
      if (struct.isSetTicketStatus()) {
        optionals.set(2);
      }
      if (struct.isSetUserId()) {
        optionals.set(3);
      }
      if (struct.isSetUserName()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetChannelId()) {
        oprot.writeI64(struct.channelId);
      }
      if (struct.isSetExOrderId()) {
        oprot.writeString(struct.exOrderId);
      }
      if (struct.isSetTicketStatus()) {
        oprot.writeString(struct.ticketStatus);
      }
      if (struct.isSetUserId()) {
        oprot.writeI64(struct.userId);
      }
      if (struct.isSetUserName()) {
        oprot.writeString(struct.userName);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TChangeTicketStatusByExOrderIdReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.channelId = iprot.readI64();
        struct.setChannelIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.exOrderId = iprot.readString();
        struct.setExOrderIdIsSet(true);
      }
      if (incoming.get(2)) {
        struct.ticketStatus = iprot.readString();
        struct.setTicketStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.userId = iprot.readI64();
        struct.setUserIdIsSet(true);
      }
      if (incoming.get(4)) {
        struct.userName = iprot.readString();
        struct.setUserNameIsSet(true);
      }
    }
  }

}


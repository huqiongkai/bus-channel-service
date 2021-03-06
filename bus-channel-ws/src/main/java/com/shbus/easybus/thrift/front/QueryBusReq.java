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
 * 查询班次请求（注意如果需要缓存数据则 只需要输入出发站编号即可 建议刷新频率20分钟）
 */
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2015-12-31")
public class QueryBusReq implements org.apache.thrift.TBase<QueryBusReq, QueryBusReq._Fields>, java.io.Serializable, Cloneable, Comparable<QueryBusReq> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("QueryBusReq");

  private static final org.apache.thrift.protocol.TField AUTH_VO_FIELD_DESC = new org.apache.thrift.protocol.TField("authVO", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField UNIT_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("unitId", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField TO_STATION_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("toStationId", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField DEPART_DATEYYYY_MMDD_FIELD_DESC = new org.apache.thrift.protocol.TField("departDateyyyyMMdd", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField RT_ORDER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("rtOrderId", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField RT_ORDER_CODE_FIELD_DESC = new org.apache.thrift.protocol.TField("rtOrderCode", org.apache.thrift.protocol.TType.STRING, (short)6);
  private static final org.apache.thrift.protocol.TField INCLUDE_PKG_FIELD_DESC = new org.apache.thrift.protocol.TField("includePkg", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new QueryBusReqStandardSchemeFactory());
    schemes.put(TupleScheme.class, new QueryBusReqTupleSchemeFactory());
  }

  /**
   * 身份验证
   */
  public AuthVO authVO; // required
  /**
   * 出发车站编号 （必填）
   */
  public String unitId; // required
  /**
   * 到达车站编号（可不填，不填则查询所有线路）
   */
  public String toStationId; // optional
  /**
   * 出发日期 格式 yyyyMMdd（可不填，不填则查询所有日期的线路）
   */
  public String departDateyyyyMMdd; // optional
  /**
   * 线路唯一标示
   */
  public String rtOrderId; // optional
  /**
   * 车次编号
   */
  public String rtOrderCode; // optional
  /**
   * 是否包含打包产品 默认不包含打包产品   ONLYPKG:只包含打包产品  ONLYBUS：不包含打包产品   ALL:全部
   */
  public String includePkg; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 身份验证
     */
    AUTH_VO((short)1, "authVO"),
    /**
     * 出发车站编号 （必填）
     */
    UNIT_ID((short)2, "unitId"),
    /**
     * 到达车站编号（可不填，不填则查询所有线路）
     */
    TO_STATION_ID((short)3, "toStationId"),
    /**
     * 出发日期 格式 yyyyMMdd（可不填，不填则查询所有日期的线路）
     */
    DEPART_DATEYYYY_MMDD((short)4, "departDateyyyyMMdd"),
    /**
     * 线路唯一标示
     */
    RT_ORDER_ID((short)5, "rtOrderId"),
    /**
     * 车次编号
     */
    RT_ORDER_CODE((short)6, "rtOrderCode"),
    /**
     * 是否包含打包产品 默认不包含打包产品   ONLYPKG:只包含打包产品  ONLYBUS：不包含打包产品   ALL:全部
     */
    INCLUDE_PKG((short)7, "includePkg");

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
        case 1: // AUTH_VO
          return AUTH_VO;
        case 2: // UNIT_ID
          return UNIT_ID;
        case 3: // TO_STATION_ID
          return TO_STATION_ID;
        case 4: // DEPART_DATEYYYY_MMDD
          return DEPART_DATEYYYY_MMDD;
        case 5: // RT_ORDER_ID
          return RT_ORDER_ID;
        case 6: // RT_ORDER_CODE
          return RT_ORDER_CODE;
        case 7: // INCLUDE_PKG
          return INCLUDE_PKG;
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
  private static final _Fields optionals[] = {_Fields.TO_STATION_ID,_Fields.DEPART_DATEYYYY_MMDD,_Fields.RT_ORDER_ID,_Fields.RT_ORDER_CODE,_Fields.INCLUDE_PKG};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.AUTH_VO, new org.apache.thrift.meta_data.FieldMetaData("authVO", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, AuthVO.class)));
    tmpMap.put(_Fields.UNIT_ID, new org.apache.thrift.meta_data.FieldMetaData("unitId", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.TO_STATION_ID, new org.apache.thrift.meta_data.FieldMetaData("toStationId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.DEPART_DATEYYYY_MMDD, new org.apache.thrift.meta_data.FieldMetaData("departDateyyyyMMdd", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RT_ORDER_ID, new org.apache.thrift.meta_data.FieldMetaData("rtOrderId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RT_ORDER_CODE, new org.apache.thrift.meta_data.FieldMetaData("rtOrderCode", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.INCLUDE_PKG, new org.apache.thrift.meta_data.FieldMetaData("includePkg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(QueryBusReq.class, metaDataMap);
  }

  public QueryBusReq() {
  }

  public QueryBusReq(
    AuthVO authVO,
    String unitId)
  {
    this();
    this.authVO = authVO;
    this.unitId = unitId;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public QueryBusReq(QueryBusReq other) {
    if (other.isSetAuthVO()) {
      this.authVO = new AuthVO(other.authVO);
    }
    if (other.isSetUnitId()) {
      this.unitId = other.unitId;
    }
    if (other.isSetToStationId()) {
      this.toStationId = other.toStationId;
    }
    if (other.isSetDepartDateyyyyMMdd()) {
      this.departDateyyyyMMdd = other.departDateyyyyMMdd;
    }
    if (other.isSetRtOrderId()) {
      this.rtOrderId = other.rtOrderId;
    }
    if (other.isSetRtOrderCode()) {
      this.rtOrderCode = other.rtOrderCode;
    }
    if (other.isSetIncludePkg()) {
      this.includePkg = other.includePkg;
    }
  }

  public QueryBusReq deepCopy() {
    return new QueryBusReq(this);
  }

  @Override
  public void clear() {
    this.authVO = null;
    this.unitId = null;
    this.toStationId = null;
    this.departDateyyyyMMdd = null;
    this.rtOrderId = null;
    this.rtOrderCode = null;
    this.includePkg = null;
  }

  /**
   * 身份验证
   */
  public AuthVO getAuthVO() {
    return this.authVO;
  }

  /**
   * 身份验证
   */
  public QueryBusReq setAuthVO(AuthVO authVO) {
    this.authVO = authVO;
    return this;
  }

  public void unsetAuthVO() {
    this.authVO = null;
  }

  /** Returns true if field authVO is set (has been assigned a value) and false otherwise */
  public boolean isSetAuthVO() {
    return this.authVO != null;
  }

  public void setAuthVOIsSet(boolean value) {
    if (!value) {
      this.authVO = null;
    }
  }

  /**
   * 出发车站编号 （必填）
   */
  public String getUnitId() {
    return this.unitId;
  }

  /**
   * 出发车站编号 （必填）
   */
  public QueryBusReq setUnitId(String unitId) {
    this.unitId = unitId;
    return this;
  }

  public void unsetUnitId() {
    this.unitId = null;
  }

  /** Returns true if field unitId is set (has been assigned a value) and false otherwise */
  public boolean isSetUnitId() {
    return this.unitId != null;
  }

  public void setUnitIdIsSet(boolean value) {
    if (!value) {
      this.unitId = null;
    }
  }

  /**
   * 到达车站编号（可不填，不填则查询所有线路）
   */
  public String getToStationId() {
    return this.toStationId;
  }

  /**
   * 到达车站编号（可不填，不填则查询所有线路）
   */
  public QueryBusReq setToStationId(String toStationId) {
    this.toStationId = toStationId;
    return this;
  }

  public void unsetToStationId() {
    this.toStationId = null;
  }

  /** Returns true if field toStationId is set (has been assigned a value) and false otherwise */
  public boolean isSetToStationId() {
    return this.toStationId != null;
  }

  public void setToStationIdIsSet(boolean value) {
    if (!value) {
      this.toStationId = null;
    }
  }

  /**
   * 出发日期 格式 yyyyMMdd（可不填，不填则查询所有日期的线路）
   */
  public String getDepartDateyyyyMMdd() {
    return this.departDateyyyyMMdd;
  }

  /**
   * 出发日期 格式 yyyyMMdd（可不填，不填则查询所有日期的线路）
   */
  public QueryBusReq setDepartDateyyyyMMdd(String departDateyyyyMMdd) {
    this.departDateyyyyMMdd = departDateyyyyMMdd;
    return this;
  }

  public void unsetDepartDateyyyyMMdd() {
    this.departDateyyyyMMdd = null;
  }

  /** Returns true if field departDateyyyyMMdd is set (has been assigned a value) and false otherwise */
  public boolean isSetDepartDateyyyyMMdd() {
    return this.departDateyyyyMMdd != null;
  }

  public void setDepartDateyyyyMMddIsSet(boolean value) {
    if (!value) {
      this.departDateyyyyMMdd = null;
    }
  }

  /**
   * 线路唯一标示
   */
  public String getRtOrderId() {
    return this.rtOrderId;
  }

  /**
   * 线路唯一标示
   */
  public QueryBusReq setRtOrderId(String rtOrderId) {
    this.rtOrderId = rtOrderId;
    return this;
  }

  public void unsetRtOrderId() {
    this.rtOrderId = null;
  }

  /** Returns true if field rtOrderId is set (has been assigned a value) and false otherwise */
  public boolean isSetRtOrderId() {
    return this.rtOrderId != null;
  }

  public void setRtOrderIdIsSet(boolean value) {
    if (!value) {
      this.rtOrderId = null;
    }
  }

  /**
   * 车次编号
   */
  public String getRtOrderCode() {
    return this.rtOrderCode;
  }

  /**
   * 车次编号
   */
  public QueryBusReq setRtOrderCode(String rtOrderCode) {
    this.rtOrderCode = rtOrderCode;
    return this;
  }

  public void unsetRtOrderCode() {
    this.rtOrderCode = null;
  }

  /** Returns true if field rtOrderCode is set (has been assigned a value) and false otherwise */
  public boolean isSetRtOrderCode() {
    return this.rtOrderCode != null;
  }

  public void setRtOrderCodeIsSet(boolean value) {
    if (!value) {
      this.rtOrderCode = null;
    }
  }

  /**
   * 是否包含打包产品 默认不包含打包产品   ONLYPKG:只包含打包产品  ONLYBUS：不包含打包产品   ALL:全部
   */
  public String getIncludePkg() {
    return this.includePkg;
  }

  /**
   * 是否包含打包产品 默认不包含打包产品   ONLYPKG:只包含打包产品  ONLYBUS：不包含打包产品   ALL:全部
   */
  public QueryBusReq setIncludePkg(String includePkg) {
    this.includePkg = includePkg;
    return this;
  }

  public void unsetIncludePkg() {
    this.includePkg = null;
  }

  /** Returns true if field includePkg is set (has been assigned a value) and false otherwise */
  public boolean isSetIncludePkg() {
    return this.includePkg != null;
  }

  public void setIncludePkgIsSet(boolean value) {
    if (!value) {
      this.includePkg = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case AUTH_VO:
      if (value == null) {
        unsetAuthVO();
      } else {
        setAuthVO((AuthVO)value);
      }
      break;

    case UNIT_ID:
      if (value == null) {
        unsetUnitId();
      } else {
        setUnitId((String)value);
      }
      break;

    case TO_STATION_ID:
      if (value == null) {
        unsetToStationId();
      } else {
        setToStationId((String)value);
      }
      break;

    case DEPART_DATEYYYY_MMDD:
      if (value == null) {
        unsetDepartDateyyyyMMdd();
      } else {
        setDepartDateyyyyMMdd((String)value);
      }
      break;

    case RT_ORDER_ID:
      if (value == null) {
        unsetRtOrderId();
      } else {
        setRtOrderId((String)value);
      }
      break;

    case RT_ORDER_CODE:
      if (value == null) {
        unsetRtOrderCode();
      } else {
        setRtOrderCode((String)value);
      }
      break;

    case INCLUDE_PKG:
      if (value == null) {
        unsetIncludePkg();
      } else {
        setIncludePkg((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case AUTH_VO:
      return getAuthVO();

    case UNIT_ID:
      return getUnitId();

    case TO_STATION_ID:
      return getToStationId();

    case DEPART_DATEYYYY_MMDD:
      return getDepartDateyyyyMMdd();

    case RT_ORDER_ID:
      return getRtOrderId();

    case RT_ORDER_CODE:
      return getRtOrderCode();

    case INCLUDE_PKG:
      return getIncludePkg();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case AUTH_VO:
      return isSetAuthVO();
    case UNIT_ID:
      return isSetUnitId();
    case TO_STATION_ID:
      return isSetToStationId();
    case DEPART_DATEYYYY_MMDD:
      return isSetDepartDateyyyyMMdd();
    case RT_ORDER_ID:
      return isSetRtOrderId();
    case RT_ORDER_CODE:
      return isSetRtOrderCode();
    case INCLUDE_PKG:
      return isSetIncludePkg();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof QueryBusReq)
      return this.equals((QueryBusReq)that);
    return false;
  }

  public boolean equals(QueryBusReq that) {
    if (that == null)
      return false;

    boolean this_present_authVO = true && this.isSetAuthVO();
    boolean that_present_authVO = true && that.isSetAuthVO();
    if (this_present_authVO || that_present_authVO) {
      if (!(this_present_authVO && that_present_authVO))
        return false;
      if (!this.authVO.equals(that.authVO))
        return false;
    }

    boolean this_present_unitId = true && this.isSetUnitId();
    boolean that_present_unitId = true && that.isSetUnitId();
    if (this_present_unitId || that_present_unitId) {
      if (!(this_present_unitId && that_present_unitId))
        return false;
      if (!this.unitId.equals(that.unitId))
        return false;
    }

    boolean this_present_toStationId = true && this.isSetToStationId();
    boolean that_present_toStationId = true && that.isSetToStationId();
    if (this_present_toStationId || that_present_toStationId) {
      if (!(this_present_toStationId && that_present_toStationId))
        return false;
      if (!this.toStationId.equals(that.toStationId))
        return false;
    }

    boolean this_present_departDateyyyyMMdd = true && this.isSetDepartDateyyyyMMdd();
    boolean that_present_departDateyyyyMMdd = true && that.isSetDepartDateyyyyMMdd();
    if (this_present_departDateyyyyMMdd || that_present_departDateyyyyMMdd) {
      if (!(this_present_departDateyyyyMMdd && that_present_departDateyyyyMMdd))
        return false;
      if (!this.departDateyyyyMMdd.equals(that.departDateyyyyMMdd))
        return false;
    }

    boolean this_present_rtOrderId = true && this.isSetRtOrderId();
    boolean that_present_rtOrderId = true && that.isSetRtOrderId();
    if (this_present_rtOrderId || that_present_rtOrderId) {
      if (!(this_present_rtOrderId && that_present_rtOrderId))
        return false;
      if (!this.rtOrderId.equals(that.rtOrderId))
        return false;
    }

    boolean this_present_rtOrderCode = true && this.isSetRtOrderCode();
    boolean that_present_rtOrderCode = true && that.isSetRtOrderCode();
    if (this_present_rtOrderCode || that_present_rtOrderCode) {
      if (!(this_present_rtOrderCode && that_present_rtOrderCode))
        return false;
      if (!this.rtOrderCode.equals(that.rtOrderCode))
        return false;
    }

    boolean this_present_includePkg = true && this.isSetIncludePkg();
    boolean that_present_includePkg = true && that.isSetIncludePkg();
    if (this_present_includePkg || that_present_includePkg) {
      if (!(this_present_includePkg && that_present_includePkg))
        return false;
      if (!this.includePkg.equals(that.includePkg))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_authVO = true && (isSetAuthVO());
    list.add(present_authVO);
    if (present_authVO)
      list.add(authVO);

    boolean present_unitId = true && (isSetUnitId());
    list.add(present_unitId);
    if (present_unitId)
      list.add(unitId);

    boolean present_toStationId = true && (isSetToStationId());
    list.add(present_toStationId);
    if (present_toStationId)
      list.add(toStationId);

    boolean present_departDateyyyyMMdd = true && (isSetDepartDateyyyyMMdd());
    list.add(present_departDateyyyyMMdd);
    if (present_departDateyyyyMMdd)
      list.add(departDateyyyyMMdd);

    boolean present_rtOrderId = true && (isSetRtOrderId());
    list.add(present_rtOrderId);
    if (present_rtOrderId)
      list.add(rtOrderId);

    boolean present_rtOrderCode = true && (isSetRtOrderCode());
    list.add(present_rtOrderCode);
    if (present_rtOrderCode)
      list.add(rtOrderCode);

    boolean present_includePkg = true && (isSetIncludePkg());
    list.add(present_includePkg);
    if (present_includePkg)
      list.add(includePkg);

    return list.hashCode();
  }

  @Override
  public int compareTo(QueryBusReq other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAuthVO()).compareTo(other.isSetAuthVO());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAuthVO()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.authVO, other.authVO);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetUnitId()).compareTo(other.isSetUnitId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUnitId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.unitId, other.unitId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetToStationId()).compareTo(other.isSetToStationId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetToStationId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.toStationId, other.toStationId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDepartDateyyyyMMdd()).compareTo(other.isSetDepartDateyyyyMMdd());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDepartDateyyyyMMdd()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.departDateyyyyMMdd, other.departDateyyyyMMdd);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRtOrderId()).compareTo(other.isSetRtOrderId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRtOrderId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rtOrderId, other.rtOrderId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRtOrderCode()).compareTo(other.isSetRtOrderCode());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRtOrderCode()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rtOrderCode, other.rtOrderCode);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIncludePkg()).compareTo(other.isSetIncludePkg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIncludePkg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.includePkg, other.includePkg);
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
    StringBuilder sb = new StringBuilder("QueryBusReq(");
    boolean first = true;

    sb.append("authVO:");
    if (this.authVO == null) {
      sb.append("null");
    } else {
      sb.append(this.authVO);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("unitId:");
    if (this.unitId == null) {
      sb.append("null");
    } else {
      sb.append(this.unitId);
    }
    first = false;
    if (isSetToStationId()) {
      if (!first) sb.append(", ");
      sb.append("toStationId:");
      if (this.toStationId == null) {
        sb.append("null");
      } else {
        sb.append(this.toStationId);
      }
      first = false;
    }
    if (isSetDepartDateyyyyMMdd()) {
      if (!first) sb.append(", ");
      sb.append("departDateyyyyMMdd:");
      if (this.departDateyyyyMMdd == null) {
        sb.append("null");
      } else {
        sb.append(this.departDateyyyyMMdd);
      }
      first = false;
    }
    if (isSetRtOrderId()) {
      if (!first) sb.append(", ");
      sb.append("rtOrderId:");
      if (this.rtOrderId == null) {
        sb.append("null");
      } else {
        sb.append(this.rtOrderId);
      }
      first = false;
    }
    if (isSetRtOrderCode()) {
      if (!first) sb.append(", ");
      sb.append("rtOrderCode:");
      if (this.rtOrderCode == null) {
        sb.append("null");
      } else {
        sb.append(this.rtOrderCode);
      }
      first = false;
    }
    if (isSetIncludePkg()) {
      if (!first) sb.append(", ");
      sb.append("includePkg:");
      if (this.includePkg == null) {
        sb.append("null");
      } else {
        sb.append(this.includePkg);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (authVO == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'authVO' was not present! Struct: " + toString());
    }
    if (unitId == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'unitId' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (authVO != null) {
      authVO.validate();
    }
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

  private static class QueryBusReqStandardSchemeFactory implements SchemeFactory {
    public QueryBusReqStandardScheme getScheme() {
      return new QueryBusReqStandardScheme();
    }
  }

  private static class QueryBusReqStandardScheme extends StandardScheme<QueryBusReq> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, QueryBusReq struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // AUTH_VO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.authVO = new AuthVO();
              struct.authVO.read(iprot);
              struct.setAuthVOIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // UNIT_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.unitId = iprot.readString();
              struct.setUnitIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // TO_STATION_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.toStationId = iprot.readString();
              struct.setToStationIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // DEPART_DATEYYYY_MMDD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.departDateyyyyMMdd = iprot.readString();
              struct.setDepartDateyyyyMMddIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RT_ORDER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rtOrderId = iprot.readString();
              struct.setRtOrderIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RT_ORDER_CODE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.rtOrderCode = iprot.readString();
              struct.setRtOrderCodeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // INCLUDE_PKG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.includePkg = iprot.readString();
              struct.setIncludePkgIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, QueryBusReq struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.authVO != null) {
        oprot.writeFieldBegin(AUTH_VO_FIELD_DESC);
        struct.authVO.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.unitId != null) {
        oprot.writeFieldBegin(UNIT_ID_FIELD_DESC);
        oprot.writeString(struct.unitId);
        oprot.writeFieldEnd();
      }
      if (struct.toStationId != null) {
        if (struct.isSetToStationId()) {
          oprot.writeFieldBegin(TO_STATION_ID_FIELD_DESC);
          oprot.writeString(struct.toStationId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.departDateyyyyMMdd != null) {
        if (struct.isSetDepartDateyyyyMMdd()) {
          oprot.writeFieldBegin(DEPART_DATEYYYY_MMDD_FIELD_DESC);
          oprot.writeString(struct.departDateyyyyMMdd);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rtOrderId != null) {
        if (struct.isSetRtOrderId()) {
          oprot.writeFieldBegin(RT_ORDER_ID_FIELD_DESC);
          oprot.writeString(struct.rtOrderId);
          oprot.writeFieldEnd();
        }
      }
      if (struct.rtOrderCode != null) {
        if (struct.isSetRtOrderCode()) {
          oprot.writeFieldBegin(RT_ORDER_CODE_FIELD_DESC);
          oprot.writeString(struct.rtOrderCode);
          oprot.writeFieldEnd();
        }
      }
      if (struct.includePkg != null) {
        if (struct.isSetIncludePkg()) {
          oprot.writeFieldBegin(INCLUDE_PKG_FIELD_DESC);
          oprot.writeString(struct.includePkg);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class QueryBusReqTupleSchemeFactory implements SchemeFactory {
    public QueryBusReqTupleScheme getScheme() {
      return new QueryBusReqTupleScheme();
    }
  }

  private static class QueryBusReqTupleScheme extends TupleScheme<QueryBusReq> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, QueryBusReq struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.authVO.write(oprot);
      oprot.writeString(struct.unitId);
      BitSet optionals = new BitSet();
      if (struct.isSetToStationId()) {
        optionals.set(0);
      }
      if (struct.isSetDepartDateyyyyMMdd()) {
        optionals.set(1);
      }
      if (struct.isSetRtOrderId()) {
        optionals.set(2);
      }
      if (struct.isSetRtOrderCode()) {
        optionals.set(3);
      }
      if (struct.isSetIncludePkg()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetToStationId()) {
        oprot.writeString(struct.toStationId);
      }
      if (struct.isSetDepartDateyyyyMMdd()) {
        oprot.writeString(struct.departDateyyyyMMdd);
      }
      if (struct.isSetRtOrderId()) {
        oprot.writeString(struct.rtOrderId);
      }
      if (struct.isSetRtOrderCode()) {
        oprot.writeString(struct.rtOrderCode);
      }
      if (struct.isSetIncludePkg()) {
        oprot.writeString(struct.includePkg);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, QueryBusReq struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.authVO = new AuthVO();
      struct.authVO.read(iprot);
      struct.setAuthVOIsSet(true);
      struct.unitId = iprot.readString();
      struct.setUnitIdIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.toStationId = iprot.readString();
        struct.setToStationIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.departDateyyyyMMdd = iprot.readString();
        struct.setDepartDateyyyyMMddIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rtOrderId = iprot.readString();
        struct.setRtOrderIdIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rtOrderCode = iprot.readString();
        struct.setRtOrderCodeIsSet(true);
      }
      if (incoming.get(4)) {
        struct.includePkg = iprot.readString();
        struct.setIncludePkgIsSet(true);
      }
    }
  }

}


package com.shbus.easybus.utils;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
 

public class ValueCollection {
	private static final long serialVersionUID = 1L;
	private static Map<String,Set<String>> allValueItemMapSetOrder = new Hashtable<String,Set<String>>();
	private static String buildKeyWithTablenameFieldNameFieldvalue(String tablename,String fieldname,String valuecode)
	{
		return tablename+"|"+fieldname+"|"+valuecode;
	}
	private static String buildKeyWithTablenameFieldName(String tablename,String fieldname)
	{
		return tablename+"|"+fieldname;
	}
	static
	{
		/*
		Properties p = new Properties();
		InputStream in = UnitIdConst.class.getResourceAsStream("ValueCollection.properties");
		if(in==null)//如果找不到busUnitidList.properties 读取默认的配置文件
		{
			throw new RuntimeException("找不到配置文件 ValueCollection.properties");
		}
		Properties p1 = new Properties();
		InputStream in1 = UnitIdConst.class.getResourceAsStream("ValueCollectionOrder.properties");
		if(in==null)//如果找不到busUnitidList.properties 读取默认的配置文件
		{
			throw new RuntimeException("找不到配置文件 ValueCollectionOrder.properties");
		}
		try {
			p.load(in);
			p1.load(in1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		Set<String> keys = p.stringPropertyNames();
		for(String k:keys)
		{
			//k 格式 TABLE_NAME,FIELD_NAME,FIELD_VALUE = FIELD_DESC
			String[] karray = k.split(","); 
			String TABLE_NAME = karray[0];
			String FIELD_NAME = karray[1];
			String FIELD_VALUE = karray[2];
			String FIELD_DESC = p.getProperty(k); 
			SysFieldValue valueitem = new SysFieldValue();
			valueitem.setFieldName(FIELD_NAME);
			valueitem.setTableName(TABLE_NAME);
			valueitem.setValid("Y");
			valueitem.setValueCode(FIELD_VALUE);
			valueitem.setValueDesc(FIELD_DESC);
			String kk1 = buildKeyWithTablenameFieldNameFieldvalue(TABLE_NAME,FIELD_NAME,FIELD_VALUE);
			String kk2 = buildKeyWithTablenameFieldName(TABLE_NAME,FIELD_NAME);
			allValueItemMap.put(kk1, valueitem);
			if(!allValueItemMapSet.containsKey(kk2))
				allValueItemMapSet.put(kk2, new HashSet<SysFieldValue>());
			allValueItemMapSet.get(kk2).add(valueitem);
		}
		Set<String> keys1 = p1.stringPropertyNames();
		for(String k1:keys1)
		{
			allValueItemMapSetOrder.get(k1).addAll(new HashSet<String>(Arrays.asList(p1.get(k1).toString().split(","))));
		}
		*/
	}
	public static class ValueConst
	{
		/**
		 * 团队截止报名状态
		 */
		public final static String P_TEAM_STATUS_END="END"; 
		/**
		 * 正常报名状态
		 */
		public final static String P_TEAM_STATUS_BEGIN="BEGIN"; 
		/**
		 * 团队类型 普通团
		 */
		public final static String P_TEAM_TEAM_TYPE_COMMON="COMMON";
	}
	/**
	 * 车票订单退票状态
	 * @author lixun-dell
	 *
	 */
	public static enum TicketRefundStatus
	{
		NONE("无申请"),APP("处理中"),FAIL("失败"),SUC("成功");
		private String description;
		private TicketRefundStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		
	}
	/**
	 * 车票订单取票状态
	 * @author lixun-dell
	 *
	 */
	public static enum TicketRecStatus
	{
		YES("已取"),NO("未取");
		private String description;
		private TicketRecStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 车票订单出票状态
	 * @author lixun-dell
	 *
	 */
	public static enum TicketStatus
	{
		NONE("无申请"),APP("处理中"),FAIL("失败"),SUC("成功");
		private String description;
		private TicketStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 线路可用状态
	 * @author lixun-dell
	 *
	 */
	public static enum StationTravellineStatus
	{
		YES("可用"),NO("不可用");
		private String description;
		private StationTravellineStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 车票系统代码
	 * @author lixun-dell
	 *
	 */
	public static enum SysCode
	{
		X("西站小系统"),J("交港局系统"),PKG("打包系统");
		private String description;
		private SysCode(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 有效性代码
	 * @author lixun-dell
	 *
	 */
	public static enum Valid{
		Y("有效"),N("无效");
		private String description;
		private Valid(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 打包线路上下线状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusPkg_PkgStatus{
		Y("上线"),N("下线");
		private String description;
		private ExBusPkg_PkgStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 元素类型
	 * @author lixun-dell
	 *
	 */
	public static enum ExEle_ExType{
		HTL("酒店"),
		FLT("机票"),
		SPOT_TICKET("景点门票"),
		TRAIN("火车"),
		CAR_RENT("租车"),
		BOAT("轮船"),
		MEAL("餐饮"),
		TRAVEL("旅游产品"),
		GOLF("高尔夫"),
		BUS("车票"),
		DAY_USE("日常用品");
		private String description;
		private ExEle_ExType(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 打包元素对应的tablename
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusPkgEle_TableName{
		EX_ELE("元素库存"),EX_BUS_TEAM("汽车票");
		private String description;
		private ExBusPkgEle_TableName(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	} 
	/**
	 * 打包元素对应的tablename
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusPkg_SalePriceCalType{
		BUS("等于车票价格"),ORIGN("实际结算价");
		private String description;
		private ExBusPkg_SalePriceCalType(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	} 
	/**
	 * 套餐状态
	 * @author lixun-dell
	 *
	 */
	public static enum PkgStatus{
		Y("上线"),N("下线");
		private String description;
		private PkgStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 打包订单总体状态
	 * @author lixun-dell
	 *
	 */
	public static enum PkgOrderStatus{
		NONE("无申请"),APP("处理中"),FAIL("失败"),SUC("成功");
		private String description;
		private PkgOrderStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	public static enum TicketUseStatusSynStatus{
		NONE("无"),APP("处理中"),FAIL("失败"),SUC("成功");
		private String description;
		private TicketUseStatusSynStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 订单元素使用状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusOrderEle_EleUseStatus{
		USED("已使用"),UNUSED("未使用");
		private String description;
		private ExBusOrderEle_EleUseStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 元素使用方式
	 * @author lixun-dell
	 *
	 */
	public static enum ExEle_UseType{
		RANDOM_CODE("随机码"),CERTIFICATE("证件"),BUS_TICKET("凭借车票票根");
		private String description;
		private ExEle_UseType(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 订单元素取票状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusOrderEle_EleRecStatus{
		YES("已取"),NO("未取");
		private String description;
		private ExBusOrderEle_EleRecStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 订单元素元素处理状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusOrderEle_EleStatus{
		WAIT_PRE("等待前序操作"),NONE("无申请"),APP("处理中"),FAIL("失败"),SUC("成功");
		private String description;
		private ExBusOrderEle_EleStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 车票使用状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusOrder_TicketUseStatus{
		NONE("未出票"),CHECKED("已检票"), SALE("已出票未检"), REFUND("已退票"), INVALID("已废票"),  CHANGE("已改签"), REPLACE("已补票");
		private String description;
		private ExBusOrder_TicketUseStatus(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 车票使用状态
	 * @author lixun-dell
	 *
	 */
	public static enum ExBusOrder_IsTestOrder{
		Y("测试"),N("正式");
		private String description;
		private ExBusOrder_IsTestOrder(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	public static enum SMS_TYPE{
		FAIL("失败短息"),SUC("成功短信");
		private String description;
		private SMS_TYPE(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	public static enum SettlementType{
		DIRECT_BUSSTATION("直接跟车站结算"),BUSSTATION1CARRIER2("车站先结算车队后返"),ELESUPPLIER("与元素供应商结算");
		private String description;
		private SettlementType(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	/**
	 * 元素的确认方式
	 * @author lixun-dell
	 *
	 */
	public static enum ExEle_ConfirmType{
		AUTO("自动确认"),MANUAL("人工确认");
		private String description;
		private ExEle_ConfirmType(String description)
		{
			this.description = description;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
	}
	public static Map<String,String> describeEnum(Class cls) 
	{
		Map<String,String> map = new HashMap<String,String>(); 
		try {
			Method description = cls.getMethod("getDescription");  
			Object[] objs = cls.getEnumConstants();
			 for (Object obj : objs) { 
			     map.put(obj.toString(),(String)description.invoke(obj)); 
			 }
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}  
		return map;
	}
	public static String getDescription(String enumClsName,String enumval) throws ClassNotFoundException
	{
		Map<String,String> m = describeEnum(Class.forName(enumClsName));
		return m.get(enumval);
	}
}

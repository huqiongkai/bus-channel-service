package com.shbus.easybus.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.shbus.easybus.thrift.front.UnitIdConstants;

public class StationMappingSysChinaRegion {
	private static final long serialVersionUID = 1L;
	
	/**
	 *  key 为外部的stationid value : 区域六字码
	 */
	protected static Map<String,String> stationIdMapSysChinaRegion6Code= new Hashtable<String,String>();
	/**
	 *  value 为外部的stationid key : 区域六字码
	 */
	protected static Map<String,String> sysChinaRegion6CodeMapStationId= new Hashtable<String,String>();
	static
	{
		Properties p = new Properties();
		InputStream in = UnitIdConstants.class.getResourceAsStream("/StationMappingSysChinaRegion.properties");
		if(in==null)
		{ 
			throw new RuntimeException("找不到配置文件 StationMappingSysChinaRegion.properties"); 
		}
		try {
			p.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
		Set<String> keys = p.stringPropertyNames();
		for(String k:keys)
		{
			stationIdMapSysChinaRegion6Code.put(k, p.getProperty(k));
			sysChinaRegion6CodeMapStationId.put(p.getProperty(k),k);
		}
	}
	public static String concatAllStationIds() {
		StringBuilder builder = new StringBuilder();
		final String idSeparator = ",";
		final String yh = "'";
		for (String k : stationIdMapSysChinaRegion6Code.keySet()) {
			builder.append(yh).append(k).append(yh).append(idSeparator);
		}
		return builder.toString();
	}
	public static List<String> getStationRegion6CodeList() {
		List<String> list = new ArrayList<String>();
		list.addAll(sysChinaRegion6CodeMapStationId.keySet());
		return list;
	}
	public static Set<String> getAllStationId()
	{
		return stationIdMapSysChinaRegion6Code.keySet();
	}
	public static String getStationIdByRegionCode(String regioncode)
	{
		return sysChinaRegion6CodeMapStationId.get(regioncode);
	}
	public static String getRegionCodeByStationId(String stationid)
	{
		return stationIdMapSysChinaRegion6Code.get(stationid);
	}
}

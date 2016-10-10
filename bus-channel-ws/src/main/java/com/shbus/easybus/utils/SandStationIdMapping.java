/**
 * 
 */
package com.shbus.easybus.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.logging.LogFactory;

import com.shbus.easybus.thrift.front.UnitIdConstants;

/**
 * @author Administrator
 *
 */
public class SandStationIdMapping {
	
	private static Map<String, String> stationIdMappings = new HashMap<String, String>();
	private static Map<String, String> sandStationIdMappings = new HashMap<String, String>();
	
	static {
		Properties p = new Properties();
		try {
			p.load(new InputStreamReader(
					UnitIdConstants.class.getResourceAsStream("/sandStationIdMapping.properties"), "UTF-8"));
		} catch (IOException e) {
			LogFactory.getLog(UnitIdConstants.class).fatal("sandStationIdMapping.properties load error", e);
			throw new RuntimeException(e);
		}
		Set<String> keys = p.stringPropertyNames();
		for (String k : keys) {
			stationIdMappings.put(k, p.getProperty(k));
			sandStationIdMappings.put(p.getProperty(k), k);
		}
	}
	
	public static String getSandStationId(String k) {
		return stationIdMappings.get(k);
	}
	
	public static String getBusStationId(String sandKey) {
		return sandStationIdMappings.get(sandKey);
	}
	
}

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
public class StationNameRegionMapping {
	private static Map<String, String> stationNameRegion6CodeMappings = new HashMap<String, String>();

	static {
		Properties p = new Properties();
		try {
			p.load(new InputStreamReader(
					UnitIdConstants.class.getResourceAsStream("/stationName_region6Code_mapping.properties"), "UTF-8"));
		} catch (IOException e) {
			LogFactory.getLog(UnitIdConstants.class).fatal("stationName_region6Code_mapping.properties load error", e);
			throw new RuntimeException(e);
		}
		Set<String> keys = p.stringPropertyNames();
		for (String k : keys) {
			stationNameRegion6CodeMappings.put(k, p.getProperty(k));
		}
	}

	public static String getRegion6Code(String stationName) {
		return stationNameRegion6CodeMappings.get(stationName);
	}
}

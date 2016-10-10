/**
 * 
 */
package com.shbus.easybus.utils;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;

import com.shbus.easybus.thrift.front.UnitIdConstants;

/**
 * @author Administrator
 *
 */
public class SandBusStations {

	private static List<SandStation> stationList = new ArrayList<SandStation>();

	static class SandStation {
		String id;
		String shortName;

		public SandStation(String id, String shortName) {
			this.id = id;
			this.shortName = shortName;
		}
	}

	static {
		Properties p = new Properties();
		try {
			p.load(new InputStreamReader(
					UnitIdConstants.class.getResourceAsStream("/sandStationIdNameMapping.properties"), "UTF-8"));
		} catch (IOException e) {
			LogFactory.getLog(UnitIdConstants.class).fatal("sandStationIdNameMapping.properties load error", e);
			throw new RuntimeException(e);
		}
		Set<String> keys = p.stringPropertyNames();
		for (String k : keys) {
			stationList.add(new SandStation(k, p.getProperty(k)));
		}
	}

	public static String getStationIdByName(String stationName) {
		String statId = null;
		if (StringUtils.isNotBlank(stationName)) {
			for (SandStation stat : stationList) {
				String statName = stat.shortName;
				if (StringUtils.isNotBlank(statName) && stationName.contains(statName)) {
					statId = stat.id;
				}
			}
		}
		return statId;
	}

}

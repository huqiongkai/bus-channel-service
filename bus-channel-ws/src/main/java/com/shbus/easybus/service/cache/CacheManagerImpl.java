/**
 * 
 */
package com.shbus.easybus.service.cache;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.service.back.SandBusDetailVO;
import com.shbus.easybus.service.db.DBManager;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;
import com.shbus.easybus.utils.StationMappingSysChinaRegion;
import com.shbus.easybus.utils.StationNameRegionMapping;
import com.whalin.MemCached.MemCachedClient;

/**
 * @author Administrator
 *
 */
public class CacheManagerImpl implements ICacheManager {
	private Log log = LogFactory.getLog(CacheManagerImpl.class);
	
	private MemCachedClient memcachedClient;
	private DBManager dbManager;
	private String regionCacheTestKey;	// region6Code

	public final String CACHE_KEY_PREFIX_SYS_CHINA_REGION = "orcl.region.";
	public final String CACHE_KEY_PREFIX_SAND_BUS = "sandws.bus.";
	public final String CACHE_KEY_PREFIX_SAND_BUS_DETAIL = "sandws.busdetail.";
	public final String CACHE_KEY_SEPARATOR_DOT = ".";
	
	public void setMemcachedClient(MemCachedClient memcachedClient) {
		this.memcachedClient = memcachedClient;
	}

	public void setRegionCacheTestKey(String regionCacheTestKey) {
		this.regionCacheTestKey = regionCacheTestKey;
	}

	public void setDbManager(DBManager dbManager) {
		this.dbManager = dbManager;
		
//		System.out.println(StationMappingSysChinaRegion.concatAllStationIds());
		
		if (! memcachedClient.keyExists(CACHE_KEY_PREFIX_SYS_CHINA_REGION + regionCacheTestKey)) {
			buildCacheForSysChinaRegion();
		} else {
			log.info("SysChinaRegion already persisted in memcached server, skip buildCacheForSysChinaRegion().");
		}
		
		refreshAllMemKeySet();
	}

	// ----------------------- utility methods for memcached communication ---------
	private Set<String> allMemKeys = new HashSet<String>();
	
	@Override
	public List<String> getAllMemKeys() {
		List<String> list = new ArrayList<String>();
		
		Map<String, Map<String, String>> items = memcachedClient.statsItems();
		for (Iterator<String> itemIt = items.keySet().iterator(); itemIt.hasNext();) {
			String itemKey = itemIt.next();
			Map<String, String> maps = items.get(itemKey);
			for (Iterator<String> mapsIt = maps.keySet().iterator(); mapsIt.hasNext();) {
				String mapsKey = mapsIt.next();
				String mapsValue = maps.get(mapsKey);
				if (mapsKey.endsWith("number")) {
					String[] arr = mapsKey.split(":");
					int slabNumber = Integer.valueOf(arr[1].trim());
					int limit = Integer.valueOf(mapsValue.trim());
					Map<String, Map<String, String>> dumpMaps = memcachedClient.statsCacheDump(slabNumber, limit);
					for (Iterator<String> dumpIt = dumpMaps.keySet().iterator(); dumpIt.hasNext();) {
						String dumpKey = dumpIt.next();
						Map<String, String> allMap = dumpMaps.get(dumpKey);
						for (Iterator<String> allIt = allMap.keySet().iterator(); allIt.hasNext();) {
							String allKey = allIt.next();
							list.add(allKey.trim());
						}
					}
				}
			}
		}
		
		return list;
	}
	
	private List<String> getBusMemKeysBeforeDate(String departDateyyyyMMdd) {
		List<String> resultList = new ArrayList<String>();
		for (String key : allMemKeys) {
			if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS)) {
				String keyDepartDate = key.substring(key.lastIndexOf(CACHE_KEY_SEPARATOR_DOT) + 1);
				if (keyDepartDate.compareTo(departDateyyyyMMdd) < 0) {
					resultList.add(key);
				}
			} else if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS_DETAIL)) {
				int beginIndex = CACHE_KEY_PREFIX_SAND_BUS_DETAIL.length();
				String busDetailDepartDay = key.substring(beginIndex, beginIndex + 8);
				if (busDetailDepartDay.compareTo(departDateyyyyMMdd) < 0) {
					resultList.add(key);
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 获取出发站unitId相关的所有cache key
	 * 
	 * @param unitId
	 * @return
	 */
	private List<String> getBusMemKeysByUnitId(String unitId) {
		List<String> resultList = new ArrayList<String>();
		if (StringUtils.isNotBlank(unitId)) {
			unitId = unitId.trim();
			for (String key : allMemKeys) {
				if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS + unitId + CACHE_KEY_SEPARATOR_DOT)) {
					resultList.add(key);
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 获取出发站指定日期的所有cache key
	 * 
	 * @param unitId
	 * @param departDateyyyyMMdd
	 * @return
	 */
	private List<String> getBusMemKeysByUnitIdAndDepartDay(String unitId, String departDateyyyyMMdd) {
		List<String> resultList = new ArrayList<String>();
		if (StringUtils.isNotBlank(unitId) && StringUtils.isNotBlank(departDateyyyyMMdd)) {
			unitId = unitId.trim();
			departDateyyyyMMdd = departDateyyyyMMdd.trim();
			for (String key : allMemKeys) {
				if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS + unitId + CACHE_KEY_SEPARATOR_DOT)
						&& key.endsWith(CACHE_KEY_SEPARATOR_DOT + departDateyyyyMMdd)) {
					resultList.add(key);
				}
			}
		}
		return resultList;
	}
	
	/**
	 * 获取指定出发站+目的地的所有班次cache key
	 * 
	 * @param unitId
	 * @param toStationId
	 * @return
	 */
	private List<String> getBusMemKeysByUnitIdAndToStation(String unitId, String toStationId) {
		List<String> resultList = new ArrayList<String>();
		if (StringUtils.isNotBlank(unitId) && StringUtils.isNotBlank(toStationId)) {
			unitId = unitId.trim();
			toStationId = toStationId.trim();
			for (String key : allMemKeys) {
				if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS + unitId + CACHE_KEY_SEPARATOR_DOT + toStationId
						+ CACHE_KEY_SEPARATOR_DOT)) {
					resultList.add(key);
				}
			}
		}
		return resultList;
	}
	
	private List<String> getBusMemKeysByAllConds(String unitId, String toStationId, String departDateyyyyMMdd) {
		List<String> resultList = new ArrayList<String>();
		for (String key : allMemKeys) {
			if (key.equals(CACHE_KEY_PREFIX_SAND_BUS + unitId + CACHE_KEY_SEPARATOR_DOT + toStationId
					+ CACHE_KEY_SEPARATOR_DOT + departDateyyyyMMdd)) {
				resultList.add(key);
				break;
			}
		}
		return resultList;
	}
	
	/**
	 * 获取指定目的地+出发日期的所有cache key
	 * 
	 * @param toStationId
	 * @param departDateyyyyMMdd
	 * @return
	 */
	private List<String> getBusMemKeysByToStationAndDepartDay(String toStationId, String departDateyyyyMMdd) {
		List<String> resultList = new ArrayList<String>();
		for (String key : allMemKeys) {
			if (key.startsWith(CACHE_KEY_PREFIX_SAND_BUS) && key
					.endsWith(CACHE_KEY_SEPARATOR_DOT + toStationId + CACHE_KEY_SEPARATOR_DOT + departDateyyyyMMdd)) {
				resultList.add(key);
			}
		}
		return resultList;
	}
	
	/**
	 * 获取指定sandFlightId对应的cache key
	 * 
	 * @param sandFlightId
	 * @param sandFlightId2 
	 * @return
	 */
	private String getBusDetailMemKeyById(String leaveTimeyyyyMMdd, String sandFlightId) {
		String resultKey = null;
		String expectedKey = CACHE_KEY_PREFIX_SAND_BUS_DETAIL + leaveTimeyyyyMMdd + CACHE_KEY_SEPARATOR_DOT
				+ sandFlightId;
		for (String key : allMemKeys) {
			if (key.equals(expectedKey)) {
				resultKey = key;
				break;
			}
		}
		return resultKey;
	}
	
	@Override
	public void refreshAllMemKeySet() { 
		List<String> keySet = getAllMemKeys();
		synchronized (allMemKeys) {
			if (allMemKeys.size() > 0) {
				allMemKeys.clear();
			}
			allMemKeys.addAll(keySet);
		}
		log.info("sync up all keys with memcached server done, keys count: " + allMemKeys.size());
		
		// FIXME remove below lines for production
		printAllMemKeys();
	}
	
	// ----------------------- sys_china_region cache handler ----------------------
	private void buildCacheForSysChinaRegion() {
		List<SysChinaRegion> regionList = dbManager
				.findSysChinaRegionByRegion6Code(StationMappingSysChinaRegion.getStationRegion6CodeList());
		for (SysChinaRegion region : regionList) {
			memcachedClient.set(CACHE_KEY_PREFIX_SYS_CHINA_REGION + region.regionCode6, region);
		}
		log.info("buildCacheForSysChinaRegion() done.");
	}

	@Override
	public SysChinaRegion getSysChinaRegionByRegion6Code(String region6Code) {
		SysChinaRegion cacheRegion = null;
		if (StringUtils.isNotBlank(region6Code)) {
			Object cacheObj = memcachedClient.get(CACHE_KEY_PREFIX_SYS_CHINA_REGION + region6Code.trim());
			if (cacheObj != null) {
				cacheRegion = (SysChinaRegion) cacheObj;
			}
		}
		return cacheRegion;
	}

	@Override
	public SysChinaRegion getSysChinaRegionByCnname(String regionCnname) {
		return getSysChinaRegionByRegion6Code(StationNameRegionMapping.getRegion6Code(regionCnname));
	}

	// ----------------------- sandws bus data cache handler ----------------------
	@Override
	public void cacheStoreSandBusData(Map<String, List<BusAllInfoVO>> dataMap) {
		if (CollectionUtils.isEmpty(dataMap)) return;
		
		for (String key : dataMap.keySet()) {
			String memKey = CACHE_KEY_PREFIX_SAND_BUS + key;
			memcachedClient.set(memKey, dataMap.get(key));
			allMemKeys.add(memKey);
		}
	}

	@Override
	public void afterSandBusSyncDone(String dateyyyyMMdd) {
		List<String> keysForClean = getBusMemKeysBeforeDate(dateyyyyMMdd);
		if (! keysForClean.isEmpty()) {
			allMemKeys.removeAll(keysForClean);
		}
		for (String key : keysForClean) {
			memcachedClient.delete(key);
		}
		// FIXME remove below lines for production
//		printAllMemKeys();
	}

	private void printAllMemKeys() {
		StringBuilder builder = new StringBuilder();
		for (String key : allMemKeys) {
			builder.append(key + ", ");
		}
		log.info("all mem keys: " + builder.toString());
	}
	
	private List<BusAllInfoVO> executeMemSearchByMultiKeys(List<String> memKeys) {
		List<BusAllInfoVO> resultList = null;
		if (! CollectionUtils.isEmpty(memKeys)) {
			Object[] memObjs = memcachedClient.getMultiArray(memKeys.toArray(new String[0]));
			if (memObjs != null && memObjs.length > 0) {
				resultList = new ArrayList<BusAllInfoVO>();
				for (Object item : memObjs) {
					if (item != null) {
						resultList.addAll((List<BusAllInfoVO>) item);
					}
				}
			}
		}
		
		return resultList;
	}
	
	@Override
	public List<BusAllInfoVO> getSandBusesByUnitId(String unitId) {
		List<String> memKeys = null;
		
		if (StringUtils.isNotBlank(unitId)) {
			unitId = unitId.trim();
			memKeys = this.getBusMemKeysByUnitId(unitId);
		}
		
		return executeMemSearchByMultiKeys(memKeys);
	}

	@Override
	public List<BusAllInfoVO> getSandBusesByAllConds(String unitId, String toStationId, String departDateyyyyMMdd) {
		List<String> memKeys = null;
		
		if (StringUtils.isNotBlank(unitId) && StringUtils.isNotBlank(toStationId)
				&& StringUtils.isNotBlank(departDateyyyyMMdd)) {
			unitId = unitId.trim();
			toStationId = toStationId.trim();
			departDateyyyyMMdd = departDateyyyyMMdd.trim();
			memKeys = this.getBusMemKeysByAllConds(unitId, toStationId, departDateyyyyMMdd);
		}
		
		return executeMemSearchByMultiKeys(memKeys);
	}

	@Override
	public List<BusAllInfoVO> getSandBusesByFromToStation(String unitId, String toStationId) {
		List<String> memKeys = null;
		
		if (StringUtils.isNotBlank(unitId) && StringUtils.isNotBlank(toStationId)) {
			unitId = unitId.trim();
			toStationId = toStationId.trim();
			memKeys = this.getBusMemKeysByUnitIdAndToStation(unitId, toStationId);
		}
		
		return executeMemSearchByMultiKeys(memKeys);
	}

	@Override
	public List<BusAllInfoVO> getSandBusesByUnitIdAndDepartDay(String unitId, String departDateyyyyMMdd) {
		List<String> memKeys = null;
		
		if (StringUtils.isNotBlank(unitId) && StringUtils.isNotBlank(departDateyyyyMMdd)) {
			unitId = unitId.trim();
			departDateyyyyMMdd = departDateyyyyMMdd.trim();
			memKeys = this.getBusMemKeysByUnitIdAndDepartDay(unitId, departDateyyyyMMdd);
		}
		
		return executeMemSearchByMultiKeys(memKeys);
	}

	@Override
	public SandBusDetailVO getSandBusDetailByFlightId(String leaveTimeyyyyMMdd, String sandFlightId) {
		SandBusDetailVO resultObj = null;
		String memKey = this.getBusDetailMemKeyById(leaveTimeyyyyMMdd, sandFlightId);
		if (StringUtils.isNotBlank(memKey)) {
			Object cacheObj = memcachedClient.get(memKey);
			if (cacheObj != null) {
				resultObj = (SandBusDetailVO) cacheObj;
//				log.info("##################getSandBusDetailByFlightId from memcache, memKey=" + memKey);
			}
		}
		return resultObj;
	}

	@Override
	public void cacheStoreSandBusDetail(String leaveTimeyyyyMMdd, SandBusDetailVO sandBusDetailVO) {
		String sandFlightId = sandBusDetailVO.getFlightOnlineDetailId();
		if (StringUtils.isNotBlank(leaveTimeyyyyMMdd) && StringUtils.isNotBlank(sandFlightId)) {
			String memKey = CACHE_KEY_PREFIX_SAND_BUS_DETAIL + leaveTimeyyyyMMdd.trim() + CACHE_KEY_SEPARATOR_DOT
					+ sandFlightId.trim();
			if (memcachedClient.set(memKey, sandBusDetailVO)) {
//				log.info("sandBusDetail object cached, memKey=" + memKey);
				allMemKeys.add(memKey);
			} else {
				log.fatal("FAIL to cache sandBusDetail object, memKey=" + memKey);
			}
		}
	}

}

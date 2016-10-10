/**
 * 
 */
package com.shbus.easybus.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import com.google.gson.Gson;
import com.shbus.easybus.service.cache.ICacheManager;
import com.shbus.easybus.thrift.front.BusAllInfoVO;
import com.shbus.easybus.thrift.front.BusBasicInfoVO;
import com.shbus.easybus.thrift.front.SysChinaRegion;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class CacheManagerTest extends TestCase {
	private ICacheManager cacheManager;
	
	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		cacheManager = (ICacheManager) springContext.getBean("cacheManager");
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#getAllMemKeys()}.
	 */
	public void testGetAllMemKeys() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#refreshAllMemKeySet()}.
	 */
	public void testRefreshAllMemKeySet() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#getSysChinaRegionByRegion6Code(java.lang.String)}.
	 */
	public void testGetSysChinaRegionByRegion6Code() {
		String region6Code = "330200";
		SysChinaRegion region = cacheManager.getSysChinaRegionByRegion6Code(region6Code);
		System.out.println(region.regionCnname + ", " + region.regionCode6);
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#getSysChinaRegionByCnname(java.lang.String)}.
	 */
	public void testGetSysChinaRegionByCnname() {
		String regionCnname = "宁波";
		SysChinaRegion region = cacheManager.getSysChinaRegionByCnname(regionCnname);
		System.out.println(region.regionCnname + ", " + region.regionCode6);
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#cacheStoreSandBusData(java.util.Map)}.
	 */
	public void testCacheStoreSandBusData() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#getSandBusesByUnitId(java.lang.String)}.
	 */
	public void testGetSandBusDataByUnitId() {
		String unitId = "1000206";
		List<BusAllInfoVO> list = cacheManager.getSandBusesByUnitId(unitId);
		if (!CollectionUtils.isEmpty(list)) {
			System.out.println("list size: " + list.size());
			int i = 0;
			for (BusAllInfoVO item : list) {
				if (i < 3) {
					BusBasicInfoVO basic = item.getBusBasicInfoVO();
					System.out.println(basic.unitId + ", " + basic.toStationId + ", " + basic.toStationName
							+ ", " + basic.rtorderId + ", " + basic.rtorderCode + ", " + basic.pleaveDtyyyyMMddHHmmss);		
				}
				++i;
			}
		}
		fail("Not yet implemented");
	}

	/**
	 * Test method for {@link com.shbus.easybus.service.cache.CacheManagerImpl#afterSandBusSyncDone(java.lang.String)}.
	 */
	public void testAfterSandBusSyncDone() {
		fail("Not yet implemented");
	}

}

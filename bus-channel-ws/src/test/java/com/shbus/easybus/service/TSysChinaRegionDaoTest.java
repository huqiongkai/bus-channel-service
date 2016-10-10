/**
 * 
 */
package com.shbus.easybus.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shbus.easybus.data.dao.TSysChinaRegionMapper;
import com.shbus.easybus.data.model.TSysChinaRegion;
import com.shbus.easybus.data.model.TSysChinaRegionExample;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class TSysChinaRegionDaoTest extends TestCase {

	private TSysChinaRegionMapper TSysChinaRegionDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		TSysChinaRegionDao = (TSysChinaRegionMapper) springContext.getBean("tSysChinaRegionDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for
	 * {@link com.shbus.easybus.data.dao.TSysChinaRegionDaoImpl#selectByExample(com.shbus.easybus.data.model.TSysChinaRegionExample)}
	 * .
	 */
	public void testSelectByExample() {
		TSysChinaRegionExample example = new TSysChinaRegionExample();
		example.createCriteria().andRegionCnnameEqualTo("宁波");
		List<TSysChinaRegion> list = TSysChinaRegionDao.selectByExample(example);
		if (list != null && list.size() > 0) {
			TSysChinaRegion region = list.get(0);
			System.out.println(region.getRegionCode6() + ", " + region.getParentCityCnname() + ", " + region.getRegionCnname());
		}
	}
	
	public void testSelectAll() {
		List<TSysChinaRegion> list = TSysChinaRegionDao.selectByExample(null);
		if (list != null) {
			for (TSysChinaRegion region : list) {
				System.out.println(region.getRegionCode6() + ", " + region.getParentCityCnname() + ", " + region.getRegionCnname());
			}
		}
	}

	/**
	 * Test method for
	 * {@link com.shbus.easybus.data.dao.TSysChinaRegionDaoImpl#selectByPrimaryKey(java.lang.String)}
	 * .
	 */
	public void testSelectByPrimaryKey() {
		String regionCode6 = "A00155";
		TSysChinaRegion region = TSysChinaRegionDao.selectByPrimaryKey(regionCode6);
		System.out.println(region.getRegionCode6() + ", " + region.getRegionCnname() + ", " + region.getRegionPysz());
	}

}

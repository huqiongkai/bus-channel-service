package com.shbus.easybus.oracle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class TInterfaceAccountTempDaoTest extends TestCase {

	private TInterfaceAccountTempMapper tInterfaceAccountTempDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		tInterfaceAccountTempDao = (TInterfaceAccountTempMapper) springContext.getBean("tInterfaceAccountTempDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testCountByExample() {
		fail("Not yet implemented");
	}

	public void testDeleteByExample() {
		fail("Not yet implemented");
	}

	public void testInsert() {
		TInterfaceAccountTemp record = new TInterfaceAccountTemp();
		record.setUserId("aaa");
		record.setPwd("123");
		record.setChannelId(-1l);
		record.setValid("Y");
		record.setUserInfo("userinfo");
		record.setSupplierinfoId("supplier info id");
		long returnValue = tInterfaceAccountTempDao.insert(record);
		System.out.println("returnValue for insert: " + returnValue);
	}

	public void testInsertSelective() {
		fail("Not yet implemented");
	}

	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	public void testUpdateByExampleSelective() {
		fail("Not yet implemented");
	}

	public void testUpdateByExample() {
		fail("Not yet implemented");
	}

}

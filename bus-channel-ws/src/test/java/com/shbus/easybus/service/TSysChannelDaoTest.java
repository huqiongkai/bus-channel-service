package com.shbus.easybus.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shbus.easybus.data.dao.TSysChannelMapper;

import junit.framework.TestCase;

public class TSysChannelDaoTest extends TestCase {

	private TSysChannelMapper tSysChannelDao;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		tSysChannelDao = (TSysChannelMapper) springContext.getBean("tSysChannelDao");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSelectByExample() {
		fail("Not yet implemented");
	}

	public void testSelectByPrimaryKey() {
		fail("Not yet implemented");
	}

	public void testSelectFromChannelByChannelId() {
		fail("Not yet implemented");
	}

}

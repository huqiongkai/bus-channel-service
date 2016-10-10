package com.shbus.easybus.service;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.service.db.DBManager;

import junit.framework.Assert;
import junit.framework.TestCase;

public class DbManagerTest extends TestCase {
	
	private DBManager db;

	protected void setUp() throws Exception {
		super.setUp();
		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
		db = (DBManager) springContext.getBean("dbManager");
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testGetInterfaceAccount() {
		fail("Not yet implemented");
	}

	public void testUpdateOrderTicketStatus() {
		String supplierId = "SAND15";
		String sandOrderId = "test1457075383730";
		TExBusOrder tOrder = new TExBusOrder();
		tOrder.setTicketStatus("FAIL");
		tOrder.setModifyDatetime(new Date());
		int rowsAffected = db.updateOrderTicketStatus(supplierId, sandOrderId, tOrder);
		Assert.assertTrue("updateOrderTicketStatus fail", rowsAffected >= 1);
	}

}

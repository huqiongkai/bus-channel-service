/**
 * 
 */
package com.shbus.easybus.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class SpringTaskTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();

		ApplicationContext springContext = new ClassPathXmlApplicationContext(
				new String[] { "conf/applicationContext.xml" });
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSelectByExample() {
		try {
			Thread.sleep(90000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fail("Not yet implemented");
	}

}

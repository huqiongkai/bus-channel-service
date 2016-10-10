/**
 * 
 */
package com.shbus.backoffice;

import java.text.SimpleDateFormat;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.data.dao.TExBusOrderMapper;
import com.shbus.easybus.data.model.TExBusOrder;
import com.shbus.easybus.data.model.TExBusOrderExample;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class CommonDaoTest extends TestCase {
	
	private ApplicationContext springContext;
	
	/**
	 * @param name
	 */
	public CommonDaoTest(String name) {
		super(name);
		
		springContext = new ClassPathXmlApplicationContext(new String[] { "conf/applicationContext.xml" });
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	protected void setUp() throws Exception {
		super.setUp();
	}

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#tearDown()
	 */
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	/**
	 * Test method for {@link com.shbus.easybus.data.dao.TExBusOrderDaoImpl#selectByExample(com.shbus.easybus.data.model.TExBusOrderExample)}.
	 */
	public void testSelectByExample() {
		TExBusOrderMapper exBusOrderDao = (TExBusOrderMapper) springContext.getBean("tExBusOrderDao");
		TExBusOrderExample example = new TExBusOrderExample();
		example.createCriteria().andSupplierIdEqualTo("SAND15").andOrderPackageIdIsNotNull();
		example.setOrderByClause(" create_date desc ");
		List<TExBusOrder> list = exBusOrderDao.selectByExample(example);
		if (!CollectionUtils.isEmpty(list)) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:MM:ss");
			for (TExBusOrder ord : list) {
				System.out.println(ord.getChannelName() + ", " + ord.getPsgName() + ", " 
						+ ord.getPsgCertificateNo() + ", " + ord.getRtorderCode() + ", " 
						+ ord.getFromStationName() + ", " + ord.getToStationName() + ", "
						+ sdf.format(ord.getPleaveDt()) + ", " + ord.getTicketStatus() + ", "
						+ sdf.format(ord.getCreateDate())
				);
			}
		}
	}

}

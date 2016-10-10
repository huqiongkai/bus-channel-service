/**
 * 
 */
package com.shbus.easybus.web;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServlet;

import com.shbus.easybus.context.SpringApplicationContext;
import com.shbus.easybus.thrift.front.ChannelService;
import com.shbus.easybus.thrift.front.ChannelService.Iface;

/**
 * @author Administrator
 *
 */
public class ChannelServiceV2ThriftServlet extends TServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7888954021182408875L;

	public ChannelServiceV2ThriftServlet() {
		super(new ChannelService.Processor<ChannelService.Iface>(
				(Iface) SpringApplicationContext.getBean("channelServiceThriftFactoryBean")),
				new TCompactProtocol.Factory());
	}

}

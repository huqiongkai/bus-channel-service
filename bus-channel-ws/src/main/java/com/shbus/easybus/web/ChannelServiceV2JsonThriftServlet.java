package com.shbus.easybus.web;

import org.apache.thrift.protocol.TJSONProtocol;
import org.apache.thrift.server.TServlet;

import com.shbus.easybus.context.SpringApplicationContext;
import com.shbus.easybus.thrift.front.ChannelService;
import com.shbus.easybus.thrift.front.ChannelService.Iface;

public class ChannelServiceV2JsonThriftServlet extends TServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2922548873402490383L;

	/**
	 * Constructor of the object.
	 */
	public ChannelServiceV2JsonThriftServlet() {
		super(new ChannelService.Processor<ChannelService.Iface>(
				(Iface) SpringApplicationContext.getBean("channelServiceThriftFactoryBean")),
				new TJSONProtocol.Factory());
	}

}

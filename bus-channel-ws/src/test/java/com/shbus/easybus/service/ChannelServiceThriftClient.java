/**
 * 
 */
package com.shbus.easybus.service;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.shbus.easybus.thrift.front.ChannelService;
import com.shbus.easybus.thrift.front.QueryBusReq;
import com.shbus.easybus.thrift.front.QueryBusResp;

/**
 * @author Administrator
 *
 */
public class ChannelServiceThriftClient {

	public static void main(String[] args) {
		try {
			// 设置调用的服务地址为本地，端口为 7911
			TTransport transport = new THttpClient(
					"http://localhost:8088/bus-channel-ws//servlet/ChannelServiceThriftServlet");
			transport.open();

			// 设置传输协议为 TBinaryProtocol
			TProtocol protocol = new TCompactProtocol(transport);
			ChannelService.Client client = new ChannelService.Client(protocol);
			// 调用服务的 helloVoid 方法
			QueryBusResp response = client.busSearch(new QueryBusReq());

			transport.close();
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		}
	}

}

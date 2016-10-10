/**
 * 
 */
package com.shbus.easybus.service;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.THttpClient;
import org.apache.thrift.transport.TTransport;
import org.apache.thrift.transport.TTransportException;

import com.shbus.easybus.thrift.front.AuthVO;
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
					"http://localhost:8088/bus-channel-ws/servlet/ChannelServiceThriftServlet");
			transport.open();

			// 设置传输协议为 TBinaryProtocol
			TProtocol protocol = new TCompactProtocol(transport);
			ChannelService.Client client = new ChannelService.Client(protocol);
			// 调用服务的 helloVoid 方法
			// interface account: test/eZVtUFhFF6qbyD2F
			AuthVO authVO = new AuthVO("test", DigestUtils.md5Hex("test" + "eZVtUFhFF6qbyD2F"));
			String unitId = "2000000021";	// 2000000021	客运南站	A0001Q
			QueryBusReq queryBusReq = new QueryBusReq(authVO, unitId);
			queryBusReq.setDepartDateyyyyMMdd("20160103");
			queryBusReq.setToStationId("1000000483");
			QueryBusResp response = client.busSearch(queryBusReq);
			System.out.println(response.toString());

			transport.close();
		} catch (TTransportException e) {
			e.printStackTrace();
		} catch (TException e) {
			e.printStackTrace();
		}
	}

}

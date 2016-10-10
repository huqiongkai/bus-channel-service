/**
 * 
 */
package com.shbus.easybus.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shbus.easybus.thrift.front.AuthVO;
import com.shbus.easybus.thrift.front.CertificateType;
import com.shbus.easybus.thrift.front.OrderBookReq;
import com.shbus.easybus.thrift.front.OrderSearchReq;
import com.shbus.easybus.thrift.front.PsgInfo;
import com.shbus.easybus.thrift.front.QueryBusReq;

import junit.framework.TestCase;

/**
 * @author Administrator
 *
 */
public class TJsonServletTest extends TestCase {

  String targetURL = "http://127.0.0.1:8080/bus-channel-ws/servlet/TJsonServlet";

	// interface account: test/eZVtUFhFF6qbyD2F
	AuthVO authVO = new AuthVO("test", DigestUtils.md5Hex("test" + "eZVtUFhFF6qbyD2F"));

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	private final static String PARAM_FLAG = "FLAG";
	private final static String PARAM_SERVICE = "SERVICE";
	private final static String PARAM_METHOD = "METHOD";
	private final static String PARAM_BODY = "BODY";
	Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();

	private HttpPost generateHttpPost(String serviceMethod, Object serviceReq) throws UnsupportedEncodingException {
		HttpPost httpPost = new HttpPost(targetURL);

		List<NameValuePair> list = new ArrayList<NameValuePair>();
        list.add(new BasicNameValuePair(PARAM_SERVICE, "ChannelService"));
        list.add(new BasicNameValuePair(PARAM_METHOD, serviceMethod));
        list.add(new BasicNameValuePair(PARAM_FLAG, "THRIFT"));
        list.add(new BasicNameValuePair(PARAM_BODY, gson.toJson(serviceReq)));
        //url格式编码
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(list,"UTF-8");
		httpPost.setEntity(formEntity);
		
		return httpPost;
	}
	
	public void testBusSearch() {
		// construct request entity
		QueryBusReq queryBusReq = new QueryBusReq();
//		authVO = new AuthVO("tongcheng", DigestUtils.md5Hex("tongcheng" + "s0XjcyEXkhk2qPwF"));
//		authVO = new AuthVO("qua", DigestUtils.md5Hex("qua" + "n1wGXHdP97MSDAu8"));
		queryBusReq.setAuthVO(authVO);
		queryBusReq.setUnitId(UnitIdConstants.UNIT_ID_HTLKYZ/*"1e49c163-394d-41e2-a647-e639b273beea"*//*UnitIdConstants.UNIT_ID_KYNZ*/);
//		queryBusReq.setToStationId("1000000483"); // 1000000483 宁波客运总站
		queryBusReq.setDepartDateyyyyMMdd("20161010");
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost;
		try {
			httpPost = generateHttpPost("busSearch", queryBusReq);
			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity));
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void testOrderBook() {
		// construct request entity
		OrderBookReq orderBookReq = new OrderBookReq();
//		authVO = new AuthVO("tongcheng", DigestUtils.md5Hex("tongcheng" + "s0XjcyEXkhk2qPwF"));
//		authVO = new AuthVO("qua", DigestUtils.md5Hex("qua" + "n1wGXHdP97MSDAu8"));
		orderBookReq.setAuthVO(authVO);
		orderBookReq.setIsTestOrder("Y");
		orderBookReq.setExOrderId("124975326672"/* + System.currentTimeMillis()*/);
		orderBookReq.setRtOrderId("16061100537101000202");
		orderBookReq.setPleaveDtyyyyMMddHHmmss("20160611180000");
		orderBookReq.setTicketCount(2);
		orderBookReq.setTicketPrice(237);
		orderBookReq.setTotalPrice(474);
//		orderBookReq.setTicketCount(2);
//		orderBookReq.setTicketPrice(24);
//		orderBookReq.setTotalPrice(48);
		orderBookReq.setUnitId(UnitIdConstants.UNIT_ID_HQCTXZ);
		orderBookReq.setToStationId("1000000357");	//1000000483
		List<PsgInfo> psgList = new ArrayList<PsgInfo>();
		psgList.add(new PsgInfo("张晓", "371321198610053919", CertificateType.id, "13918417065"));
//		psgList.add(new PsgInfo("孙云翔", "341521200502194832", CertificateType.id, "15189540070"));
//		psgList.add(new PsgInfo("陈三妹", "362301195311160028", CertificateType.id, "13817360480"));
		orderBookReq.setPsgList(psgList);
		
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost;
		try {
			httpPost = generateHttpPost("orderBook", orderBookReq);
			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity));
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void testOrderSearch() {
		OrderSearchReq orderSearchReq = new OrderSearchReq();
//		authVO = new AuthVO("qunar", DigestUtils.md5Hex("qunar" + "bTSFADQu9TXMfeJm"));
//		authVO = new AuthVO("qunar", DigestUtils.md5Hex("qunar" + "bTSFADQu9TXMfeJm"));
//		authVO = new AuthVO("ctrip", DigestUtils.md5Hex("ctrip" + "2oILTSxccWjTxKCw"));
//		orderSearchReq.setAuthVO(authVO);
//		orderSearchReq.setExOrderId("1685847666");
//		authVO = new AuthVO("tongcheng", DigestUtils.md5Hex("tongcheng" + "s0XjcyEXkhk2qPwF"));
		authVO = new AuthVO("qua", DigestUtils.md5Hex("qua" + "n1wGXHdP97MSDAu8"));
		orderSearchReq.setAuthVO(authVO);
//		orderSearchReq.setPsgName("巴士国旅0225");
		orderSearchReq.setExOrderId("125017065209");
		orderSearchReq.setIsTestOrder("N");

		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost;
		try {
			httpPost = generateHttpPost("orderSearch", orderSearchReq);
			HttpResponse response = httpClient.execute(httpPost);
			if (response != null) {
				HttpEntity resEntity = response.getEntity();
				if (resEntity != null) {
					System.out.println(EntityUtils.toString(resEntity));
				}
			}
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} finally {
			try {
				httpClient.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}

/**
 * 
 */
package com.shbus.easybus.backoffice.service;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.beans.BeanUtils;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.backoffice.web.OrderQueryParamVO;
import com.shbus.easybus.backoffice.web.OrderQueryResultVO;
import com.shbus.easybus.data.model.TExBusOrder;

/**
 * @author Administrator
 *
 */
public class CommonOrderServiceImpl implements ICommonOrderService {
	private IDbManager dbManager;
	private String reportFileLocation;
	
	public void setDbManager(IDbManager dbManager) {
		this.dbManager = dbManager;
	}

	public void setReportFileLocation(String reportFileLocation) {
		this.reportFileLocation = reportFileLocation;
		
		File f = new File(reportFileLocation);
		if (!f.exists() || !f.isDirectory()) {
			if (!f.mkdirs()) {
				f.mkdirs();
			}
		}
	}
	
	private void transformTObjectToVO(List<TExBusOrder> tList, List<OrderQueryResultVO> voList) {
		if (!CollectionUtils.isEmpty(tList)) {
			for (TExBusOrder ord : tList) {
				OrderQueryResultVO vo = new OrderQueryResultVO();
				BeanUtils.copyProperties(ord, vo);
				voList.add(vo);
			}
		}
	}
	
	@Override
	public List<OrderQueryResultVO> pageSearchExBusOrders(OrderQueryParamVO orderQueryParamVO) {
		List<OrderQueryResultVO> resultList = new ArrayList<OrderQueryResultVO>();
		
		List<TExBusOrder> list = dbManager.pageSelectExBusOrders(orderQueryParamVO);
		transformTObjectToVO(list, resultList);
		
		return resultList;
	}
	
	@Override
	public List<OrderQueryResultVO> searchExBusOrders(OrderQueryParamVO orderQueryParamVO) {
		List<OrderQueryResultVO> resultList = new ArrayList<OrderQueryResultVO>();
		
		List<TExBusOrder> list = dbManager.searchExBusOrders(orderQueryParamVO);
		transformTObjectToVO(list, resultList);
		
		return resultList;
	}

	@Override
	public List<OrderQueryResultVO> searchDailyExBusOrders(String dailyDateyyyyMMdd) {
		List<OrderQueryResultVO> resultList = new ArrayList<OrderQueryResultVO>();
		
		List<TExBusOrder> list = dbManager.searchDailyExBusOrders(dailyDateyyyyMMdd);
		transformTObjectToVO(list, resultList);

		return resultList;
	}

	private String generateOrderReport(List<OrderQueryResultVO> orderList) {
		String reportFileName = null;
		if (!CollectionUtils.isEmpty(orderList)) {
			reportFileName = reportFileLocation + "/orders_" + System.currentTimeMillis() +  ".csv";
			String[] headerNames = new String[] {
				"渠道名称",
				"渠道订单号",
				"创建时间",
				"姓名",
				"电话",
				"证件号",
				"发车站点",
				"发车时间",
				"到达站",
				"车票价格",
				"车票数量（序号）",
				"出票状态",
				"取票码",
				"出票确认时间",
				"杉德订单号"
			};
			final CSVFormat csvFormat = CSVFormat.EXCEL.withHeader(headerNames);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			CSVPrinter csvPrinter = null;
			try {
				// use 'GBK' character encoding for windows excel application
				OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(reportFileName), "GBK");
				csvPrinter = new CSVPrinter(out, csvFormat);
				for (OrderQueryResultVO vo : orderList) {
					if (vo != null) {
						List<String> dataList = new ArrayList<String>();
						dataList.add(vo.getChannelName() != null ? vo.getChannelName() : "");
						dataList.add(vo.getExOrderId() != null ? vo.getExOrderId() : "");
						dataList.add(vo.getCreateDate() != null ? dateFormat.format(vo.getCreateDate()) : "");
						dataList.add(vo.getPsgName() != null ? vo.getPsgName() : "");
						dataList.add(vo.getPsgMobile() != null ? vo.getPsgMobile() : "");
						dataList.add(vo.getPsgCertificateNo() != null ? "'" + vo.getPsgCertificateNo() : "");
						dataList.add(vo.getFromStationName() != null ? vo.getFromStationName() : "");
						dataList.add(vo.getPleaveDt() != null ? dateFormat.format(vo.getPleaveDt()) : "");
						dataList.add(vo.getToStationName() != null ? vo.getToStationName() : "");
						dataList.add(vo.getTicketPrice() + "");		// 订单中车票单价
						dataList.add(vo.getExOrderIdIndex() + "");
						dataList.add(vo.getTicketStatus() != null ? vo.getTicketStatus() : "");
						dataList.add(vo.getTicketRecRandomCode() != null ? vo.getTicketRecRandomCode() : "无");
						dataList.add(vo.getTicketConfirmDate() != null ? dateFormat.format(vo.getTicketConfirmDate()) : "");
						dataList.add(vo.getOrderPackageId() != null ? vo.getOrderPackageId() : "");
						csvPrinter.printRecord(dataList);
					}
				}
				csvPrinter.flush();
			} catch (Exception e) {
				throw new RuntimeException(e);
			} finally {
				try {
					csvPrinter.close();
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		}
		
		return reportFileName;
	}
	
	@Override
	public String generateOrderSearchReport(OrderQueryParamVO orderQueryParamVO) throws Throwable {
		List<OrderQueryResultVO> orders = this.searchExBusOrders(orderQueryParamVO);
		
		return this.generateOrderReport(orders);
	}

}

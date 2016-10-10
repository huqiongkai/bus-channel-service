/**
 * 
 */
package com.shbus.easybus.backoffice.service.back;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.springframework.util.CollectionUtils;

import com.shbus.easybus.backoffice.service.ICommonOrderService;
import com.shbus.easybus.backoffice.web.OrderQueryResultVO;

/**
 * @author Administrator
 *
 */
public class OrderSchedulingServiceImpl implements IOrderSchedulingService {
	private ICommonOrderService commonOrderService;
	private String reportFileLocation;
	
	public void setCommonOrderService(ICommonOrderService commonOrderService) {
		this.commonOrderService = commonOrderService;
		
//		startDailyReportTask();
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

	private Runnable dailyReportTask = new Runnable() {
		@Override
		public void run() {
			List<OrderQueryResultVO> orders = commonOrderService.searchDailyExBusOrders("2016/01/21");
			if (!CollectionUtils.isEmpty(orders)) {
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
					"出票确认时间",
					"杉德订单号"
				};
				final CSVFormat csvFormat = CSVFormat.EXCEL.withHeader(headerNames);
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				CSVPrinter csvPrinter = null;
				try {
					OutputStreamWriter out = new OutputStreamWriter(
							new FileOutputStream(reportFileLocation + "/" + "日报.csv"), "GBK");
					csvPrinter = new CSVPrinter(out, csvFormat);
					for (OrderQueryResultVO vo : orders) {
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
							dataList.add(vo.getTicketPrice() + "");
							dataList.add(vo.getExOrderIdIndex() + "");
							dataList.add(vo.getTicketStatus() != null ? vo.getTicketStatus() : "");
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
		}
	};
	
	@Override
	public void startDailyReportTask() {
		try {
			new Thread(dailyReportTask).start();
		} catch (Throwable t) {		// restart the job
			new Thread(dailyReportTask).start();
		}
	}
	
}

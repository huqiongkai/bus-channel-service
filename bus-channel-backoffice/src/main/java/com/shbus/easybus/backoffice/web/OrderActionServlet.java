package com.shbus.easybus.backoffice.web;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.shbus.easybus.backoffice.service.ICommonOrderService;
import com.shbus.easybus.context.SpringApplicationContext;

/**
 * Servlet implementation class OrderQueryServlet
 */
public class OrderActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ICommonOrderService commonOrderService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public OrderActionServlet() {
		super();
		
		commonOrderService = (ICommonOrderService) SpringApplicationContext.getBean("commonOrderService");
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	private final String QUERY_PARAMS = "queryParams";
	private Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String queryParamObj = request.getParameter(QUERY_PARAMS);
		OrderQueryParamVO orderQueryParamVO = null;
		
		if (StringUtils.isNotBlank(queryParamObj)) {
			orderQueryParamVO = gson.fromJson(queryParamObj, OrderQueryParamVO.class);
		}
		if (orderQueryParamVO == null || StringUtils.isBlank(queryParamObj)) {
			response.sendError(HttpServletResponse.SC_BAD_REQUEST, "查询参数错误");
			return;		
		}
		
		if ("Y".equalsIgnoreCase(orderQueryParamVO.getDumpAction())) {
			ServletOutputStream servletOutputStream = null;
			InputStream fileInput = null;
			try {
				String reportFileName = commonOrderService.generateOrderSearchReport(orderQueryParamVO);
				if (StringUtils.isBlank(reportFileName)) {
					throw new RuntimeException("报表生成失败！");
				}
				String headerFileName = null;
				int tagIndex = reportFileName.lastIndexOf("/");
				if (tagIndex != -1) {
					headerFileName = reportFileName.substring(tagIndex + 1);
				} else {
					headerFileName = reportFileName;
				}
				response.setHeader("Content-Disposition", "attachment; filename=" + headerFileName);
				String calculatedMimeType = getServletContext().getMimeType(headerFileName);
				if (StringUtils.isBlank(calculatedMimeType)) {
					calculatedMimeType = "application/octet-stream";
				}
				response.setContentType(calculatedMimeType);
				
				servletOutputStream = response.getOutputStream();
				fileInput = new BufferedInputStream(new FileInputStream(reportFileName));
				byte[] buf = new byte[4096];
				int byteCount;
				while ((byteCount = fileInput.read(buf)) != -1) {
					servletOutputStream.write(buf, 0, byteCount);
				}
				servletOutputStream.flush();
			} catch (Throwable e) {
				throw new RuntimeException(e);
			} finally {
				if (servletOutputStream != null) {
					servletOutputStream.close();
				}
				if (fileInput != null) {
					fileInput.close();
				}
			}
		} else {
			List<OrderQueryResultVO> returnList = commonOrderService.pageSearchExBusOrders(orderQueryParamVO);
			Map<String, Object> resultMap = new HashMap<String, Object>();
			resultMap.put("orderListData", returnList);
			// response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter out = response.getWriter();
			out.write(gson.toJson(resultMap));
			out.flush();
			out.close();
		}
		
	}

}

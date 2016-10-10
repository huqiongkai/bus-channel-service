package com.shbus.easybus.backoffice.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Method;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.shbus.easybus.backoffice.service.back.IOrderSchedulingService;
import com.shbus.easybus.context.SpringApplicationContext;

/**
 * Servlet implementation class SubmitRequestServlet
 */
public class SubmitRequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private IOrderSchedulingService orderReportSchedulingService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SubmitRequestServlet() {
		super();
		orderReportSchedulingService = (IOrderSchedulingService) SpringApplicationContext
				.getBean("orderReportService");
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
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String beanName = request.getParameter("BEAN");
		String setMethodName = request.getParameter("SET_METHOD");
		String propValue = request.getParameter("VALUE");
		if (StringUtils.isBlank(beanName) || StringUtils.isBlank(setMethodName) || StringUtils.isBlank(propValue)) {
			out.write("request query parameters(BEAN, SET_METHOD, VALUE) can't be empty!");
			return;
		}
		
		beanName = beanName.trim();
		setMethodName = setMethodName.trim();
		propValue = propValue.trim();
		
		Object service = SpringApplicationContext.getBean(beanName);
		if (service == null) {
			out.write("service bean not found, beanId=" + beanName);
		} else {
			Class<?>[] parameterTypes = new Class[] { String.class };
			try {
				Method m = service.getClass().getMethod(setMethodName, parameterTypes);
				m.invoke(service, propValue);
			} catch (Exception e) {
				out.write("change configuration failed for m.invoke error");
				return;
			}
			out.write("configuration changed success");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}

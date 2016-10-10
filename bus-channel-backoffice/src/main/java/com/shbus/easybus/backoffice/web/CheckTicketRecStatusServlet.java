package com.shbus.easybus.backoffice.web;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;

import com.shbus.easybus.IJyBusTicketService;
import com.shbus.easybus.context.SpringApplicationContext;

/**
 * Servlet implementation class CheckTicketRecStatusServlet
 */
public class CheckTicketRecStatusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IJyBusTicketService jyBusTicketService;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckTicketRecStatusServlet() {
        super();
        // TODO Auto-generated constructor stub
        jyBusTicketService = (IJyBusTicketService) SpringApplicationContext.getBean("sandWsClient");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	private final String P_SAND_ORDER_ID = "sandOrderId";
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String statusCode = null;
		String sandOrderId = request.getParameter(P_SAND_ORDER_ID);
		if (StringUtils.isNotBlank(sandOrderId)) {
			sandOrderId = sandOrderId.trim();
			statusCode = jyBusTicketService.queryOrderStatus(sandOrderId);
		} else {
			statusCode = "-1";
		}
		response.getWriter().write(statusCode);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package com.shbus.easybus.web;

import java.io.IOException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.thrift.TBase;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.shbus.easybus.context.SpringApplicationContext;
import com.shbus.easybus.utils.BusBeanUtilV2;

/**
 * *** Migrated directly from bus-channel-webapp. ***
 * 
 * Servlet implementation class ThriftServer
 */
public class TJsonServlet extends HttpServlet {
private Logger log = LoggerFactory.getLogger(getClass()); 
	private final static String PARAM_FLAG="FLAG";
  private final static String PARAM_SERVICE="SERVICE";
  private final static String PARAM_METHOD="METHOD";
  private final static String PARAM_BODY="BODY";
  private Map<String,Object> serviceMap;
  /**
   * @see HttpServlet#HttpServlet()
   */
  public TJsonServlet() {
    super();
    this.serviceMap = (Map<String,Object>) SpringApplicationContext.getBean("tjsonServletServiceMap");
  }
  /**
   * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
	  String respjson="";
	  String paramBody="";
	  String paramMethod="";
	  String paramService="";
	  String flag = "";
    try {
      response.setContentType("application/json"); 
      response.setCharacterEncoding("utf-8");
      paramService = request.getParameter(PARAM_SERVICE);
      paramMethod = request.getParameter(PARAM_METHOD);
      paramBody = request.getParameter(PARAM_BODY);
      flag = request.getParameter(PARAM_FLAG);
      Object service = this.serviceMap.get(paramService);
      if(service==null)
    	  throw new Exception("找不到服务 PARAM_SERVICE="+paramService);
      Method m = getMethodByName(paramMethod,service.getClass());
      Object param = BusBeanUtilV2.convertJsonToObject(paramBody, m.getParameterTypes()[0],"yyyy-MM-dd HH:mm:ss");
      Object resp = m.invoke(service, new Object[]{param});
      if(("THRIFT".equals(flag))&&(resp instanceof TBase))
      {
    	  respjson = BusBeanUtilV2.convertThriftObjToJson(resp); 
      }
      else
      {
      //影响出票机
    	  respjson = BusBeanUtilV2.convertToJson(resp);
      }
      respjson = respjson.replace("\\r", "");
	  respjson = respjson.replace("\\n", "");
	  respjson = respjson.replace("\0", "");
      if(log.isDebugEnabled())
      {
    	  log.debug("method:{} reqbody:{} respbody:{}",new Object[]{paramMethod,paramBody,respjson});
      }
      response.getWriter().write(respjson);
    } catch (Exception te) {
      log.error("method:{} reqbody:{} respbody:{} error:{}",new Object[]{paramMethod,paramBody,respjson,te.getMessage()}); 
      response.getWriter().write(te.getMessage());
    }
  }

  /**
   * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   *      response)
   */
  protected void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {
    doPost(request, response);
  } 
  private Method getMethodByName(String methodname,Class cls) throws Exception
  {
	  for(Method m:cls.getMethods())
	  {
		  if(Modifier.isPublic(m.getModifiers())&&m.getParameterTypes().length==1&&m.getName().equals(methodname))
		  {
			  return m;
		  }
	  }
	  throw new Exception("找不到方法 PARAM_METHOD="+methodname);
  }
}

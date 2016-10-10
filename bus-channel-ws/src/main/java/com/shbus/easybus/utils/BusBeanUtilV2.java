/**
 * 
 */
package com.shbus.easybus.utils;

import java.lang.reflect.Method;
import java.nio.charset.Charset;

import org.apache.thrift.protocol.TSimpleJSONProtocol;
import org.apache.thrift.transport.TMemoryBuffer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author Administrator
 *
 */
public class BusBeanUtilV2 {
	
	private static Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd HH:mm:ss").create();
	
	public static Object convertJsonToObject(String json, Class c,String dateStyle) {
		return gson.fromJson(json, c);
	}
	
	public static String convertThriftObjToJson(Object obj)  
	{
		if(obj==null)
			return "";
		try {
			Method write = obj.getClass().getMethod("write", new Class[]{org.apache.thrift.protocol.TProtocol.class});
			if(write==null)
			{
				throw new Exception("找不到write方法");
			}
			TMemoryBuffer mem = new TMemoryBuffer(1024);
			TSimpleJSONProtocol protocol = new TSimpleJSONProtocol(mem);
			write.invoke(obj, new Object[]{protocol});
			String json = new String(mem.getArray(),Charset.forName("UTF-8"));
			json = json.replace("\0", "");
			return json;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}  
	}
	
	public static String convertToJson(Object cond) {
		return gson.toJson(cond);
//		return sw.toString().replaceAll("\\\\r", "").replaceAll("\\\\n", "");
	}
	
}

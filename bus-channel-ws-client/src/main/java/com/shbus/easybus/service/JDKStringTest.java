/**
 * 
 */
package com.shbus.easybus.service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class JDKStringTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String s1 = "浦东";
		String s2 = "上海浦东长途东站";
		System.out.println(s2.indexOf(s1));
		System.out.println(s2.contains(s1));
		System.out.println(s2.contains("长途东站"));
		
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		List<String> list1 = new ArrayList<String>();
		list1.add("aaa");
		list1.add("bbb");
		list1.add("ccc");
		map.put("list1", list1);
		List<String> list2 = new ArrayList<String>();
		list2.add("ddd");
		list2.add("eee");
		list2.add("fff");
		System.out.println(list2);
		map.put("list2", list2);
		
		Object getObj = map.get("list2");
		System.out.println(getObj);
		((List<String>)getObj).add("ttt");
		System.out.println(list2);
		System.out.println(getObj);
		System.out.println(map.get("list2"));
		System.out.println(getObj == list2);*/
		String str1 = "ca-bc-dc-ec";
		/*str1 = str1.replace("-", "");
		System.out.println(str1);
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(dateFormat.format(new Date()));*/

		str1 = "02|674357960";
		String[] arr = str1.split("\\|");
		System.out.println(arr.length);
		for (String o : arr) {
			System.out.println(o);
		}
		str1 = "02|";
		arr = str1.split("\\|");
		System.out.println(arr.length);
		for (String o : arr) {
			System.out.println("[" + o);
		}
		str1 = "02";
		arr = str1.split("\\|");
		System.out.println(arr.length);
		for (String o : arr) {
			System.out.println("[" + o);
		}
		/*Calendar calend = Calendar.getInstance();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		for (int i = 0; i < 10; i ++) {
			if (i > 0) {
				calend.add(Calendar.DAY_OF_MONTH, 1);
			}
			System.out.println(dateFormat.format(calend.getTime()).substring(0, 10));
		}*/
	}

}

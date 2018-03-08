/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月6日 上午11:36:16  
 *  
 */  

package com.leetCode;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import static java.lang.System.out;


/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月6日 上午11:36:16  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月6日      Eg                      1.0         1.0 Version  
 */

public class StringUtils {
	
	public static void main(String[] args) throws Exception, Throwable {
		out.println(reverseByArray("Leonard"));
		out.println(reverseByStack("Leonard"));
		out.println( reverseBySort("Leonard"));
		out.println(calClass(String.class));
	}
	

	/**
	 * 
	* <p>描述:通过数组反转字符串</p>
	* @param str
	* @return
	* @author Eg
	 */
	public static String reverseByArray(String str) {
		if(str==null||str.length()==0) return "";
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length/2;i++) {
			char temp=ch[i];
			ch[i]=ch[ch.length-i-1];
			ch[ch.length-i-1]=temp;
		}
		return new String(ch);
	}
	
	/**
	 * 
	* <p>描述:通过栈来进行字符串反转</p>
	* @param str
	* @return
	* @author Eg
	 */
	public static String reverseByStack(String str) {
		if(str==null||str.length()==0) return "";
		char[] ch=str.toCharArray();
		Stack<Character> stack=new Stack<Character>();
		for(int i=0;i<ch.length;i++) {
			stack.push(ch[i]);
		}
		String result="";
		for(int i=0;i<ch.length;i++) {
			result+=stack.pop().toString();
		}
		return result;
	}
	
	/**
	 * 
	* <p>描述:使用逆序遍历来反转字符串</p>
	* @param str
	* @return
	* @author Eg
	 */
	public static String reverseBySort(String str) {
		if(str==null||str.length()==0) return "";
		StringBuilder sb=new StringBuilder();
		char[] ch=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--) {
			sb.append(ch[i]);
		}
		return sb.toString();
	}
	
	public static Map<String, Integer> calClass(Class<?> class1) throws NoSuchFieldException, SecurityException, Exception, Throwable {
		Map<String, Integer> map=new HashMap<>();
		Method[] methods=class1.getDeclaredMethods();
		for(Method method:methods) {
			out.println(method);
		}
		map.put("Methods", methods.length);
		
		Field[] fields=class1.getDeclaredFields();
		for(Field field:fields) {
			out.println(field);
		}
		Field field=class1.getDeclaredField("hash");
		field.setAccessible(true);
		
		Object obj=field.get(class1);
		map.put("Fields", fields.length);
		
		Constructor<?>[] constructors= class1.getDeclaredConstructors();
		for(Constructor<?> constructor:constructors) {
			out.println(constructor);
		}
		map.put("Constructors", constructors.length);
		
		return map;
	}
	

}

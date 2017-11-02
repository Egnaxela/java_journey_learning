/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年8月7日 下午4:03:44  
 *  
 */  

package com.rongji.lang;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年8月7日 下午4:03:44  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月7日      Eg                      1.0         1.0 Version  
 */

public class ClassLoaderTest {
	
	public static void main(String[] args) {
		ClassLoader loader=ClassLoaderTest.class.getClassLoader();
		System.out.println(loader+"\n"+"******************************");
		System.out.println(System.getProperty("java.version"));
		System.out.println(new Properties().getProperty("java.version"));
		System.out.println(System.getProperties().getProperty("java.version"));
	//	System.out.println(System.getProperties().toString());
		
	}
	
	@Test
	public void getAllProperties() {
		Hashtable<Object, Object> tab=System.getProperties();
		//1.通过map.keySet()来遍历
		int i=0;
		for (Object obj : tab.keySet()) {
			System.out.println((++i)+" "+ obj+" : "+ tab.get(obj));
		}
		
		System.out.println("*******************************************");
		//2.通过map.entrySet使用Iterator
		i=0;
		Iterator<Map.Entry<Object, Object>> iterator=tab.entrySet().iterator();
		while(iterator.hasNext()) {
			Map.Entry<Object, Object> entry=iterator.next();
			System.out.println((++i)+" "+entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("*******************************************");
		//3.通过使用map.entrySet(当数据量大时推荐)
		i=0;
		for(Map.Entry<Object, Object> entry:tab.entrySet()) {
			System.out.println((++i)+" "+entry.getKey()+" : "+entry.getValue());
		}
		
		System.out.println("*******************************************");
		//4.遍历所有的value
		i=0;
		for(Object value :tab.values()) {
			System.out.println((++i)+" "+value);
		}
	}
	
	@Test
	public void test5() {
		System.out.println(System.getProperty("java.security.manager"));
		System.out.println(Class.class.getClassLoader());
	}
	
	@Test
	public void  test6() {
		System.out.println(System.getProperty("sun.boot.class.path"));
	}
	
	@Test
	public void test7() {
		System.out.println(String.class.getClassLoader());
	}

}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年5月26日 下午4:57:21  
 *  
 */  

package com.rongji.lang;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年5月26日 下午4:57:21  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年5月26日      Eg                      1.0         1.0 Version  
 */

public class TestClass {
	
	@Test
	public void  test() throws Exception{
		Class name=int.class;
		String name2=TestClass.class.getResource("/").getPath().toString();
		File xmlFile=new File(name2, "/redis.properties");
		SAXReader saxReader=new SAXReader();
		Document xmlDoc=saxReader.read(xmlFile);
		Element root=xmlDoc.getRootElement();
		Element ftable=root.element("table");
		List column=null;
		
		
		
		
		
		
		
		column=ftable.elements("column");
		System.out.println(name2);
		
		
	}
	
	@Test
	public void tes(){
		System.out.println(min(19,72,4,85,6));
		System.out.println(min2(0));
		int[] args={1,2,3,4};
		System.out.println(Arrays.asList(args));
		System.out.println(Arrays.toString(args));
		System.out.println(min());
		
	}
	
	public Integer min(int... args){
		if(args.length==0){
			throw new IllegalArgumentException("参数不能为空");
		}
		int min=args[0];
		for(int arg:args){
			if(arg<min){
				min=arg;
			}
		}
		return min;
	}
	
	public int min2(int first,int... args){
		int min=first;
		for(int arg:args){
			if(arg<min){
				min=arg;
			}
		}
		return min;
	}
	
	@Test
	public void testDouble(){
		System.out.println(1.03-0.42);
		System.out.println(1.00-9*.10);
	}
	
	@Test
	public void testCompare(){
		System.out.println(compare(new Integer(25),new Integer(25)));
		System.out.println(compare2(new Integer(25),new Integer(25)));
		
	}
	
	/**
	 * 
	* <p>描述:p192 第49条</p>
	* @param a
	* @param b
	* @return
	* @author Eg
	 */
	public int compare(Integer a,Integer b){
		return a<b?-1:(a==b?0:1);
	}
	
	public int compare2(Integer a,Integer b){
		int a1=a;
		int b1=b;
		return a1<b1?-1:(a1==b1?0:1);
	}

}

class Unbelievable{
	static Integer i=42;
	public static void main(String[] args) {
		if(i==42){
			System.out.println("42");
		}
	}
	
}

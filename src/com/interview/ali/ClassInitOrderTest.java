/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年2月21日 下午12:34:41  
 *  
 */  

package com.interview.ali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年2月21日 下午12:34:41  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年2月21日      Pluto       1.0         1.0 Version  
 */


public class ClassInitOrderTest extends FatherInit{
	
	private static String staticField="staticField";
	
	private String nonstaticField="non-static Field";
	static {
		System.out.println(staticField);   //静态变量
		System.out.println("static block"); //静态代码块
	}
	
	{
		
		System.out.println(nonstaticField); //非静态变量
		System.out.println("non-static block"); //非静态代码块
	}
	
	
	
	public ClassInitOrderTest(){
		System.out.println("constructor"); //构造器
	}
	
	public static void main(String[] args) {
		new ClassInitOrderTest();
		String aString="abcd";
		String bString="ab"+"cd".intern();
		System.out.println(aString==bString); //字符串常量池
		
	}
	
	@Test
	public void testDel() {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("d");
		list.add("c");
//		for(int i=0;i<list.size();i++) {
//			if("c".equals(list.get(i))) {
//				list.remove(i);
//				i--;
//			}
//		}
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			if("c".equals(iterator.next())) {
				iterator.remove();
			}
		}
		System.out.println(list.toString());
	}
	
}

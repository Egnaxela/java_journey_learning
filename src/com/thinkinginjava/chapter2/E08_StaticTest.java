/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午2:39:49  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午2:39:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E08_StaticTest {

	static int i=13;
	
	public static void main(String[] args) {
		E08_StaticTest st1=new E08_StaticTest();
		E08_StaticTest st2=new E08_StaticTest();
		System.out.println(st1.i+"=="+st2.i);
		i++;//当静态域变量i变化时，两个对象取到的都是同一个值
		System.out.println(st1.i+"=="+st2.i);
	}
}

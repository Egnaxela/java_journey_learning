/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午2:47:55  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午2:47:55  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E09_AutoBoxingTest {
	
	public static void main(String[] args) {
		
		Byte bt=13;
		byte bt2=bt;
		System.out.println("byte:"+bt2);
		
		Short sr=17;
		short sr2=sr;
		System.out.println("short:"+sr2);
		
		Integer i=19;
		int i2=i;
		System.out.println("int:"+i2);
		
		Long l=23L;
		long l2=l;
		System.out.println("long:"+l2);
		
		Float f=11.3f;
		float f2=f;
		System.out.println("float:"+f2);
		
		Double d=13.7d;
		double d2=d;
		System.out.println("double:"+d2);
		
		Boolean b=false;
		boolean b2=b;
		System.out.println("boolean:"+b2);
		
		Character c='k';
		char c2=c;
		System.out.println("char:"+c2);
	}
}

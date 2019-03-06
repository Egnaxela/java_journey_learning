/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午2:24:07  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午2:24:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E05_DataOnly {
	int i;
	double d;
	boolean b;
	
	public static void main(String[] args) {
		E05_DataOnly data=new E05_DataOnly();
		data.i=47;
		data.d=1.1;
		data.b=false;
		System.out.println("i="+data.i);
		System.out.println("d="+data.d);
		System.out.println("b="+data.b);
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午2:34:28  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午2:34:28  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E07_Incrementable {
	static void increment() {
		StaticTest.i++;
	}
	
	public static void main(String[] args) {
		E07_Incrementable incrementable=new E07_Incrementable();
		incrementable.increment();
		E07_Incrementable.increment();
		increment();
	}
}

class StaticTest{
	static int i=47;
}

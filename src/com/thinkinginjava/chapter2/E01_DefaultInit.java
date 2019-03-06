/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月5日 下午9:36:41  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月5日 下午9:36:41  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月5日      Pluto       1.0         1.0 Version  
 */

public class E01_DefaultInit {
	int i;
	char c;
	
	public E01_DefaultInit(){
		System.out.println("i="+i);
		System.out.println("c="+c);
	}
	
	public static void main(String[] args) {
		new E01_DefaultInit();
	}
}

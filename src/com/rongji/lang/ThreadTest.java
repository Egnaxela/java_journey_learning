/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月25日 下午2:48:12  
 *  
 */  

package com.rongji.lang;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月25日 下午2:48:12  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月25日      Eg                      1.0         1.0 Version  
 */

public class ThreadTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Time1: "+System.currentTimeMillis());
		Thread.sleep(1000);
		System.out.println(Thread.currentThread().getName());
		System.out.println("Time2: "+System.currentTimeMillis());
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月19日 下午3:52:59  
 *  
 */  

package com.practicehighconcurrency;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月19日 下午3:52:59  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月19日      Eg                      1.0         1.0 Version  
 */

public class ThreadTest {
	
	public static void main(String[] args) {
		Thread t1=new Thread() {
			@Override
			public void run() {
				System.out.println("H");
			}
		};
		
		t1.start();
	}

}

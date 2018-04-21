/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月19日 下午6:01:36  
 *  
 */  

package com.practicehighconcurrency;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月19日 下午6:01:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月19日      Eg                      1.0         1.0 Version  
 */

public class ThreadInterrupt {
	public static void main(String[] args) throws InterruptedException {
		Thread t=new Thread() {
			@Override
			public void run() {
				while(true) {
					if(Thread.currentThread().isInterrupted()) {
						System.out.println("Interruted!");
						break;
					}
					Thread.yield();
				}
			}
		};
		
		t.start();
		Thread.sleep(200);
		t.interrupt();
		
		
	}
}

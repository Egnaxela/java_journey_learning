/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年6月28日 下午12:22:33  
 *  
 */  

package com.rongji.thread;

import java.util.concurrent.TimeUnit;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年6月28日 下午12:22:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月28日      吴有根                      1.0         1.0 Version  
 */

public class StopThread {

	private static boolean stopRequested;
	
	private static synchronized void requestStop(){
		stopRequested=true;
	}
	
	private static synchronized boolean stopRequest(){
		return stopRequested;
	}
	
	public static void main(String[] args) throws InterruptedException{
		Thread t1=new Thread(new Runnable() {
			@Override
			public void run() {
				int i=0;
				while(!stopRequest()){
					System.out.println(i+" ");
					i++;
				}
			}
		});
		
		t1.start();
		TimeUnit.SECONDS.sleep(1);
		requestStop();
	}
}

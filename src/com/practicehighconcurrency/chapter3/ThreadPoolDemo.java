/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月15日 下午3:40:35  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.springframework.scheduling.config.Task;


/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月15日 下午3:40:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月15日      Pluto       1.0         1.0 Version  
 */

public class ThreadPoolDemo {
	public static void main(String[] args) {
		MyTask task=new MyTask();
		ExecutorService es=Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++) {
			es.submit(task);
		}
		
	}
	
	public static class MyTask implements Runnable{
		@Override
		public void run() {
			System.out.println(System.currentTimeMillis()+":Thread ID: "+Thread.currentThread().getId());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月15日 下午4:12:36  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月15日 下午4:12:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月15日      Pluto       1.0         1.0 Version  
 */

//扩展线程池 
public class ExThreadPoolDemo {
	public static class MyTask implements Runnable{
		String name;
	
		public MyTask(String name) {
			this.name=name;
		}
		
		@Override
		public void run() {
			System.out.println("正在执行: "+":Thread ID: "+Thread.currentThread().getId()+",Task Name: "+name);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService es=new ThreadPoolExecutor(5, 5, 0L, TimeUnit.MILLISECONDS, 
				new LinkedBlockingQueue<Runnable>()) {
			@Override
			protected void beforeExecute(Thread t,Runnable r) {
				System.err.println("准备执行: "+ ((MyTask)r).name);
			}
			
			@Override
			protected void afterExecute(Runnable r,Throwable t) {
				System.err.println("执行完成: "+ ((MyTask)r).name);
			}
			
			@Override
			protected void terminated() {
				System.err.println("线程池退出。。。");
			}
			
		};
		
		for(int i=0;i<10;i++) {
			MyTask task=new MyTask("Task-"+i);
			es.execute(task);
			Thread.sleep(10);
		}
		es.shutdown();
	}
}

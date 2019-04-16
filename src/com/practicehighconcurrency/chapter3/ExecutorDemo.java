/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月15日 下午3:40:20  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.practicehighconcurrency.chapter3.ThreadPoolDemo.MyTask;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月15日 下午3:40:20  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月15日      Pluto       1.0         1.0 Version  
 */

public class ExecutorDemo {

	public static void main(String[] args) {
		MyTask task=new MyTask();
		ExecutorService es=Executors.newFixedThreadPool(5);//返回一个固定线程数量的线程池，一有线程空闲就立即执行
		ExecutorService es2=Executors.newSingleThreadExecutor();//返回只有一个线程的线程池
		ExecutorService es3=Executors.newCachedThreadPool();//返回一个不定数量线程的线程池
		
		ExecutorService es4=Executors.newSingleThreadScheduledExecutor();//返回一个ScheduledExecutorService对象，线程池大小为1
		ExecutorService es5=Executors.newScheduledThreadPool(5);//返回一个ScheduledExecutorService对象，线程池大小可指定
		
		for(int i=0;i<10;i++) {
//			es.submit(task);
//			es2.submit(task);
			es3.submit(task);
//			es4.submit(task);
//			es5.submit(task);
			
		}
	}
}

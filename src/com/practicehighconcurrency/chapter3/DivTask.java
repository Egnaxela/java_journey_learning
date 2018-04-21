/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午6:24:45  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午6:24:45  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class DivTask implements Runnable {
	
	int a,b;
	public DivTask(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	@Override
	public void run() {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ThreadPoolExecutor pool=new ThreadPoolExecutor(0, Integer.MAX_VALUE, 0, TimeUnit.SECONDS, new SynchronousQueue<Runnable>());
		for(int i=0;i<5;i++) {
			//pool.submit(new DivTask(100,i));//使用submit 线程池不会抛出异常堆栈信息
			
			//pool.execute(new DivTask(100, i)); //可以使用execute  线程池会抛出异常堆栈信息
			
			Future<?> result=pool.submit(new DivTask(100, i));
			result.get();
		}
		
	}
}

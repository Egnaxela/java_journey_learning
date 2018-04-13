/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午4:46:46  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午4:46:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class SemaphoreDemo implements Runnable{
	
	Semaphore semp=new Semaphore(5);
	@Override
	public void run() {
		try {
			semp.acquire();//尝试获得一个准入许可,若无法获得则线程会等待。 直到有线程释放一个许可或当前线程被中断。
			Thread.sleep(2000);
			System.out.println(Thread.currentThread().getId()+"done");
			semp.release();//释放信号量
		} catch (Exception e) {
			
		}
	}
	
	public static void main(String[] args) {
		ExecutorService exec= Executors.newFixedThreadPool(20);
		final SemaphoreDemo demo=new SemaphoreDemo();
		for(int i=0;i<20;i++) {
			exec.submit(demo);
		}
	}
	
	
}

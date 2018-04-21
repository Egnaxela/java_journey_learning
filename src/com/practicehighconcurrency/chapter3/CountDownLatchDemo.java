/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午5:33:33  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午5:33:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class CountDownLatchDemo implements Runnable{

	//生成一个需要10个线程来完成任务的 倒计数器
	static CountDownLatch countDownLatch=new CountDownLatch(10);
	static CountDownLatchDemo demo=new CountDownLatchDemo();
	@Override
	public void run() {
		try {
			Thread.sleep(new Random().nextInt(10)*1000);
			System.out.println(Thread.currentThread().getName()+" check complete");
			countDownLatch.countDown();//通知CountDownLatch 一个线程已经执行完毕，计数可以减一
			System.out.println("*************"+countDownLatch.getCount());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ExecutorService exec=Executors.newFixedThreadPool(10);
		for(int i=0;i<10;i++) {
			exec.submit(demo);
		}
		countDownLatch.await();//要求主线程等待countDownLatch所有的线程执行完毕，执行完毕后才可以执行后面的
		System.out.println("Fire");
		exec.shutdown();
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(4*0.1*(1+2));
	}

}

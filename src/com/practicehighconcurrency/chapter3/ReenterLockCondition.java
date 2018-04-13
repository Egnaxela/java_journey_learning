/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午4:03:26  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午4:03:26  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class ReenterLockCondition implements Runnable{
	
	public static ReentrantLock lock=new ReentrantLock();
 	public static Condition condition=lock.newCondition();
	@Override
	public void run() {
		try {
			lock.lock();
			condition.await();//使得当前线程等待，同时释放锁。
			System.out.println("Thread is going ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReenterLockCondition t=new ReenterLockCondition();
		Thread t1=new Thread(t);
		t1.start();
		Thread.sleep(1000);
		
		lock.lock();
		condition.signal();//如果调用之前没有获得锁，就会抛出 java.lang.IllegalMonitorStateException异常
		//signal 唤醒等待中的线程，类似于Object的notify方法。
		lock.unlock();
		
	}
	
	/*
	 * ReentrantLock、Condition在java.util.concurrent.ArrayBlockingQueue
	 * 中的put 和 take方法中有使用到。
	 * 
	 * */

}

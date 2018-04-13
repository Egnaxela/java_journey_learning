/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午5:05:48  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午5:05:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class ReadWriteLockDemo {
	static Lock lock=new ReentrantLock();
	
	static ReentrantReadWriteLock readWriteLock=new ReentrantReadWriteLock();
	static Lock readLock=readWriteLock.readLock();
	static Lock writeLock=readWriteLock.writeLock();
	static int value;
	
	public Object handleRead(Lock lock) throws InterruptedException {
		try {
			lock.lock();
			Thread.sleep(1000);
			return value;
		} finally {
			lock.unlock();
		}
	}
	
	public void handleWrite(Lock lock,int index) throws InterruptedException {
		try {
			lock.lock();
			Thread.sleep(1000);
			value=index;
		} finally {
			lock.unlock();
		}
	}
	
	public static void main(String[] args) {
		ReadWriteLockDemo demo=new ReadWriteLockDemo();
		Runnable readRunnable=new Runnable() {
			@Override
			public void run() {
				try {
				//	demo.handleRead(readLock);
					demo.handleRead(lock);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		Runnable writeRunnable=new Runnable() {
			@Override
			public void run() {
				try {
					//demo.handleWrite(writeLock, new Random().nextInt());
					demo.handleWrite(lock, new Random().nextInt());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		};
		
		for(int i=0;i<18;i++) {
			new Thread(readRunnable).start();
		}
		
		for(int i=18;i<20;i++) {
			new Thread(writeRunnable).start();
		}
		
	}
}

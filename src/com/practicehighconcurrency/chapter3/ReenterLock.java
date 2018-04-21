/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月13日 下午3:25:51  
 *  
 */  

package com.practicehighconcurrency.chapter3;

import java.util.concurrent.locks.ReentrantLock;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月13日 下午3:25:51  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月13日      Eg                      1.0         1.0 Version  
 */

public class ReenterLock implements Runnable {

	//ReentrantLock可重入锁
	public static ReentrantLock lock=new ReentrantLock();
	public static int i=0;
	
	@Override
	public void run() {
		for(int j=0;j<100_0000;j++) {
			//ReentrantLock 可重入锁 与synchronized相比更加灵活，可以手动指定何时加锁，何时释放锁
			lock.lock();
			try {
				i++;
			} finally {
				lock.unlock();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ReenterLock t=new ReenterLock();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		t1.start();t2.start();
		t1.join();t2.join();
		System.out.println(i);
		
	}
	

}

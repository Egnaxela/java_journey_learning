/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月12日 下午4:50:22  
 *  
 */  

package com.practicehighconcurrency.collections;

import java.util.ArrayList;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月12日 下午4:50:22  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月12日      Eg                      1.0         1.0 Version  
 */

public class ArrayListMultiThread {
	static ArrayList<Integer> al=new ArrayList<>();
	public static class AddThread implements Runnable{
		@Override
		public void run() {
			for(int i=0;i<1000000;i++) {
				al.add(i);
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new AddThread());
		Thread t2=new Thread(new AddThread());
		t1.start();
		t2.start();
		t1.join();
		t2.join();//join表示t1 t2 加入主线程，主线程要等加入的线程执行完成后再一起往前走，否则al.size可能是一个非常小的值或者是0
		System.out.println(al.size());
	}
	
	/**
	 * 1、程序正常执行结束
	 * 2、程序抛出异常，如Exception in thread "Thread-1" java.lang.ArrayIndexOutOfBoundsException: 22
	 * 因为ArrayList在扩容的时候，没有锁的保护，另外的一个线程访问到了不一样的内部状态，导致越界情况。
	 * 
	 */
}

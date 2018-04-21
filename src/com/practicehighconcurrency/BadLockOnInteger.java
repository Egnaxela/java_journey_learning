/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月12日 下午5:25:38  
 *  
 */  

package com.practicehighconcurrency;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月12日 下午5:25:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月12日      Eg                      1.0         1.0 Version  
 */

public class BadLockOnInteger implements Runnable {

	public static Integer i=0 ;
	static BadLockOnInteger instance=new BadLockOnInteger();
	@Override
	public void run() {
		for(int j=0;j<100000;j++) {
			synchronized (instance) {
				i++;
			}
		}
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(instance);
		Thread t2=new Thread(instance);
		t1.start();
		t2.start();
		t1.join(); t2.join();
		System.out.println(i);
	}
	
	/**
	 * i++的本质是新建一个Integer对象并将它赋值给i
	 * 因为i对象一直在变，多个线程每次加锁可能加在不同的对象上面。
	 * 
	 * 方法：synchronized(i) 改为synchronized(instance)
	 * 
	 */
	

}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月12日 下午4:22:31  
 *  
 */  

package com.practicehighconcurrency;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月12日 下午4:22:31  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月12日      Eg                      1.0         1.0 Version  
 */

public class SimpleWN {
	final static Object object=new Object();
	public static class T1 extends Thread{
		public void run() {
			synchronized (object) {
				System.out.println(System.currentTimeMillis()+ "T1 Start");
				try {
					System.out.println(System.currentTimeMillis()+"T1 wait for object ");
					object.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(System.currentTimeMillis()+ "T1 is end");
			}
		}
	}
	
	public static class T2 extends Thread{
		public void run() {
			synchronized (object) {
				System.out.println(System.currentTimeMillis()+"T2 start! notify one thread ");
				object.notify();
				System.out.println(System.currentTimeMillis()+" T2 end");
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Thread t1=new T1();
		Thread t2=new T2();
		t1.start();
		t2.start();
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月14日 下午4:41:19  
 *  
 */  

package com.highconcurrencypractice;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月14日 下午4:41:19  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月14日      Pluto       1.0         1.0 Version  
 */

public class ThreadTest {
	
	private int count=0;
	
	private void add() {
		for(int i=0;i<10000;i++) {
			count++;
		}
	}
	
	private static int calc() throws InterruptedException {
		ThreadTest test=new ThreadTest();
		Thread t1=new Thread() {
			@Override
			public void run() {
				test.add();
			}
		};
		
		Thread t2=new Thread() {
			@Override
			public void run() {
				test.add();
			}
		};
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		return test.count;
	}
	
	public static void main(String[] args) throws InterruptedException {
		int result=calc();
		System.out.println(result);
	}

}

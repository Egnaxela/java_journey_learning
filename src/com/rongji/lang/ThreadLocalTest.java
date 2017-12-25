/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月22日 上午10:59:23  
 *  
 */  

package com.rongji.lang;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月22日 上午10:59:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月22日      Eg                      1.0         1.0 Version  
 */

public class ThreadLocalTest {
	
	private static final ThreadLocal<Integer> value=new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};
	
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++) {
			new Thread(new MyThread(i)).start();
		}
	}
	
	static class MyThread implements Runnable{
		private int index;
		public MyThread(int index) {
			this.index=index;
		}
		
		@Override
		public void run() {
			System.out.println("线程 "+index+"的初始化value: "+value.get());
			for(int i=0;i<10;i++) {
				value.set(value.get()+i);
			}
			System.out.println("线程"+index+"的累加value:"+value.get());
		}
		
//		@Override
//		public void run() {
//			Integer value=0;
//			System.out.println("线程 "+index+"的初始化value: "+value);
//			for(int i=0;i<10;i++) {
//				value=(value+i);
//			}
//			System.out.println("线程"+index+"的累加value:"+value);
//		}
		
	}
		
	
}

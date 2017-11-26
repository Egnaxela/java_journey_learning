/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月21日 上午10:02:33  
 *  
 */  

package com.interview;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月21日 上午10:02:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月21日      Eg                      1.0         1.0 Version  
 */

public class ThreadLocalTest {

	/*
	 * ThreadLocal提供本线程内的局部变量,在本线程内可以随时取用,隔离其他的线程
	 * 
	 */

	private static final ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
		@Override
		protected Integer initialValue() {
			return 0;
		}
	};

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new MyThread(i)).start();
		}
	}

	static class MyThread implements Runnable {

		private int index;

		public MyThread(int index) {
			this.index = index;
		}

		@Override
		public void run() {
			System.out.println("线程" + index + "的初始值" + value.get());
			for (int i = 0; i < 10; i++) {
				value.set(value.get() + i);
			}
			System.out.println("线程" + index + "累加值" + value.get());
		}

	}

}

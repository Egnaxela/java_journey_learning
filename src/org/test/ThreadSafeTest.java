/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月15日 下午3:25:55  
 *  
 */  

package org.test;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月15日 下午3:25:55  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月15日      Eg          1.0         1.0 Version  
 */

public class ThreadSafeTest {

	public static void main(String[] args) {
		final Object lock = new Object();
		Count count = new Count();
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				synchronized (lock) {
					for (int i = 0; i < 10000; i++) {
						count.increment();
					}
				}
			}
		};

		List<Thread> threads = new ArrayList<>(10);
		for (int i = 0; i < 10; i++) {
			Thread thread = new Thread(runnable);
			threads.add(thread);
			thread.start();
		}
		while (true) {
			if (allThreadTerminated(threads)) {// 所有线程运行结束
				System.out.println(count.get());
				break;
			}
		}

	}

	private static boolean allThreadTerminated(List<Thread> threads) {
		for (Thread thread : threads) {
			if (thread.isAlive()) {
				return false;
			}
		}
		return true;
	}
}

class Count{
	private int num;
	public void increment() {
		num++;
	}
	public int get() {
		return num;
	}
}

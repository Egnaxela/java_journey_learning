/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月15日 下午3:50:42  
 *  
 */  

package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月15日 下午3:50:42  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月15日      Eg                      1.0         1.0 Version  
 */

public class ThreadSafe2Test {
	public static void main(String[] args) {
		AtomicInteger count = new AtomicInteger(0);
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 10000; i++) {
					count.incrementAndGet();
				}
			}
		};

		List<Thread> threads = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(runnable);
			t.setName("线程" + i);
			t.start();
			threads.add(t);
		}

		while (true) {
			if (allterminate(threads)) {
				System.out.println(count);
				break;
			}
		}

	}
	
	private static boolean allterminate(List<Thread> threads) {
		for(Thread thread:threads) {
			if(thread.isAlive()) {
				return false;
			}
		}
		
		return true;
	}
}


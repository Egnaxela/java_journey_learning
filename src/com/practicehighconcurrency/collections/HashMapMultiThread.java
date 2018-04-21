/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月12日 下午5:13:32  
 *  
 */  

package com.practicehighconcurrency.collections;

import java.util.HashMap;
import java.util.Map;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月12日 下午5:13:32  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月12日      Eg                      1.0         1.0 Version  
 */

public class HashMapMultiThread {
	static Map<String, String> map=new HashMap<String, String>();
	public static class AddThread implements Runnable{
		int start=0;
		
		public AddThread(int start) {
			this.start=start;
		}
		
		@Override
		public void run() {
			for(int i=start;i<100000;i+=2) {
				map.put(Integer.toString(i), Integer.toBinaryString(i));
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		Thread t1=new Thread(new HashMapMultiThread.AddThread(0));
		Thread t2=new Thread(new HashMapMultiThread.AddThread(1));
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println(map.size());
	}
	
}

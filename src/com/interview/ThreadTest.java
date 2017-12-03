/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月21日 上午11:32:09  
 *  
 */  

package com.interview;

import java.util.concurrent.ThreadPoolExecutor;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月21日 上午11:32:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月21日      Eg                      1.0         1.0 Version  
 */

public class ThreadTest {

	public static void main(String[] args) { //1755.0MB   123.5MB
		System.out.println("**MAXMemory**"+Runtime.getRuntime().maxMemory()/(double)(1024*1024)+"MB");
		System.out.println("**TotalMemor***"+Runtime.getRuntime().totalMemory()/(double)(1024*1024)+"MB");
		for(int i=0;i<10;i++) {
			new Thread(new MyThread()).start();
		}
		
		System.out.println("****"+UnicodeUtils.string2Unicode("保存"));
		System.out.println("****"+UnicodeUtils.string2Unicode("发送消息"));
		System.out.println("****"+UnicodeUtils.unicode2String("\\u53d1\\u9001\\u6d88\\u606f"));

	}

	
}

class MyThread implements Runnable{
	@Override
	public void run() {
		System.out.println("当前线程:"+Thread.currentThread().getName());
	}
}

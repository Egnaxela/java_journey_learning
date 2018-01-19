/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月28日 下午3:24:09  
 *  
 */  

package com.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月28日 下午3:24:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月28日      Eg                      1.0         1.0 Version  
 */

public class HelloRunnable implements Runnable {


	
	@Override
	public void run() {
		System.out.println("A:"+Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
//		Method method=ThreadTest.class.getDeclaredMethod("initClassLoaders", (Class[])null);
//		method.setAccessible(true);
//		method.invoke(new ThreadTest(), (Object[])null);
//		new Thread(new HelloRunnable()).start();
		Calendar calendar=Calendar.getInstance();
	//	calendar.add(Calendar.MONTH, -1);
		calendar.getTime();
		System.out.println(calendar.getTime());//Sat Dec 09 16:18:09 GMT+08:00 2017
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月27日 下午5:46:32  
 *  
 */  

package com.test;

import java.lang.Thread.State;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月27日 下午5:46:32  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月27日      Eg                      1.0         1.0 Version  
 */

public class ThreadTest {

	private ClassLoader extApiClassLoader;
	private static ThreadTest daemon=null;
	
	private void initClassLoaders() {
	//	Thread.currentThread().setContextClassLoader(extApiClassLoader);
		ClassLoader cl=Thread.currentThread().getContextClassLoader();
		System.out.println(cl);
	}
	
	public static void main(String[] args) {
		if(daemon==null) {
			daemon=new ThreadTest();
		}
		try {
			daemon.initClassLoaders();
		}catch (Exception e) {
			e.printStackTrace();
			return;
		}
		
	}
	
	@Test
	public void  test() {
		State state=new Thread().getState();
		for(State s:state.values()) {
			System.out.println(s);
		}
		
		Thread t1=new Thread() {
			@Override
			public void run() {
				System.out.println("Hi "+Thread.currentThread().getName());
				
			}
		};
		
		t1.start();
	}
}

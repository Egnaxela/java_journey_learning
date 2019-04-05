/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月28日 下午12:00:59  
 *  
 */  

package com.test;


/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月28日 下午12:00:59  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月28日      Eg                      1.0         1.0 Version  
 */

public class RuntimeTest {
	public static void main(String[] args) throws Exception {
		SecurityManager sc=System.getSecurityManager();
		if(sc!=null) {
			sc.checkExit(1);
		}
		Runtime runtime=Runtime.getRuntime();
		System.out.println("可用处理器数目: "+runtime.availableProcessors());
		System.out.println("JVM中内存总量: "+runtime.totalMemory()/1024/1024+"MB");
		
		String [] cmd={"cmd","/C","start copy exe1 exe2"}; 
		Runtime.getRuntime().exec(cmd);
		Runtime.getRuntime().exec("calc");
		
		Runtime.getRuntime().exit(1);
		System.out.println("JVM中内存总量:"+runtime.totalMemory());
	}
}

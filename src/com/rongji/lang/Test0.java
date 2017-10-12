/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年7月25日 上午9:22:29  
 *  
 */  

package com.rongji.lang;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年7月25日 上午9:22:29  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年7月25日      Eg                      1.0         1.0 Version  
 */

public class Test0 {
	
	@Test
	public void test1() {
		for (int i = 0; i < 10; i++) {
		    System.out.println((Integer) i);
		}
	}
	
	@Test
	public void test2() {
		long circleNum =7619241/100;
		System.out.println("total:"+circleNum);
	}
	
	@Test
	public void test3() {
		Calendar rightnow=Calendar.getInstance();
		int s=rightnow.get(99);
		System.out.println(rightnow);
		System.out.println(s);
	}
	
	
	@Test
	public void test4() throws IOException {
		System.out.println("----"+System.getProperties());
		System.out.println("user.name:"+System.getProperty("user.name"));
		System.out.println("user.home:"+System.getProperty("user.home"));
		System.out.println("user.dir:"+System.getProperty("user.dir"));
		System.out.println("----"+System.getProperty("catalina.home"));
		System.out.println("*****"+System.getSecurityManager());
		File bootstrapJar=new File(System.getProperty("user.dir"),"catalina.xml");
		bootstrapJar.createNewFile();
	}
}

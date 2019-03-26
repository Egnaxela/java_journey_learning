/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月26日 下午7:59:25  
 *  
 */  

package com.designPattern.creational.singleton;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月26日 下午7:59:25  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月26日      Pluto       1.0         1.0 Version  
 */

public class StaticInnerClassSingleton {
	private StaticInnerClassSingleton() {
		
	}
	
	//基于静态内部类的单例模式
	//静态内部类在初始化时，会对静态内部类加锁。
	private static class InnerClass{
		private static StaticInnerClassSingleton staticInnerClassSingleton=new StaticInnerClassSingleton();
	}
	
	public static StaticInnerClassSingleton getInstance() {
		return InnerClass.staticInnerClassSingleton;
	}
}

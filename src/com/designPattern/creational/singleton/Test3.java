/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月27日 下午6:46:05  
 *  
 */  

package com.designPattern.creational.singleton;

import java.lang.reflect.Constructor;

import sun.launcher.resources.launcher;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月27日 下午6:46:05  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月27日      Pluto       1.0         1.0 Version  
 */

public class Test3 {
	public static void main(String[] args) throws Exception {
//		Constructor constructor=HungrySingleton.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		HungrySingleton instance=HungrySingleton.getInstance();
//		HungrySingleton instance2=(HungrySingleton) constructor.newInstance();
//		System.out.println(instance);
//		System.out.println(instance2);
//		System.out.println(instance==instance2);
		
		
		
		Constructor constructor=LazySingletonDoubleChecked.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		LazySingletonDoubleChecked instance4=(LazySingletonDoubleChecked) constructor.newInstance();
		LazySingletonDoubleChecked instance3=LazySingletonDoubleChecked.getInstance();
		//懒汉式的单例模式无法避免反射攻击
		System.out.println(instance3);
		System.out.println(instance4);
		System.out.println(instance3==instance4);
	}
}

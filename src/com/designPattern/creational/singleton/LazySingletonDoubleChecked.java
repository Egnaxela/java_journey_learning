/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月26日 下午6:57:11  
 *  
 */  

package com.designPattern.creational.singleton;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月26日 下午6:57:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月26日      Pluto       1.0         1.0 Version  
 */

public class LazySingletonDoubleChecked {

	// 声明一个静态的需要被单例化的一个对象  禁止指令重排
	private static volatile LazySingletonDoubleChecked lazySingleton = null;

	// 私有化构建器
	private LazySingletonDoubleChecked() {

	}

	//使用双重校验锁
	public static LazySingletonDoubleChecked getInstance() {
		if (lazySingleton == null) {
			synchronized (LazySingletonDoubleChecked.class) {
				if(lazySingleton==null) {
					lazySingleton=new LazySingletonDoubleChecked();
					//1.分配内存给这个对象
					//2.初始化对象
					//3.设置lazySingleton对象指向分配的内存
					//2 3步骤可能会指令重排，存在隐患。
				}
			}
		}
		return lazySingleton;
	}
}

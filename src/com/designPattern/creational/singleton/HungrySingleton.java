/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月26日 下午8:08:08  
 *  
 */  

package com.designPattern.creational.singleton;

import java.io.Serializable;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月26日 下午8:08:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月26日      Pluto       1.0         1.0 Version  
 */

public class HungrySingleton implements Serializable{
	
	//测试反序列化时添加的  FIXME
	private static final long serialVersionUID = 5454112183513574382L;
	
	//在类加载的时候就初始化
	private final static HungrySingleton hungrySingleton;
	
	static {
		hungrySingleton=new HungrySingleton();
	}
	
	private HungrySingleton() {
		//反射防御
		if(hungrySingleton!=null) {
			throw new  RuntimeException("单例模式禁止反射调用");
		}
	}
	
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}

	//测试反序列化时添加的
	private Object readResolve() {
		return hungrySingleton;
	}
}

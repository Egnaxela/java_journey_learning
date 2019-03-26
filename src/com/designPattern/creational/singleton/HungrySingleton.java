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

public class HungrySingleton {
	
	//在类加载的时候就初始化
	private final static HungrySingleton hungrySingleton;
	
	static {
		hungrySingleton=new HungrySingleton();
	}
	
	private HungrySingleton() {
		
	}
	
	public static HungrySingleton getInstance() {
		return hungrySingleton;
	}

}

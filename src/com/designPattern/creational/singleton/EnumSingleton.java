/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月28日 下午5:18:24  
 *  
 */  

package com.designPattern.creational.singleton;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月28日 下午5:18:24  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月28日      Pluto       1.0         1.0 Version  
 */

public enum EnumSingleton {
	INSTANCE;
	private Object data;

	/**
	 * @return the data
	 */
	public Object getData() {
		return data;
	}

	/**
	 * @param data the data to set
	 */
	public void setData(Object data) {
		this.data = data;
	}
	
	public static EnumSingleton getInstance() {
		return INSTANCE;
	}
	
}

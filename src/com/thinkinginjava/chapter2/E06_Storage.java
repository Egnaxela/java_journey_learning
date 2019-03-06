/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午2:27:49  
 *  
 */  

package com.thinkinginjava.chapter2;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午2:27:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E06_Storage {
	
	int storage(String s) {
		return s.length()*2;
	}
	
	public static void main(String[] args) {
		E06_Storage storage=new E06_Storage();
		int length=storage.storage("love");
		System.out.println(length);
	}
}

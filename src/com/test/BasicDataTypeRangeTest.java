/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月18日 下午3:00:07  
 *  
 */  

package com.test;

import java.lang.reflect.Method;
import java.util.Map;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月18日 下午3:00:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月18日      Eg                      1.0         1.0 Version  
 */

public class BasicDataTypeRangeTest {

	public static void main(String[] args) {
		System.out.println(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		System.out.println(Short.MIN_VALUE+"~"+Short.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE+"~"+Integer.MAX_VALUE);
		System.out.println(Long.MIN_VALUE+"~"+Long.MAX_VALUE);
		System.out.println(Float.MIN_VALUE+"~"+Float.MAX_VALUE);
		System.out.println(Double.MIN_VALUE+"~"+Double.MAX_VALUE);
		System.out.println(Character.MIN_VALUE+"~"+Character.MAX_VALUE);
		
		Method[] methods=Map.class.getDeclaredMethods();
		for(int i=0;i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
	}
}

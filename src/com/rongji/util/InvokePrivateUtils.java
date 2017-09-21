/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年8月1日 下午7:57:08  
 *  
 */  

package com.rongji.util;

import java.lang.reflect.Method;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年8月1日 下午7:57:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月1日      Eg                      1.0         1.0 Version  
 */

public class InvokePrivateUtils {

	public static Object getPrivateMethods(Object obj,String methodName,Object  args) throws Exception {
		Class class1=obj.getClass();
		Method method=class1.getDeclaredMethod(methodName, args.getClass());
		method.setAccessible(true);
		return method.invoke(class1.newInstance(), args);
	}
	
}

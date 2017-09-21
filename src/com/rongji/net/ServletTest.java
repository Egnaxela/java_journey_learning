/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年8月1日 下午7:39:40  
 *  
 */

package com.rongji.net;

import java.lang.reflect.Method;

import com.rongji.util.InvokePrivateUtils;

/**
 * Description: Copyright: Copyright (c)2017 Company: rongji
 * 
 * @author: 吴有根
 * @version: 1.0 
 * Create at: 2017年8月1日 下午7:39:40
 * Modification History:
 * Date 			Author 		Version 		Description
 * ------------------------------------------------------------------
 * 2017年8月1日 		吴有根		 1.0 			1.0 Version
 */

public class ServletTest {

	public static void main(String args[]) throws Exception {
		String str=(String)InvokePrivateUtils.getPrivateMethods(new SocketTest(), "pocket","192.168.1.110");
		System.out.println(str);
		
		Class<SocketTest> class1=SocketTest.class;
		Method method=class1.getDeclaredMethod("pocket2", String.class,int.class);
		method.setAccessible(true);
		String str2=(String) method.invoke(class1.newInstance(), "哈哈",22);
		System.out.println(str2);
		
	}

}
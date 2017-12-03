/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月14日 下午3:05:53  
 *  
 */  

package com.interview;
import static java.lang.System.out;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月14日 下午3:05:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月14日      Eg                      1.0         1.0 Version  
 */

public class ObjectTest {

	public static void main(String[] args) {
	
		String str2="234";
		String str3=new String("234");
		
		/*
		 * 返回对象的hash值。
		 * HashCode的常规协定：
		 * 1、在Java应用程序执行期间，在对同一对象多次调用hashCode方法时，必须返回一致相同的整数
		 * 2、如果根据equals(Object)方法，两个对象是相等，那么对这两个对象调用hashCode方法也会生成相同的整数结果
		 */
		out.println(str2.hashCode());
		out.println(str3.hashCode());
		out.println(System.identityHashCode(str2));
		out.println(System.identityHashCode(str3));
		
	}
}

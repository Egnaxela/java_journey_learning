/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年1月10日 下午3:46:04  
 *  
 */  

package com.util;

import org.openjdk.jol.info.ClassLayout;
import org.openjdk.jol.util.VMSupport;

import com.util.concurrent.AtomicIntegerTest;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年1月10日 下午3:46:04  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月10日      Eg                      1.0         1.0 Version  
 */

public class ObjectLayoutUtil {

	public static void main(String[] args) {
		System.out.println(VMSupport.vmDetails());
		System.out.println(ClassLayout.parseClass(AtomicIntegerTest.class).toPrintable());
	}
}

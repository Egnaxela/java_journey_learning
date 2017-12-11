/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月11日 下午7:34:58  
 *  
 */  

package com.util;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月11日 下午7:34:58  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月11日      Eg                      1.0         1.0 Version  
 */

public class StringUtils {

	/**
	 * 
	* <p>描述:spring.core.utils</p>
	* @param str
	* @return
	* @author Eg
	* @since 3.2.1
	 */
	public static boolean isEmpty(Object str) {
		return (str==null||"".equals(str));
	}
}

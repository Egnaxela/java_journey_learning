/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年9月18日 下午12:11:15  
 *  
 */  

package com.rongji.lang;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年9月18日 下午12:11:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年9月18日      吴有根                      1.0         1.0 Version  
 */

public class DataUtilsTest {

	private static SimpleDateFormat sdf=new SimpleDateFormat();
	private static final String pattern="yyyyMMddHHmmssSSS";
	@Test
	public void test() {
	
		String str=getDateFormat(new Date(), pattern);
		System.out.println("----- "+str);
	}
	
	public static synchronized String getDateFormat(Date date,String pattern) {
		if(date==null) {
			return "";
		}
		
		synchronized (sdf) {
			String str=null;
			sdf.applyPattern(pattern);
			str=sdf.format(date);
			return str;
		}
		
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月20日 下午2:18:15  
 *  
 */  

package com.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月20日 下午2:18:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月20日      Eg                      1.0         1.0 Version  
 */

public class MyClassLoader {

	public static void main(String[] args) throws ParseException {
		Date operDate = new SimpleDateFormat("yyyy-MM-dd").parse("2017-11-20");
		System.out.println("***"+MyClassLoader.class.getName());
		System.out.println("***"+MyClassLoader.class.getSimpleName());
		System.out.println("***"+MyClassLoader.class.getClassLoader());
		System.out.println("***"+MyClassLoader.class.getClassLoader().getParent());
		System.out.println("***"+MyClassLoader.class.getClassLoader().getParent().getParent());
		
	}
}

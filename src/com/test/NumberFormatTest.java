/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月5日 下午5:53:27  
 *  
 */  

package com.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月5日 下午5:53:27  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月5日      Eg                      1.0         1.0 Version  
 */

public class NumberFormatTest {
	
	public static void main(String[] args) throws Exception {
		System.out.println(NumberFormat.getInstance().parse("12.34").intValue());
		System.out.println(Locale.US.getDisplayLanguage());
		System.out.println(NumberFormat.getCurrencyInstance().format(12.34));
	}

}

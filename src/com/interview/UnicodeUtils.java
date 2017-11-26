/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月22日 上午11:13:32  
 *  
 */  

package com.interview;

import org.springframework.util.StringUtils;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月22日 上午11:13:32  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月22日      Eg                      1.0         1.0 Version  
 */

public class UnicodeUtils {

	public static String unicode2String(String unicode) {
		if(StringUtils.isEmpty(unicode))
			return "";
		StringBuilder sb=new StringBuilder();
		int i=-1;
		int pos=0;
		while((i=unicode.indexOf("\\u",pos))!=-1) {
			sb.append(unicode.substring(pos,i));
			if(i+5<unicode.length()) {
				pos=i+6;
				sb.append((char)Integer.parseInt(unicode.substring(i+2,i+6),16));
			}
		}
		return sb.toString();
	}
	
	public static String string2Unicode(String str) {
		if(StringUtils.isEmpty(str))
			return "";
		StringBuffer unicode=new StringBuffer();
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			//转unicode
			unicode.append("\\u"+Integer.toHexString(c));
		}
		return unicode.toString();
	}
}

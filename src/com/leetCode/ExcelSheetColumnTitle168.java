/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月20日 下午4:24:39  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月20日 下午4:24:39  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月20日      Eg                      1.0         1.0 Version  
 */

public class ExcelSheetColumnTitle168 {
	public static void main(String[] args) {
		System.out.println(convertToTitle(731));
		System.out.println(convertToTitle2(731));
	}
	
	public static String convertToTitle(int n) {
		StringBuilder result=new StringBuilder();
		while(n>0) {
			n--;
			result.insert(0, (char)(n%26+'A'));
			n/=26;
		}
		return result.toString();
	}
	
	public static String convertToTitle2(int n) {
		return n == 0 ? "" : convertToTitle(--n / 26) + (char)('A' + (n % 26));
	}
}

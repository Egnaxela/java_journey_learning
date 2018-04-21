/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月20日 下午3:15:06  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月20日 下午3:15:06  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月20日      Eg                      1.0         1.0 Version  
 */

public class ExcelSheetColumnNumber171 {

	public static void main(String[] args) {
		System.out.println(titleToNumber("ABC"));
		System.out.println(titleToNumber2(""));
	}
	
	public static int titleToNumber(String s) {
		if(s==null||s.length()<1) return 0;
		int sum=0,temp=0;
		for(int i=0;i<s.length();i++) {
		    temp=s.charAt(i)-'A'+1;
			sum=26*sum+temp;
		}
		return sum;
	}
	
	public static int titleToNumber2(String s) {
		int sum=0;
		for(int i=0;i<s.length();i++) {
			sum+=(s.charAt(i)-'A'+1)*Math.pow(26, s.length()-i-1);
		}
		return sum;
	}
	
	public static int titleToNumber3(String s) {
		int sum = 0;
		int exp = 1;
		for (int i = s.length() - 1; i >= 0; --i) {
			sum += (s.charAt(i) - 'A' + 1) * exp;
			exp *= 26;
		}
		return sum;
	}
}

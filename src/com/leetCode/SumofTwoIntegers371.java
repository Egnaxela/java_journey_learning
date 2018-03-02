/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月2日 下午2:40:09  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月2日 下午2:40:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月2日      Eg                      1.0         1.0 Version  
 */

/*
Calculate the sum of two integers a and b, 
but you are not allowed to use the operator + and -.

Example:
Given a = 1 and b = 2, return 3.

Credits:
Special thanks to @fujiaozhu for adding this problem and creating all test cases.
*/
public class SumofTwoIntegers371 {
	
	public static void main(String[] args) {
		System.out.println(getSum(12, 9));
		System.out.println(getSum2(12, 11));
		System.out.println(getSum3(12, 11));
	}
	
	/**
	 * 
	* <p>描述:
	* 1、不考虑进位的加法即异或运算 ^
	* 2、只考虑进位的加法即与运算后左移一位  & <<1
	* 
	* </p>
	* @param a
	* @param b
	* @return
	* @author Eg
	 */
	public static int getSum(int a,int b) {
		while(b!=0) {
			int c=a^b;
			b=(a&b)<<1;
			a=c;
		}
		return a;
	}
	
	public static int getSum2(int a, int b) {
	    while(a != 0) {
	        int tmp = (a & b) << 1;
	        b = a ^ b;
	        a = tmp;
	    }
	    return b;
	}
	
	public static int getSum3(int a,int b) {
		if(b==0) return a;
		int sum=a^b;
		int carry=(a&b)<<1;
		return getSum3(sum, carry);
	}
}

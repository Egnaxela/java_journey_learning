/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月12日 上午11:17:27  
 *  
 */  

package com.leetCode;

import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月12日 上午11:17:27  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月12日      Eg                      1.0         1.0 Version  
 */

/*
 * We are given two strings, A and B.

A shift on A consists of taking string A and moving the leftmost character to the rightmost position. For example, if A = 'abcde', then it will be 'bcdea' after one shift on A. Return True if and only if A can become B after some number of shifts on A.

Example 1:
Input: A = 'abcde', B = 'cdeab'
Output: true

Example 2:
Input: A = 'abcde', B = 'abced'
Output: false

Note:

    A and B will have length at most 100.


 */
public class RotateString796 {
	
	public static void main(String[] args) {
		String A ="abcde", B ="cdeab";
		A ="abcde"; B ="abced";
		
		A=null;
		System.out.println(rotateString(A, B));
		System.out.println(rotateString2(A, B));
	}
	
	public static boolean rotateString(String A, String B) {
		if(A==null||A.length()<=0) return false;
		char[] arry=A.toCharArray();
		char[] newStr=Arrays.copyOf(arry, A.length()*2);
	    for(int i=0;i<A.length();i++) {
	    	newStr[i]=0;
	    	newStr[A.length()+i]=arry[i];
	    	if(new String(newStr).trim().equals(B)) {
	    		return true;
	    	}
	    }
	    return false;
	}
	
	
	public static boolean rotateString2(String A,String B) {
		return A!=null&&B!=null? A.length() == B.length() && (A + A).contains(B):false;
	}
}

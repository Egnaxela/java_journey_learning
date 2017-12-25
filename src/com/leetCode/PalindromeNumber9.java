/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月19日 上午11:06:35  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月19日 上午11:06:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月19日      Eg                      1.0         1.0 Version  
 */

//判断回文数
//https://leetcode.com/submissions/detail/132606604/
public class PalindromeNumber9 {

	public static void main(String[] args) {
	
		System.out.println("palindrome: "+ispalindrome1(5));
	}
	
	public static boolean ispalindrome1(int x) {
		if(x<0) {
			return false;
		}
		if(0<=x&&x<=9) {
			return true;
		}
		boolean result=false;
		String str=x+"";
		int len=str.length();
		for(int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(len-1-i)) {
				result=true;
			}else {
				return false;
			}
		}
		
		return result;
	}
	
	public static boolean isPalindrome2(int x) {
        if(x<0) return false; 
        if(x<10) return true;
        
        int tens = 1;
        int tmp = x;
        while(tmp/10 > 0){
            tens *= 10;
            tmp = tmp/10;
        }
    
        while(tens >= 10){
            if(x/tens != x % 10) return false;
            x = x % tens / 10;
            tens /= 100;
        }
        return true;
	}
}

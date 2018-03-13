/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月13日 下午3:57:18  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月13日 下午3:57:19  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月13日      Eg                      1.0         1.0 Version  
 */

/*
 *Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

Example:

Input: "babad"

Output: "bab"

Note: "aba" is also a valid answer.

 

Example:

Input: "cbbd"

Output: "bb"

 */
public class LongestPalindromicSubstring5 {
	private static int maxLen,lo;
	public static void main(String[] args) {
		String s="abdfsas";
		System.out.println(longestPalindrome(s));
		System.out.println(longestPalindrome2(s));
	}
	
	
	public static String longestPalindrome2(String s) {
		int n=s.length();
		if(n<2) return s;
		for(int i=0;i<n-1;i++) {
			extendPalindrome(s,i,i);
			extendPalindrome(s, i, i+1);
		}
		return s.substring(lo, lo+maxLen);
	}
	
	private static void extendPalindrome(String s,int i,int j) {
		while(i>=0&&j<s.length()&&s.charAt(i)==s.charAt(j)) {
			i--;
			j++;
		}
		if(maxLen<j-i-1) {
			lo=i+1;maxLen=j-i-1;
		}
	}
	
	public static String longestPalindrome(String s) {
		int n=s.length();
		String res=null;
		boolean[][] dp=new boolean[n][n];
		for(int i=n-1;i>=0;i--) {
			for(int j=i;j<n;j++) {
				dp[i][j]=s.charAt(i)==s.charAt(j)&&
			(j-i<3||dp[i+1][j-1]);
				if(dp[i][j]&&(res==null||j-i+1>res.length())) {
					res=s.substring(i, j+1);
				}
				
			}	
		}
		return res;
	}
	
	public static void printHeart() {
		for (float y = 1.5f; y > -1.5f; y -= 0.1f) {
	        for (float x = -1.5f; x < 1.5f; x += 0.05f) {
	            float a = x * x + y * y - 1;
	            System.out.print((a * a * a - x * x * y * y * y <= 0.0f ? '*' : ' '));
	        } 
	        System.out.print('\n');
	    }

	}
	
}

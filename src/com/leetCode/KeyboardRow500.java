/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月8日 下午2:47:40  
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
 * Create at:   2018年3月8日 下午2:47:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月8日      Eg                      1.0         1.0 Version  
 */

/*
 * Given a List of words, return the words that can be typed using letters of alphabet on only one row's of American keyboard like the image below.

American keyboard

Example 1:

Input: ["Hello", "Alaska", "Dad", "Peace"]
Output: ["Alaska", "Dad"]

Note:

    You may use one character in the keyboard more than once.
    You may assume the input string will only contain letters of alphabet.

 */
public class KeyboardRow500 {
	
	public static void main(String[] args) {
		String[] words= {"ASD","asdfghjklASDFGHJKLasdfghjklASDFGHJKLzxcvbnmZXCVBNMaew","asdfghjklASDFGHJKLqwertyuiopQWERTYUIOP","zxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaewzxcvbnmZXCVBNMaew"};
		System.out.println(Arrays.toString(findWords(words)));
	}
	
	public static String[] findWords(String[] words) {
		if(words==null||words.length==0) return new String[0];
		String[] base= {"QWERTYUIOP","ASDFGHJKL","ZXCVBNM"};
		String[] result = new String[words.length];
		for(int i=0;i<words.length;i++) {
			char[] ch=words[i].toCharArray();
			int m=0,n=0,x=0;
			for(int j=0;j<ch.length;j++) {
				if(base[0].contains((ch[j]+"").toUpperCase())) {
					m++;
				}else if(base[1].contains((ch[j]+"").toUpperCase())) {
					n++;
				}else {
					x++;
				}
			}
			if((m==0&&n==0&&x!=0)||(m!=0&&n==0&&x==0)||(m==0&&n!=0&&x==0)) {
				result[i]=new String(ch);
				
			}
		}
		return replaceNull(result);
	}

	private static String[] replaceNull(String[] str){
	       StringBuffer sb = new StringBuffer();
	       for(int i=0; i<str.length; i++) {
	           if(str[i]==null||"".equals(str[i])) {
	               continue;
	           }
	           sb.append(str[i]);
	           if(i != str.length - 1) {
	               sb.append(";");
	           }
	       }
	       str = sb.toString().split(";");
	       if(str.length==1&&"".equals(str[0])) {
	    	   return new String[0];
	       }
	       return str;
	}
}

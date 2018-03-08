/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月8日 上午10:05:33  
 *  
 */  

package com.leetCode;
/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月8日 上午10:05:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月8日      Eg                      1.0         1.0 Version  
 */

/*
 * Given a string, you need to reverse the order of characters 
 * in each word within a sentence while still preserving whitespace and initial word order.

Example 1:

Input: "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Note: In the string, each word is separated by single space and there will not be any extra space in the string. 
 */
public class ReverseWordsinaStringIII557 {
	public static void main(String[] args) {
		System.out.println(reverseWord("Let's take LeetCode contest"));
	}
	
	public static String reverseWord(String s) {
		if(s==null||s=="") return "";
		String[] array=s.split(" ");
		String result="";
		for(int i=0;i<array.length;i++) {
			char[] ch=array[i].toCharArray();
			for(int j=0;j<ch.length/2;j++) {
				char temp=ch[j];
				ch[j]=ch[ch.length-j-1];
				ch[ch.length-j-1]=temp;
			}
			result+=new String(ch)+" ";
		}
		return result.trim();
	}
	
	public static  String reverseWord2(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int index = s.indexOf(' ', i);
            if (index == -1) {
                reverse(chars, i, chars.length - 1);
                break;
            }
            reverse(chars, i, index - 1);
            i = index + 1;
        }

        return new String(chars);
    }

    private static void reverse(char[] chars, int start, int end) {
        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
    }
}

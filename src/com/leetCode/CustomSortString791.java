/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月16日 下午5:09:10  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月16日 下午5:09:10  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月16日      Eg                      1.0         1.0 Version  
 */


/*
 * S and T are strings composed of lowercase letters. In S, no letter occurs more than once.

S was sorted in some custom order previously. We want to permute the characters of T so that they match the order that S was sorted. More specifically, if x occurs before y in S, then x should occur before y in the returned string.

Return any permutation of T (as a string) that satisfies this property.

Example :
Input: 
S = "cba"
T = "abcd"
Output: "cbad"
Explanation: 
"a", "b", "c" appear in S, so the order of "a", "b", "c" should be "c", "b", and "a". 
Since "d" does not appear in S, it can be at any position in T. "dcba", "cdba", "cbda" are also valid outputs.

 */
public class CustomSortString791 {
	
	public static void main(String[] args) {
		String S="cba";
		String T="abcd";
		System.out.println(T.contains('a'+""));
		System.out.println(customSortString(S, T));
	}
	
	public static String customSortString(String S, String T) {
		 int[] count = new int[26];
	        for (char c : T.toCharArray()) { ++count[c - 'a']; }  // count each char in T.
	        StringBuilder sb = new StringBuilder();
	        for (char c : S.toCharArray()) {                            
	            while (count[c - 'a']-- > 0) { sb.append(c); }    // sort chars both in T and S by the order of S.
	        }
	        for (char c = 'a'; c <= 'z'; ++c) {
	            while (count[c - 'a']-- > 0) { sb.append(c); }   // group chars in T but not in S.
	        }
	        return sb.toString();
	}
}

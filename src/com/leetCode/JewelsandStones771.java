/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月7日 下午4:58:33  
 *  
 */  

package com.leetCode;

import java.util.HashSet;
import java.util.Set;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月7日 下午4:58:33  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月7日      Eg                      1.0         1.0 Version  
 */

/*
 * You're given strings J representing the types of stones that are jewels, and S representing the stones you have.  Each character in S is a type of stone you have.  You want to know how many of the stones you have are also jewels.

The letters in J are guaranteed distinct, and all characters in J and S are letters. Letters are case sensitive, so "a" is considered a different type of stone from "A".

Example 1:

Input: J = "aA", S = "aAAbbbb"
Output: 3

Example 2:

Input: J = "z", S = "ZZ"
Output: 0

Note:

    S and J will consist of letters and have length at most 50.
    The characters in J are distinct.

 */
public class JewelsandStones771 {
	public static void main(String[] args) {
		String J = "aA", S = "aAAbbbb";
		
		System.out.println(numJewelsInStones(J, S));
	}
	
	public static int numJewelsInStones(String J, String S) {
		char[] chars=S.toCharArray();
		char[] charj=J.toCharArray();
		int count=0;
		for(int i=0;i<chars.length;i++) {
			for(int j=0;j<charj.length;j++) {
				if(chars[i]==charj[j]) {
					count++;
				}
			}
		}
		return count;
	}
	
	public static int numJewelsInStones2(String J, String S) {
		Set<Character> set=new HashSet<Character>();
		int count=0;
		for(char j:J.toCharArray()) {
			set.add(j);
		}
		
		for(char s:S.toCharArray()) {
			if(set.contains(s)) {
				count++;
			}
		}
		
		return count;
	}
}

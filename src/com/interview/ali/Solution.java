package com.interview.ali;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月5日 下午6:17:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月5日      Pluto       1.0         1.0 Version
 */
public class Solution {
	
	public static void main(String[] args) {
		String s="a bc defg ghi j k l mn op q";
		System.out.println(lengthOfLongestSubstring2(s));
	} 
    
	/**
	 * 
	* <p>描述:
	* 最长子串长度
	* 
	* </p>
	* @param s1
	* @return
	* @author Pluto
	 */
    public static int lengthOfLongestSubstring2(String s1) {
    	String s=s1.replace(" ", "");
        int i = 0, j = 0, max = 0;
        Set<Character> set = new HashSet<>();
        while (j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                max = Math.max(max, set.size());
            } else {
                set.remove(s.charAt(i++));
            }
        }
        return s1.indexOf(s.charAt(j-1))-s1.lastIndexOf(s.charAt(i))+1;
    }
    
    public static int lengthOfLongestSubstring(String s) {

        Map<Character, Integer> pos = new HashMap<>();
        char[] ss = s.toCharArray();

        int max = 0, temp = 0;

        for(int i = 0; i < s.length(); i++){

            if( !pos.containsKey(ss[i]) ){
                pos.put(ss[i],i);
                temp++;
            }else{
                if(pos.get(ss[i]) + temp < i){
                    temp++;                
                }else{
                    max = Math.max(max,temp);
                    temp = i - pos.get(ss[i]);
                }
                pos.put(ss[i],i);
            }

        }
        max = Math.max(max,temp);
        return max;
        
    }
    
}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月18日 下午6:55:05  
 *  
 */  

package com.leetCode;

import java.util.HashMap;
import java.util.Map;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月18日 下午6:55:05  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月18日      Eg                      1.0         1.0 Version  
 */


/**
 * 
 * Given a roman numeral, convert it to an integer.
 * Input is guaranteed to be within the range from 1 to 3999.
 * 
 * 【罗马数字】
 * 1~9: {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
 * 10~90: {"X", "XX", 'XXX', "XL", "L", "LX", "LXX", "LXXX", "XC"};
 * 100~900: {"C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
 * 1000~3000: {"M", "MM", "MMM"}.
 * 
 */
public class RomanToInteger13 {

	// MMMCDLXIX  3469         DMMMMCDLXIX
	public static void main(String[] args) {
		System.out.println("Roman To Integer: "+romanToInt("MMMCDLXIX"));
	}

	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		int len=s.length();
		int result=map.get(s.charAt(len-1));
		int pivot =result;
		for(int i=len-2;i>=0;i--) {
			int cur=map.get(s.charAt(i));
			if(cur>=pivot) {
				result+=cur;
			}else {
				result-=cur;
			}
			pivot=cur;
		}
		return result;
	}
	
	public static int romanToInt2(String s) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
	}

}

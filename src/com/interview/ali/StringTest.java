/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月18日 下午7:49:08  
 *  
 */  

package com.interview.ali;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月18日 下午7:49:09  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月18日      Pluto       1.0         1.0 Version  
 */

/**
 * 
 * 字符串的 排列 组合 
 * 排列 ：从 m个元素中取出n个元素(n<=m)，按照一定顺序排成一列，特别的 当n=m时，为全排列 n!
 * 组合 ：从m个元素中取出n个元素为一组   2^n 
 * 
 */
public class StringTest {
	static HashSet<String> set=new HashSet<String>();
	
	public static void main(String[] args) {

		String str="abc";
		
		fullpermutation("a");
		fullpermutation("b");
		fullpermutation("c");
		fullpermutation("ab");
		fullpermutation("ac");
		fullpermutation("bc");
		fullpermutation("abc");
		System.out.println("==================");
		getString(str, "");
		System.out.println(set);
	}

	/**
	 * 
	* <p>描述:
	* 全排列
	* </p>
	* @param s
	* @author Pluto
	 */
	public static void fullpermutation(String s) {
		permutation(s.toCharArray(), 0, s.length()-1);
	}
	
	
	/**
	 * 
	* <p>描述:
	* 排列
	* 
	* 
	* 
	* </p>
	* @param s
	* @param from
	* @param to
	* @author Pluto
	 */
	public static void permutation(char[] s, int from, int to) {
		if (from == to) {
			System.out.println(s);
		} else {
			for (int i = from; i <= to; i++) {
				swap(s, i, from);
				permutation(s, from + 1, to);
				swap(s, from, i);
			}

		}
	}

	public static void swap(char[] s, int i, int j) {
		char tmp = s[i];
		s[i] = s[j];
		s[j] = tmp;
	}

	
    public static void getString(String s,String pre){
        if(s.length()==1){
            set.add(pre+s);
            return;
        }else{
            for (int i = 0; i < s.length(); i++) {
                StringBuilder sb=new StringBuilder(s);
                String str=pre+s.substring(i, i+1);
                set.add(str);
                getString(sb.deleteCharAt(i).toString(),str);
            }
        }
    }
}

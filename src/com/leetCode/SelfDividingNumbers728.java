/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月20日 下午12:00:35  
 *  
 */  

package com.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月20日 下午12:00:35  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月20日      Eg                      1.0         1.0 Version  
 */

/**
 * 
 * A self-dividing number is a number that is divisible by every digit it contains.
 * For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
 * Also, a self-dividing number is not allowed to contain the digit zero.
 * Given a lower and upper number bound, output a list of every possible self dividing number, including the bounds if possible.
 * Example 1:
 * Input: 
 * left = 1, right = 22
 * Output: [1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22]
 * Note:
 * The boundaries of each input argument are 1 <= left <= right <= 10000.
 * 
 * https://leetcode.com/submissions/detail/132625576/
 * 
 * 
 */
public class SelfDividingNumbers728 {
	public static void main(String[] args) {
		System.out.println("selfDividingNumbers: "+selfDividingNumbers1(1, 22).toString());
		System.out.println("selfDividingNumbers: "+selfDividingNumbers2(12, 22).toString());
	}
	
	public static List<Integer> selfDividingNumbers1(int left, int right) {
		List<Integer> list=new ArrayList<Integer>();
		for(int i=left;i<=right;i++) {
			boolean flag=false;
			for(int x=0;x<(i+"").length();x++) {
				int tep=Integer.valueOf((i+"").charAt(x)+"");
				if(tep!=0&&i%tep==0) {
					flag=true;
				}else {
					flag=false;
					break;
				}
			}
			if(flag) {
				list.add(i);
			}
		}
		return list;
	}
	
	public static List<Integer> selfDividingNumbers2(int left, int right) {
		List<Integer> list=new LinkedList<>();
		for(int i=left;i<=right;i++) {
			if(isDividingNumber(i)) {
				list.add(i);
			}
		}
		return list;
	}
	
	private static boolean isDividingNumber(int a) {
		int b=a;
		while(b!=0) {
			int d=b%10;
			if(d==0) {
				return false;
			}
			
			if(a%d!=0) {
				return false;
			}
			b/=10;
		}
		
		return true;
	}
	

}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月7日 下午6:19:54  
 *  
 */  

package com.util;

import java.util.ArrayList;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月7日 下午6:19:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月7日      Eg                      1.0         1.0 Version  
 */

public class MathUtils {
	
	public static void main(String[] args) {
		System.out.println(sumOfList(divisorNumber(220)));
		System.out.println(sumOfList(divisorNumber(284)));
	}
	
	/**
	 * 
	* <p>描述:一个正整数的所有约数</p>
	* @param num
	* @return
	* @author Eg
	 */
	public static List<Integer> divisorNumber(int num) {
		if(num<=0) return null;
		List<Integer> list=new ArrayList<>();
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				list.add(i);
			}
		}
		return list;
	}
	
	/**
	 * 
	* <p>描述:List整数之和</p>
	* @param list
	* @return
	* @author Eg
	 */
	public static int sumOfList(List<Integer> list) {
		int sum=0;
		for(Integer i:list) {
			sum+=i;
		}
		return sum;
	}
}

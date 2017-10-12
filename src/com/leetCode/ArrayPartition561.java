/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月11日 下午2:44:37  
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
 * Create at:   2017年10月11日 下午2:44:37  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月11日      Eg                      1.0         1.0 Version  
 */


/**
 * 
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 * Example 1:
 * Input: [1,4,3,2]
 * Output: 4
 * Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4)
 * Note:
 * n is a positive integer, which is in the range of [1, 10000].
 * All the integers in the array will be in the range of [-10000, 10000].
 * 
 */
public class ArrayPartition561 {
	
	public static void main(String[] args) {
		int[] a= {1,2,3,45,23,41};
		System.out.println(arrayPartition(a));
	}
	
	public static int arrayPartition(int[] nums) {
		Arrays.sort(nums);
		int sum=0;
		for(int i=0;i<nums.length;i+=2) {
			sum+=nums[i];
		}
		
		return sum;
	} 

}

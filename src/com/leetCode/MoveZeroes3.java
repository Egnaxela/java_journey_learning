/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月2日 下午3:24:20  
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
 * Create at:   2018年3月2日 下午3:24:20  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月2日      Eg                      1.0         1.0 Version  
 */

/*
 * 
 *  Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].

Note:

    You must do this in-place without making a copy of the array.
    Minimize the total number of operations.

 */
public class MoveZeroes3 {
	
	public static void main(String[] args) {
		int[] nums= {0,1,0,3,12};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
	public static void moveZeroes(int[] nums) {
		if(nums==null||nums.length==0) {
			return;
		}
		int insert=0;
		for(int num:nums) {
			if(num!=0) nums[insert++]=num;
		}
		while(insert<nums.length) {
			nums[insert++]=0;
		}
    }
	
}

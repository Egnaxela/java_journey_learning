/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年9月29日 上午10:37:53  
 *  
 */  

package com.leetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年9月29日 上午10:37:53  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年9月29日      Eg                      1.0         1.0 Version  
 */


/**
 * <p>
 * Given an array of integers, 
 * return indices of the two numbers such 
 * that they add up to a specific target.
 * 
 * You may assume that each input would have exactly one solution, 
 * and you may not use the same element twice.
 * </p>
 * 
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 * 
 * */
public class TwoSum1 {
	
	private static int[] result =new int[2];
	public static void main(String[] args) {
		int a[]= {2,4,5,6};
		System.out.println(Arrays.toString(twoSum001(a, 8)));
		System.out.println(Arrays.toString(twoSum002(a, 8)));
	}
	
	
	public static int[] twoSum001(int nums[],int target) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]+nums[j]==target) {
					result[0]=i;
					result[i]=j;
					break;
				}
			}
		}
		return result;
	} 
	
	public static int[] twoSum002(int nums[],int target) {
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			if(map.containsKey(nums[i])) {
				result[0]=i;
				result[1]=map.get(nums[i]);
			}else {
				map.put(target-nums[i],i);
			}
		}
		return result;
	}
	
	
}

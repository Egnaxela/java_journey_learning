/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月6日 上午11:40:45  
 *  
 */  

package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月6日 上午11:40:45  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月6日      Eg                      1.0         1.0 Version  
 */

/*
 * Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

Find all the elements of [1, n] inclusive that do not appear in this array.

Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.

Example:

Input:
[4,3,2,7,8,2,3,1]

Output:
[5,6]

 */
public class FindAllNumbersDisappearedinanArray448 {
	
	
	public static void main(String[] args) {
		int[] nums= {4,3,2,7,8,2,3,1};
		//int[] nums= {1,1};
		//System.out.println(findDisappearedNumbers(nums));
		System.out.println(findDisappearedNumbers2(nums));
		
	}
	
	public static List<Integer> findDisappearedNumbers(int[] nums) {
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<>();
		if (nums.length > 0) {
			int min = nums[0];
			int max = nums[nums.length - 1]>nums.length?nums[nums.length - 1]:nums.length;

			for (int i = min; i <= max; i++) {
				list.add(i);
			}

			for (int i = 0; i < nums.length; i++) {
				if (list.contains(nums[i])) {
					list.remove(Integer.valueOf(nums[i]));
				}
			}
		}
		return list;
	}
	
	/**
	 * 关键点: 数组中的每一个数都大于等于1 小于等于数组的长度 1<=a[i]<=n
	 * 
	 * 
	* <p>描述:同样是用标志位的方法去做，
	* 把原数组中出现的数其应该所在的位置上置为负值，
	* 然后重新遍历如果大于0，则表示从未出现过。</p>
	* 
	* 
	* 对于每个数字nums[i]，如果其对应的nums[nums[i] - 1]是正数，
	* 我们就赋值为其相反数，如果已经是负数了，就不变了，
	* 那么最后我们只要把留下的整数对应的位置加入结果res中即可
	* @param nums
	* @return
	* @author Eg
	 */
	public static List<Integer> findDisappearedNumbers2(int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			int val = Math.abs(nums[i]) - 1;
			if (nums[val] > 0) {
				nums[val] = -nums[val];
			}
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0) {
				list.add(i + 1);
			}
		}
		return list;
	}
}

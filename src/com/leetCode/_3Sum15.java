/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月30日 下午5:09:34  
 *  
 */  

package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月30日 下午5:09:34  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月30日      Eg                      1.0         1.0 Version  
 */

/*
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note: The solution set must not contain duplicate triplets.

For example, given array S = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 */
public class _3Sum15 {
	
	public static void main(String[] args) {
		int[] nums= {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
		System.out.println(threeSum2(nums));
		System.out.println(threeSum3(nums));
				
	}
	
	public static List<List<Integer>> threeSum(int[] num){
		
	    Arrays.sort(num);
	    List<List<Integer>> res = new LinkedList<>(); 
	    for (int i = 0; i < num.length-2; i++) {
	        if (i == 0 || (i > 0 && num[i] != num[i-1])) {
	            int lo = i+1, hi = num.length-1, sum = 0 - num[i];
	            while (lo < hi) {
	                if (num[lo] + num[hi] == sum) {
	                    res.add(Arrays.asList(num[i], num[lo], num[hi]));
	                    while (lo < hi && num[lo] == num[lo+1]) lo++;
	                    while (lo < hi && num[hi] == num[hi-1]) hi--;
	                    lo++; hi--;
	                } else if (num[lo] + num[hi] < sum) lo++;
	                else hi--;
	           }
	        }
	    }
	    return res;
	}
	
	
	public static List<List<Integer>> threeSum2(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        if(nums.length < 3) return result;
        Arrays.sort(nums);
        int i = 0;
        while(i < nums.length - 2) {
            if(nums[i] > 0) break;
            int j = i + 1;
            int k = nums.length - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == 0) result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                if(sum <= 0) while(nums[j] == nums[++j] && j < k);
                if(sum >= 0) while(nums[k--] == nums[k] && j < k);
            }
            while(nums[i] == nums[++i] && i < nums.length - 2);
        }
        return result;
    }
	
	
	public static List<List<Integer>> threeSum3(int[] A) {
		List<List<Integer>>res = new ArrayList<List<Integer>>();
		if (A == null || A.length == 0)
			return res;
		Arrays.sort(A);
		for (int i = 0; i < A.length; i++) {
			if (i - 1 >= 0 && A[i] == A[i - 1]) continue;// Skip equal elements to avoid duplicates
			  
			int left = i + 1, right = A.length - 1; 
			while (left < right) {// Two Pointers
				int sum = A[i] + A[left] + A[right];
				if (sum == 0) { 
					res.add(Arrays.asList(A[i], A[left], A[right]));
					while (left + 1 < right && A[left] == A[left+1])// Skip equal elements to avoid duplicates
						left++;
					while (right -1 > left && A[right] == A[right-1])// Skip equal elements to avoid duplicates
						right--;
					left++; 
					right--;
				} else if (sum < 0) { 
					left++;
				} else {
					right--;
				}
			}
		}
		return res;
	}
	
	
	
}

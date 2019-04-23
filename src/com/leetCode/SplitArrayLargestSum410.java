/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月23日 下午3:03:43  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月23日 下午3:03:43  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月23日      Pluto       1.0         1.0 Version  
 */


/*
 * Given an array which consists of non-negative integers and an integer m, 
 * you can split the array into m non-empty continuous subarrays. 
 * Write an algorithm to minimize the largest sum among these m subarrays.

Note:
If n is the length of array, assume the following constraints are satisfied:

1 ≤ n ≤ 1000
1 ≤ m ≤ min(50, n)
Examples:

Input:
nums = [7,2,5,10,8]
m = 2

Output:
18


将一个非负的整数数组划分为m个不为空的连续的子数组，使得这些子数组的最大和值为最小
 */
public class SplitArrayLargestSum410 {
	
	public static void main(String[] args) {
		int[] nums= {7,2,5,10,8};
		int m=2;
		System.out.println(splitArray(nums, m));
	}
	
	public static int splitArray(int[] nums,int m) {
	    int L = nums.length;
	    int[] S = new int[L+1];
	    S[0]=0;
	    for(int i=0; i<L; i++)
	        S[i+1] = S[i]+nums[i];

	    int[] dp = new int[L];
	    for(int i=0; i<L; i++)
	        dp[i] = S[L]-S[i];

	    for(int s=1; s<m; s++)
	    {
	        for(int i=0; i<L-s; i++)
	        {
	            dp[i]=Integer.MAX_VALUE;
	            for(int j=i+1; j<=L-s; j++)
	            {
	                int t = Math.max(dp[j], S[j]-S[i]);
	                if(t<=dp[i])
	                    dp[i]=t;
	                else
	                    break;
	            }
	        }
	    }

	    return dp[0];
	}
}

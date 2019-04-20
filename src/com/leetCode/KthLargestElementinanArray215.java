/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月4日 上午9:54:48  
 *  
 */  

package com.leetCode;

import com.algorithm.sort.SortHelper;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月4日 上午9:54:48  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月4日      Eg                      1.0         1.0 Version  
 */


/**
 * Find the kth largest element in an unsorted array. 
 * Note that it is the kth largest element in the sorted order, 
 * not the kth distinct element.
 * For example,
 * Given [3,2,1,5,6,4] and k = 2, return 5.
 * Note:
 * You may assume k is always valid, 
 * 1 ≤ k ≤ array's length.
 */
public class KthLargestElementinanArray215 {
	
	public static void main(String[] args) throws Exception {
		int[] nums= {3,2,1,5,6,4};
		int k=2;
		System.out.println(findKthLargest(nums, k));
		System.out.println(findKthLargest2(nums, k));
		
		nums=SortHelper.generateRandom(10000, 1, Integer.MAX_VALUE);
		SortHelper.testSort("com.leetCode.KthLargestElementinanArray215", 
				"findKthLargest", 
				nums,k);
		SortHelper.testSort("com.leetCode.KthLargestElementinanArray215", 
				"findKthLargest2", 
				nums,k);
	}
	
	public static int findKthLargest(int[] nums,int k) {
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]<nums[j]) {
					swap(nums,i,j);
				}
			}
		}
		return nums[k-1];
	}
	
	
	public static int findKthLargest2(int[] nums,int k) {
		int n=nums.length;
		int p=quickSelect(nums,0,n-1,n-k+1);
		return nums[p];
	}
	
	public static int quickSelect(int[] a,int lo,int hi,int k) {
		int i=lo,j=hi,pivot=a[hi];
		while(i<j) {
			if(a[i++]>pivot) 
				swap(a, --i, --j);
		}
		swap(a, i, hi);
		int m=i-lo+1;
		if(m==k) 
			return i;
		else if(m>k) 
			return quickSelect(a, lo, i-1, k);
		else {
			return quickSelect(a, i+1, hi, k-m);
		}
	}
	public static void swap(int[] nums,int i,int j) {
		int temp=nums[i];
		nums[i]=nums[j];
		nums[j]=temp;
	}
}

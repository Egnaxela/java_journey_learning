/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月4日 上午11:11:05  
 *  
 */  

package com.algorithm.sort;

import java.util.Arrays;

/**  
 * Description: 插入排序  
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月4日 上午11:11:05  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月4日      Eg                      1.0         1.0 Version  
 */

public class InsertionSort {
	public static void main(String[] args) throws Exception{
		int n=100000;
		int[] nums=SortHelper.generateRandom(n, 0, n);
		int[] nums2=Arrays.copyOf(nums, nums.length);
		int[] nums3=Arrays.copyOf(nums, nums.length);
	//	SortHelper.testSort("com.algorithm.sort.SelectionSort", "selection",nums3);
		SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort",nums);
		SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort2",nums2);
		
		int[] nums4=SortHelper.generateNearlyOrderedArray(1000000, 100);
		int[] nums5=Arrays.copyOf(nums4, nums4.length);
		
		SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort",nums4);
		SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort2",nums5);
	}
	
	
	public void insertionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j>0&&arr[j]<arr[j-1];j--) {  //如果当前元素比前一个元素值小，则交换位置 
					SortHelper.swap(arr, j, j-1);
			}
		}
	}
	
	public void insertionSort2(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j;
			for(j=i;j>0&&arr[j-1]>temp;j--)//因为在排第i个元素时，前面i-1个元素已经是有序的了。
				arr[j]=arr[j-1];
			arr[j]=temp;
		}
	}
	
}

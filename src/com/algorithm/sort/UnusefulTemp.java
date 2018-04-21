/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月8日 下午2:46:08  
 *  
 */  

package com.algorithm.sort;

import java.lang.reflect.Array;
import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月8日 下午2:46:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月8日      Eg                      1.0         1.0 Version  
 */

public class UnusefulTemp {

	public static void main(String[] args) {
		int[] arr=SortHelper.generateRandom(10, 0, 100);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		int[] arr3=Arrays.copyOf(arr, arr.length);
		int[] arr4=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
		selectionSort(arr);
		insertSort(arr2);
		insertSort2(arr3);
		quickSort(arr4);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
	
	public  static void  selectionSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[i]) {
					SortHelper.swap(arr, j, i);
				}
			}
		}
	}
	
	public static void insertSort(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			for(int j=i;j>0&&arr[j-1]>arr[j];j--) {
				SortHelper.swap(arr, j-1, j);
			}
		}
	}
	
	public static void insertSort2(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			int temp=arr[i];
			int j;
			for(j=i;j>0&&arr[j-1]>temp;j--) {
				arr[j]=arr[j-1];
			}
			arr[j]=temp;
		}
	}
	
	
	public static void quickSort(int[] arr) {
		sort(arr,0,arr.length-1);
	}
	
	private static void sort(int[] arr,int l,int r) {
		if(l>=r) return;
		int p=partition(arr, l, r);
		sort(arr, l, p-1);
		sort(arr, p+1, r);
		
	}
	
	/**
	 * 
	* <p>描述:使得arr[l ... p-1] <arr[p],
	* arr[p+1 ... r] >arr[p]
	* 
	*  </p>
	* @param arr
	* @param l
	* @param r
	* @return
	* @author Eg
	 */
	private static int partition(int[] arr,int l,int r) {
		int v=arr[l];
		int j=l;
		for(int i=l+1;i<=r;i++) {
			if(arr[i]<v) {
				SortHelper.swap(arr, j+1, i);
				j++;
			}
		}
		SortHelper.swap(arr, l, j);
		return j;
	}
	
	/**
	 * 
	 */
	private static int partition2(int[] arr,int l,int r) {
		int v=arr[l];
		int j=l;
		for(int i=l+1;i<=r;i++) {
			if(arr[i]<v) {
				j++;
				SortHelper.swap(arr, j, i);
			}
		}
		SortHelper.swap(arr, l, j);
		return j;
		
	}
	
	
	
	
	
	public static void testArray() {
		Array.newInstance(Integer.class, 2);
	}
	
	
}

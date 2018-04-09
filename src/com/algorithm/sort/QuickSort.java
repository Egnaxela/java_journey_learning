/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月9日 下午5:26:36  
 *  
 */  

package com.algorithm.sort;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import com.util.RandomNumberIoUtils;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月9日 下午5:26:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月9日      Eg                      1.0         1.0 Version  
 */

public class QuickSort {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, IOException {
		int n=100_0000;
		int[] arr=SortHelper.generateRandom(n, 0, n*999);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		int[] arr3=Arrays.copyOf(arr, arr.length);
		RandomNumberIoUtils.writeNumber(null, "sortNumber.in", arr3);
	//	System.out.println(Arrays.toString(arr2));
	//	SortHelper.testSort("com.algorithm.sort.SelectionSort","selection",arr);
	//	SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort2",arr2);
		SortHelper.testSort("com.algorithm.sort.MergeSort", "mergeSort", arr3);
		SortHelper.testSort("com.algorithm.sort.QuickSort", "quickSort", arr2);
		long t1=System.currentTimeMillis();
		Arrays.sort(arr);
		long t2=System.currentTimeMillis();
		System.out.println("Arrays.sort: "+(t2-t1)/1000.0 +"s");
	//	System.out.println(Arrays.toString(arr));
		RandomNumberIoUtils.writeNumber(null, "sortNumber1.out", arr);
		RandomNumberIoUtils.writeNumber(null, "sortNumber2.out", arr2);
		RandomNumberIoUtils.writeNumber(null, "sortNumber3.out", arr3);
	}
	
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private static void sort(int[] arr,int l,int r) {
		if(l>=r) return;
		int p=partition(arr, l, r);
		sort(arr, l, p-1);
		sort(arr, p+1, r);
	}
	
	private static int partition(int[] arr,int l,int r) {
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
	
	
}

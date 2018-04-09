/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月9日 下午2:34:11  
 *  
 */  

package com.algorithm.sort;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月9日 下午2:34:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月9日      Eg                      1.0         1.0 Version  
 */

public class MergeSort {
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		int[] arr=SortHelper.generateRandom(11, 0, 100);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		int[] arr3=Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(arr2));
	//	SortHelper.testSort("com.algorithm.sort.SelectionSort","selection",arr);
		SortHelper.testSort("com.algorithm.sort.InsertionSort", "insertionSort2",arr2);
		SortHelper.testSort("com.algorithm.sort.MergeSort", "mergeSort", arr3);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}
	
	public static void mergeSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	private static void sort(int[] arr,int l,int r) {
		if(l>=r) return;
		int mid=(l+r)/2;
		sort(arr, l, mid);
		sort(arr, mid+1, r);
		merge(arr, l, mid, r);
	}
	
	private static void merge(int[] arr,int l,int mid,int r) {
		int[] aux=Arrays.copyOfRange(arr, l, r+1);
		int i=l,j=mid+1;
		//i 指向左半部分的起始位置  j 指向右半部分的起始位置
		for(int k=l;k<=r;k++) {
			if(i>mid) {//如果左半部分已经全部处理完成
				arr[k]=aux[j-l];j++;
			}else if(j>r) {//如果右半部分元素已经全部处理完成
				arr[k]=aux[i-l];i++;
			}else if(aux[i-l]<aux[j-l]) {
				arr[k]=aux[i-l]; i++;
			}else {
				arr[k]=aux[j-l];j++;
			}
		}
	}
	

}

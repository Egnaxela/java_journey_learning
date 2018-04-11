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

/**
 * 从数组中选出一个元素放到合适的位置，使得左边的元素小于该元素，右边的元素大于改元素
 * 再从左边的元素中选出一个元素放到合适的位置，依次递归。
 */
public class QuickSort {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException, IOException {
		int n=100_0000;
		int[] arr=SortHelper.generateRandom(n, 0, n*999);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		int[] arr3=Arrays.copyOf(arr, arr.length);
//		RandomNumberIoUtils.writeNumber(null, "sortNumber.in", arr3);
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
//		RandomNumberIoUtils.writeNumber(null, "sortNumber1.out", arr);
//		RandomNumberIoUtils.writeNumber(null, "sortNumber2.out", arr2);
//		RandomNumberIoUtils.writeNumber(null, "sortNumber3.out", arr3);
	}
	
	public static void quickSort(int[] arr) {
		sort(arr, 0, arr.length-1);
	}
	
	/**
	 * 
	* <p>描述:递归调用</p>
	* @param arr
	* @param l
	* @param r
	* @author Eg
	 */
	private static void sort(int[] arr,int l,int r) {
		if(l>=r) return;
		int p=partition(arr, l, r);
		sort(arr, l, p-1);
		sort(arr, p+1, r);
	}
	
	/**
	 * 
	* <p>描述:对数组 从 [l,r]之间的元素进行快速排序
	* 设定两个索引的位置 i,表示当前访问的位置;j 表示数组元素的分界点(左边的比它小，右边的比它大)
	* v  表示基准元素
	* </p>
	* @param arr
	* @param l
	* @param r
	* @return
	* @author Eg
	 */
	private static int partition(int[] arr,int l,int r) {
		int v=arr[l];//选定基准元素
		int j=l;//设置分界点元素的初始值
		for(int i=l+1;i<=r;i++) { //当arr[i]>v时，已经在右边了，故无需额外操作。直接进行i++去处理下一个元素
			if(arr[i]<v) { //当当前选中元素arr[i]<v时，就把arr[i]放到分界点是右边
				SortHelper.swap(arr, j+1, i);//把 arr[i]与arr[j]的后一个元素进行交换。因为j的初始值是l,i的初始值是l+1,所以j+1不会溢出。
				j++;
			}
		}
		SortHelper.swap(arr, l, j);//最后交换基准元素和 分界点元素的值
		return j;
	}
	
	
	
}

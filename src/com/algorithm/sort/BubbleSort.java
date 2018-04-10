/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月9日 下午6:48:08  
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
 * Create at:   2018年4月9日 下午6:48:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月9日      Eg          1.0         1.0 Version  
 */


/**
 * 冒泡排序
 * 
 * 依次比较两个元素，如果小于就交换位置，一趟下来就可以将最小的找出来
 * 
 */
public class BubbleSort {
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		int n=100;
		int[] arr=SortHelper.generateRandom(10, -n, n);
		int[] arr2=Arrays.copyOf(arr, arr.length);
		SortHelper.testSort("com.algorithm.sort.BubbleSort", "bubbleSort", arr);
		SortHelper.testSort("com.algorithm.sort.BubbleSort", "bubbleSort2", arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void bubbleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	
	/**
	 * 
	* <p>描述:</p>
	* @param arr
	* @author Eg
	 */
	public static void bubbleSort2(int[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}

}

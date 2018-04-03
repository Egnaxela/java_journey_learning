/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月2日 下午5:56:50  
 *  
 */  

package com.algorithm.sort;

import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月2日 下午5:56:50  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月2日      Eg                      1.0         1.0 Version  
 */

/**
 * 选择排序
 * 
 * 依次选出剩余元素中最小的元素,放到对应的索引位置。
 */
public class SelectionSort {
	
	
	public static void main(String[] args) {
		int[] arr= {2,34,67,23,9,12};
		selection(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void selection(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}
			}
		}
	}
	
	/**
	 * 
	* <p>描述:按下标来交换数组元素</p>
	* @author Eg
	 */
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	
	
	
	
	
	
	
	

}

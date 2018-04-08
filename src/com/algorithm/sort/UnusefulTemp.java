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
		selectionSort(arr);
		insertSort(arr2);
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
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
	
	
}

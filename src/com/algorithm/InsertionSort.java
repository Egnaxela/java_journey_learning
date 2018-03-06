/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月6日 下午6:43:51  
 *  
 */  

package com.algorithm;

import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月6日 下午6:43:51  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月6日      Eg                      1.0         1.0 Version  
 */

/*
 * 插入排序
 */
public class InsertionSort {
	public static void main(String[] args) {
		int[] a= {34,56,78,1,2,37,90,45};
		insertSort(a);
		System.out.println(Arrays.toString(a));
	}
	
	public static void insertSort(int[] a) {
		
		for(int i=1;i<a.length;i++) {
			
			for(int j=i;j>0;j--) {
				if(a[j]<a[j-1]) {
					swap(a,j, j-1);
				}else {
					break;
				}
			}
		}
		
	}
	
	public static void swap(int[] a,  int indexX,int indexY) {
		int temp=a[indexX];
		a[indexX]=a[indexY];
		a[indexY]=temp;
		
	}
}

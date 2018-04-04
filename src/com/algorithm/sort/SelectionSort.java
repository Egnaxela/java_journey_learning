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

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import com.rongji.entity.Person;

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
	
	
	public static void main(String[] args) throws Exception, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SortHelper.testSort("com.algorithm.sort.SelectionSort",
				"selection",
				SortHelper.changePackArr(
						SortHelper.generateRandom(10000, 0, Integer.MAX_VALUE)
						));
		
		SortHelper.testSort("com.algorithm.sort.SelectionSort",
				"selection",
						SortHelper.generateRandom(10000, 0, Integer.MAX_VALUE)
						);
	}
	
	
	/**
	 * 
	* <p>描述:选择排序</p>
	* @author Eg
	 */
	public static void selectionTest() {
		int[] arr= {2,34,67,23,9,12};
		selection(arr);
		
		int[] arrRandom=generateRandomArray(100, 100, 8000);
		selection(arrRandom);
		
		
		Float[] arr1= {12f,34.5f,45.7f,3f,23f};
		selection(arr1);
		
		Person[] p=new Person[4];
		p[0]=new Person("Mike", "Leonador", 23, "USA", null);
		p[1]=new Person("Mike", "Aonador", 24, "USA", null);
		p[2]=new Person("Mike", "Neonador", 25, "USA", null);
		p[3]=new Person("Mike", "Meonador", 24, "USA", null);
		selection(p);
		System.out.println(Arrays.toString(arrRandom));
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(p));
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
	
	
	@SuppressWarnings({"unchecked","rawtypes"})
	public static void selection(Comparable[] arr) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].compareTo(arr[j])>0) {
					swap(arr, i, j);
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
	
	/**
	 * 
	* <p>描述:按下标来交换数组元素</p>
	* @param arr
	* @param i
	* @param j
	* @author Eg
	 */
	public static void swap(Object[] arr,int i,int j) {
		Object temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	
	/**
	 * 
	* <p>描述:</p>
	* @param n 要产生的随机数个数
 	* @param rangeL  左区间
	* @param rangeR  右区间
	* @return
	* @author Eg
	 */
	public static int[] generateRandomArray(int n,int rangeL,int rangeR) {
		assert rangeL<=rangeR;
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=(int)(Math.random()*(rangeR-rangeL+1)+rangeL);
		}
		return arr;
	}
	
	
	
	
	
	
	

}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月3日 下午5:50:57  
 *  
 */  

package com.algorithm.sort;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.IntStream;

/**  
 * Description: 排序辅助工具类  
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月3日 下午5:50:57  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月3日      Eg                      1.0         1.0 Version  
 */

public class SortHelper {

	/**
	 * 
	* <p>描述:</p>
	*  @author Eg
	 * @throws ClassNotFoundException 
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	@SuppressWarnings({"rawtypes","unchecked"})
	public static void  testSort(String className,String methodName, Comparable[] arr) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Class clazz=Class.forName(className);
		Method method=clazz.getMethod(methodName, new Class[] {Comparable[].class});
		method.setAccessible(true);
		Object[] params=new Object[] {arr};
	//	print(arr);
		long startTime=System.currentTimeMillis();
		method.invoke(null, params);
		long endTime=System.currentTimeMillis();
	//	print(arr);
		if(!isSorted(arr)) {
			throw new IllegalArgumentException("排序不正确");
		}
		System.out.println(clazz.getSimpleName()+" "+ methodName +":"+(endTime-startTime)/1000.0+"s");
	}
	
	
	/**
	 * 
	* <p>描述:校验数组是否按照从小到大排序</p>
	* @param arr
	* @return
	* @author Eg
	 */
	@SuppressWarnings({"unchecked","rawtypes"})
	public static boolean isSorted(Comparable[] arr) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i].compareTo(arr[i+1])>0) {
				return false;
			}
		}
		return true;
	}
	
	/**
	 * 
	* <p>描述:随机生成指定范围的正整数</p>
	* @param n
	* @param rangeL
	* @param rangeR
	* @return
	* @author Eg
	 */
	public static int[] generateRandom(int n,int rangeL,int rangeR) {
		if(rangeL>rangeR||n<=0)
			throw new IllegalArgumentException("产生元素不能为负数或右区间不能小于左区间");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]= (int)(Math.random()*(rangeR-rangeL+1))+rangeL;
		}
		return arr;
	}
	
	/**
	 * 
	* <p>描述:打印 int数组</p>
	* @param arr
	* @author Eg
	 */
	public static void print(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	public static void print(@SuppressWarnings("rawtypes") Comparable[] arr) {
		System.out.println(Arrays.toString(arr));
	}
	
	
	/**
	 * 
	* <p>描述:将int[] 转成对应的Integer[]</p>
	* JDK1.8
	* @param arr
	* @return
	* @author Eg
	 */
	public static Integer[] changePackArr(int[] arr) {
		return Arrays.stream(arr).boxed().toArray(Integer[]::new);
	}
	
	/**
	 * 
	* <p>描述:将int[] 转成对应的Integer[]</p>
	* JDK 1.8
	* @param arr
	* @return
	* @author Eg
	 */
	public static Integer[] changePackArr2(int[] arr) {
		return IntStream.of(arr).boxed().toArray(Integer[]::new);
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月23日 下午3:47:11  
 *  
 */  

package com.leetCode;

import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月23日 下午3:47:11  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月23日      Pluto       1.0         1.0 Version  
 */

/*
 * Given an array A of non-negative integers, return an array consisting of all the even elements of A, 
 * followed by all the odd elements of A.

You may return any answer array that satisfies this condition.

 

Example 1:

Input: [3,1,2,4]
Output: [2,4,3,1]
The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 

Note:

1 <= A.length <= 5000
0 <= A[i] <= 5000

给定一个非负的整数数组，返回一个按奇偶区分的数组
 */
public class SortArrayByParity905 {

	public static void main(String[] args) {
		int[] A= {3,1,2,4,7,8};
		System.out.println(Arrays.toString(sortArrayByParity(A)));
	}
	
	/*
	 * 新建一个数组分别从头尾开始保存奇偶数
	 */
	public static int[] sortArrayByParity(int[] A) {
		int[] B=new int[A.length];
		int begin=0;
		int end=A.length-1;
		for(int i=0;i<A.length;i++) {
			if(A[i]%2==0) {
				B[begin++]=A[i];
			}else {
				B[end--]=A[i];
			}
		}
		return B;
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年4月24日 下午1:44:40  
 *  
 */  

package com.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年4月24日 下午1:44:40  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年4月24日      Pluto       1.0         1.0 Version  
 */

/*
 * Given an array of integers A sorted in non-decreasing order, 
 * return an array of the squares of each number, 
 * also in sorted non-decreasing order.


Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:

Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 

Note:
1 <= A.length <= 10000
-10000 <= A[i] <= 10000
A is sorted in non-decreasing order.


非降序排序 即数列符合a(n+1)≥an
 */
public class SquaresOfASortedArray977 {

	public static void main(String[] args) {

		int[] A = { -10,-4, -1, 0, 3, 10,11 };
		int[] A2 = { -10,-4, -1, 0, 3, 10,11 };
		System.out.println(Arrays.toString(sortedSquares(A)));
		System.out.println(Arrays.toString(sortedSquares2(A2)));
	}

	/*
	 * 对数组元素平方后进行插入排序
	 */
	public static int[] sortedSquares(int[] A) {
		for (int i = 0; i < A.length; i++) {
			int key = A[i] * A[i];
			int j = i - 1;
			while (j >= 0 && A[j] > key) {
				A[j + 1] = A[j];
				j--;
			}
			A[j + 1] = key;
		}
		return A;
	}

	/*
	 * 将首尾元素平方后对比插入 
	 * 时间复杂度O(n)
	 */
	public static int[] sortedSquares2(int[] A) {
        int[] result = new int[A.length];
        int p = A.length - 1;

        for (int i = 0, j = A.length - 1; p >= 0;p--) {
            int left = A[i] * A[i];
            int right = A[j] * A[j];
            if (left >= right) {
                result[p] = left;
                i++;
            } else {
                result[p] = right;
                j--;
            }
        }
        return result;
	}
}

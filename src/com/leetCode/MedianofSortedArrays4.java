/**  
 * FileName:     
 * @Description: 
 * Company       RJ
 * @version      1.0
 * @author:      Egnaxela  
 * @version:     1.0
 * Createdate:   2018年1月29日 上午9:51:49  
 *  
 */  

package com.leetCode;

import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2018 
 * Company:     RJ  
 * @author:     Egnaxela  
 * @version:    1.0  
 * Create at:   2018年1月29日 上午9:51:49  
 *  
 * Modification History:  
 * Date         Author         Version     Description  
 * ------------------------------------------------------------------  
 * 2018年1月29日      Egnaxela       1.0         1.0 Version  
 */

/*
 * There are two sorted arrays nums1 and nums2 of size m and n respectively.
 * Find the median of the two sorted arrays. 
 * The overall run time complexity should be O(log (m+n)).
 * Example 1:
 * nums1 = [1, 3]
 * nums2 = [2]
 * The median is 2.0
 * 
 * Example 2:
 * nums1 = [1, 2]
 * nums2 = [3, 4]
 * The median is (2 + 3)/2 = 2.5

 */
public class MedianofSortedArrays4 {
	public static void main(String[] args) {
//		int[] A= {};
//		int[] B= {};
		int[] A= {1,2,9,27,107};
		int[] B= {3,4,15,54,109};
		
		System.out.println(findMedianSortedArrays(A, B));
		System.out.println(findMedianSortedArrays2(A, B));
		System.out.println(Arrays.toString(findMedianSortArrays3(A, B)));
		
	}
	
	public static int[] findMedianSortArrays3(int[] A,int[] B) {
		int[] c=new int[A.length+B.length];
		int lenA=0,lenB=0,lenC=0;
		/*
		 * 放进一个元素到新数组中放入元素的数组下标就会＋1，当其中一个数组的全部元素都放进去之后，下标就会变为该数组的长度
		 * 此时，表明其中一个数组的全部元素，已经都放入新数组。
		 * 而另一个元素剩余的元素的最小值都比其中一个元素的最大值大，
		 * 此时只需将另一个数组的剩余元素依次放入新数组即可。
		 */
		while(lenA<A.length&&lenB<B.length) {
			if(A[lenA]<B[lenB]) {
				c[lenC++]=A[lenA++];
			}else {
				c[lenC++]=B[lenB++];
			}
		}
		
		while(lenA<A.length) {
			c[lenC++]=A[lenA++];
		}
		
		while(lenB<B.length) {
			c[lenC++]=B[lenB++];
		}
   		return c;
	}

	public static double findMedianSortedArrays(int[] A, int[] B) {
		int m = A.length;
        int n = B.length;
        if(m==0&&n==0) {
        	return 0.0f;
        }
        // make sure m <= n
        if (m > n) return findMedianSortedArrays(B, A);
        
        int imin = 0, imax = m;
        while (imin <= imax) {
            int i = imin + (imax - imin) / 2;
            int j = (m + n + 1) / 2 - i;
            
            int A_left = i == 0 ? Integer.MIN_VALUE : A[i - 1];
            int A_right = i == m ? Integer.MAX_VALUE : A[i];
            int B_left = j == 0 ? Integer.MIN_VALUE : B[j - 1];
            int B_right = j == n ? Integer.MAX_VALUE : B[j];
            
            if (A_left > B_right) {
                imax = i - 1;
            } else if (B_left > A_right) {
                imin = i + 1;
            } else {
                int max_left = A_left > B_left ? A_left : B_left;
                int min_right = A_right > B_right ? B_right : A_right;
                if ((m + n) % 2 == 1) 
                    return max_left; // # of left_part = # of right_part + 1;
                else 
                    return (max_left + min_right) / 2.0;
            }
        }
        return -1;
	}
	
	public static double findMedianSortedArrays2(int[] nums1, int[] nums2) {
		int m = nums1.length;
		int n = nums2.length;
		
		if (m > n) {
			return findMedianSortedArrays(nums2, nums1);
		}
		
		int i = 0, j = 0, imin = 0, imax = m, half = (m + n + 1) / 2;
		double maxLeft = 0, minRight = 0;
		while(imin <= imax){
			i = (imin + imax) / 2;
			j = half - i;
			if(j > 0 && i < m && nums2[j - 1] > nums1[i]){
				imin = i + 1;
			}else if(i > 0 && j < n && nums1[i - 1] > nums2[j]){
				imax = i - 1;
			}else{
				if(i == 0){
					maxLeft = (double)nums2[j - 1];
				}else if(j == 0){
					maxLeft = (double)nums1[i - 1];
				}else{
					maxLeft = (double)Math.max(nums1[i - 1], nums2[j - 1]);
				}
				break;
			}
		}
		if((m + n) % 2 == 1){
			return maxLeft;
		}
		if(i == m){
			minRight = (double)nums2[j];
		}else if(j == n){
			minRight = (double)nums1[i];
		}else{
			minRight = (double)Math.min(nums1[i], nums2[j]);
		}
		
		return (double)(maxLeft + minRight) / 2;
	}
}

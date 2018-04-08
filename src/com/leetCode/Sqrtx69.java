/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年4月8日 下午3:17:30  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年4月8日 下午3:17:30  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年4月8日      Eg          1.0         1.0 Version  
 */

/**
 *
 * Implement int sqrt(int x).
 * Compute and return the square root of x.
 * x is guaranteed to be a non-negative integer.
 * 
 * Example 1:
 * Input: 4
 * Output: 2
 * 
 * Example 2:
 * Input: 8
 * Output: 2
 * 
 * Explanation: The square root of 8 is 2.82842..., 
 * and since we want to return an integer, 
 * the decimal part will be truncated
 * 
 */
public class Sqrtx69 {

	public static void main(String[] args) {
		System.out.println(mySqrt(896757631));
		System.out.println(mySqrt3(896757631));
		System.out.println(mySqrt3(896757631));
	}
	
	public static int mySqrt(int x) {
		if(x<=0) return 0;
		int left=1,right=x,mid=left+(right-left)/2;
		while(left<=right) {
			if(mid==x/mid) return mid;
			else {
				if(mid>x/mid) right=mid-1;
				else left=mid+1;
				mid=left+(right-left)/2;
			}
		}
		return right;
	}
	
	public static int mySqrt2(int x) {
		double pre=0,cur=x;
		while(Math.abs(cur-pre)>0.000001) {
			pre=cur;
			cur=(pre/2+x/(2*pre));
		}
		return (int)cur;
	}
	
	public static int mySqrt3(int x) {
		if(x < 4) return x == 0 ? 0 : 1;
	    int res = 2 * mySqrt3(x/4);
	    if((res+1) * (res+1) <= x && (res+1) * (res+1) >= 0) return res+1;
	    return res;
	}
}

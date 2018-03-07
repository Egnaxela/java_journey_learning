/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月7日 下午5:49:29  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月7日 下午5:49:29  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月7日      Eg                      1.0         1.0 Version  
 */

/*
 * Given a positive integer, output its complement number. 
 * The complement strategy is to flip the bits of its binary representation.

Note:

    The given integer is guaranteed to fit within the range of a 32-bit signed integer.
    You could assume no leading zero bit in the integer’s binary representation.

Example 1:

Input: 5
Output: 2
Explanation: The binary representation of 5 is 101 (no leading zero bits), and its complement is 010. So you need to output 2.

Example 2:

Input: 1
Output: 0
Explanation: The binary representation of 1 is 1 (no leading zero bits), and its complement is 0. So you need to output 0.

Seen this question in a real interview before?  
 */
public class NumberComplement476 {
	public static void main(String[] args) {
		System.out.println(findComplement(5));
		System.out.println(findComplement2(5));
	}
	
	public static int findComplement(int num) {
        return ((Integer.highestOneBit(num) << 1) - 1)^num;
    }
	
	public static int findComplement2(int num) {
		int temp=num,mask=1;
		while(temp!=0) {
			temp=temp>>1;
        	mask=mask<<1;
		}
		return num^(mask-1);
    }
	
	
}

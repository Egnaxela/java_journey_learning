/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月11日 上午11:19:38  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年10月11日 上午11:19:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月11日      Eg                      1.0         1.0 Version  
 */



/**
The Hamming distance between two integers is the number of positions at which the corresponding bits are different.

Given two integers x and y, calculate the Hamming distance.

Note:
0 ≤ x, y < 231.

Example:

Input: x = 1, y = 4

Output: 2

Explanation:
1   (0 0 0 1)
4   (0 1 0 0)
       ↑   ↑

The above arrows point to positions where the corresponding bits are different.

*/
public class HammingDistance461 {
	public static void main(String[] args) {
		System.out.println(hammingDistance(1, 4));
	}
	
	/**
	 * 求x,y之间的汉明距离
	 * 先对两个数进行异或(即不进位的加法)运算
	 * 之后只要对异或后的数求其中 1的个数即可
	* <p>描述:</p>
	* @param x
	* @param y
	* @return
	* @author Eg
	 */
	public static int hammingDistance(int x,int y) {
		int count=0;
		int z=x^y;
		while(z!=0) { //等于0结束 ，如果z最后等于1则加上最后一次的1，如果z最后等于0 则直接结束
			if(z%2==1) {
				count++;
			}
			z=z/2;
		}
		
		return count;
	}
}

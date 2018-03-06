/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月19日 上午9:57:22  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月19日 上午9:57:22  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月19日      Eg                      1.0         1.0 Version  
 */

/**
 * Given a 32-bit signed integer, reverse digits of an integer.
 * 
 * Example 1:
 * Input:   123
 * Output:  321
 * 
 * Example 2:
 * Input:  -123
 * Output: -321
 * 
 * Example 3:
 * Input:  120
 * Output: 21

 */
public class ReverseInteger7 {

	//Line 13: java.lang.NumberFormatException: For input string: "9646324351"

	public static void main(String[] args) {
		//System.out.println("reverseInteger :" + reverseInteger1(9646324351));
		//System.out.println("reverseInteger :" + reverseInteger2(1534236469));
		//System.out.println("reverseInteger :" + reverseInteger3(1534236469));

	}

	public static int reverseInteger1(int x) {
		   int res=0;
	        while(x!=0){
	            int t=res*10+x%10;
	            if(t/10!=res) return 0;
	            res=t;
	            x/=10;
	        }
	        return res;
	}
	
	public static int reverseInteger2(int x) {
	    if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
	        return 0;
	    }

	    int revNum = 0;
	    int digit = 0;
	    // 关键也就是这三行的代码
	    while (x != 0) {
	        digit = x % 10;
	        revNum = digit + revNum * 10;
	        x /= 10;
	    }
	    return revNum;
	}
	
	public static int reverseInteger3(int x) {
		
		int rev = 0;  
		while(x!=0)  
		{  
		 if (rev != 0 && Integer.MAX_VALUE / rev < 10  
		                 && Integer.MAX_VALUE / rev > -10)  
		             return 0;  
		 rev = rev*10 + x%10;  
		 x = x/10;  
		}  
		  
		return rev;  
	}
}

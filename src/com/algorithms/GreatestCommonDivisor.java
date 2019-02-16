/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto 
 * @version:     1.0
 * Createdate:   2019年2月16日 下午9:46:18  
 *  
 */  

package com.algorithms;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto  
 * @version:    1.0  
 * Create at:   2019年2月16日 下午9:46:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年2月16日      Pluto       1.0         1.0 Version  
 */

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		int p=4212,q=1431;
		System.out.println(gcd(p, q));
	}
	
	public static int gcd(int p,int q) {
		if(q==0) return p;
		int r=p%q;
		return gcd(q, r);
	}
}

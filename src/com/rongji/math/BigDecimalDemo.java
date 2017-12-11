/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月6日 上午9:48:15  
 *  
 */  

package com.rongji.math;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月6日 上午9:48:15  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月6日      Eg                      1.0         1.0 Version  
 */

public class BigDecimalDemo {
	
	public static void main(String[] args) {
		BigInteger bigInteger=new BigInteger("8786873872163127361287362187321321");
		BigInteger bigInteger2=new BigInteger("7656763872163127361287362187321321");
		System.out.println("add "+bigInteger.add(bigInteger2));
		BigInteger bigInteger11=new BigInteger("8786873872163127361287362187321321",10);
		BigInteger bigInteger12=new BigInteger("7656763872163127361287362187321321",10);
		System.out.println("add "+bigInteger11.add(bigInteger12));
		
		System.out.println("sub "+bigInteger.subtract(bigInteger2));
		System.out.println("multiply "+bigInteger.multiply(bigInteger2));
		System.out.println("divide "+bigInteger.divide(bigInteger2));//除商
		System.out.println("divideAndRe"+Arrays.toString(bigInteger.divideAndRemainder(bigInteger2)));
		
		System.out.println("----------------------------------------");
		BigDecimal bigDecimal=new BigDecimal("8786873872163127361287362187321321");
		BigDecimal bigDecimal2=new BigDecimal("7656763872163127361287362187321321");
		System.out.println("add "+bigDecimal2.add(bigDecimal));
		System.out.println("divide "+bigDecimal2.divide(bigDecimal,10,BigDecimal.ROUND_DOWN));
	}
}

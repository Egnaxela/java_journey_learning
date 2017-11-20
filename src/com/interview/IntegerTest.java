/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月10日 上午10:32:31  
 *  
 */  

package com.interview;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月10日 上午10:32:31  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月10日      Eg                      1.0         1.0 Version  
 */

public class IntegerTest {

	private final int value;
	public static final int MAX_VALUE=0x7fffffff;
	
	public IntegerTest(int value) {
		this.value=value;
	}
	
	public static IntegerTest valueOf(int i) {
		if(i>=IntegerCache.low&&i<=IntegerCache.high)
			return IntegerCache.cache[i+(-IntegerCache.low)];
		return new IntegerTest(i);
	}
	
	public static int parseInt(String s) throws NumberFormatException{
		return parseInt(s,10);
	}
	
	public static int parseInt(String s,int radix) throws NumberFormatException{
		//TODO
		return 2;
	}
	
	private static class IntegerCache{
		static final int low=-128;
		static final int high;
		static final IntegerTest cache[];
		static {
			int h=127;
			String integerCacheHighPropValue=sun.misc.VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
			if(integerCacheHighPropValue!=null) {
				try {
					int i=parseInt(integerCacheHighPropValue);
					i=Math.max(i, 127);
					h=Math.min(i, IntegerTest.MAX_VALUE-(-low)-1);
				} catch (NumberFormatException e) {
					
				}
			}
			
			high=h;
			cache=new IntegerTest[(high-low)+1];
			int j=low;
			for(int k=0;k<cache.length;k++) {
				cache[k]=new IntegerTest(j++);
			}
			assert IntegerCache.high>=127;
		}
	}
}

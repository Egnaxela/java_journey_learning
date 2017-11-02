/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年6月15日 上午11:57:08  
 *  
 */  

package com.rongji.lang;

import java.math.BigDecimal;
import java.util.HashSet;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年6月15日 上午11:57:08  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年6月15日      Eg                      1.0         1.0 Version  
 */

public class ComparableTestBigDecimal implements ComparableTest<BigDecimal>{
	

	public int compareTo(BigDecimal val){
		
		return 1;
	}
	
	
	@Test
	public void tes(){
		System.out.println(Object.class.getName());
	}
}

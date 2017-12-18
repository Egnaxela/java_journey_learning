/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年12月18日 上午11:39:29  
 *  
 */  

package com.interview;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年12月18日 上午11:39:29  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年12月18日      Eg                      1.0         1.0 Version  
 */

public class MemoryAndStackTest {

	@Test
	public void outofMemoryErrorTest() { //-Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
		List<Integer> list=new ArrayList<>();
		int i=0;
		while(true) {
			list.add(i++);
		}
	}
	
	@Test
	public void stackOverFlowTest() {
		stackOverFlow(1);
	}
	
	public void stackOverFlow(int deep) {
		stackOverFlow(deep);
	}
	
	
}

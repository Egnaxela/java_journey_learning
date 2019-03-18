/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月2日 下午3:54:36  
 *  
 */  

package com.interview.ali;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月2日 下午3:54:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月2日      Pluto       1.0         1.0 Version  
 */

public class MapInitTest {
	
	@Test
	public void getTest() {
		HashMap<String, String> map=new HashMap<String,String>();
		String result1=map.put("M", "Mike");
		String result2=map.put("M", "Michael");
		map.put("M", "Micro");
		map.put("W", "Marry");
		map.put("W", "May");
		
		for(Map.Entry<String, String>  entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println("M".hashCode());
		System.out.println(result1+" "+result2);
	}

}

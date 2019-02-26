/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年2月26日 下午9:29:57  
 *  
 */  

package com.interview.ali;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年2月26日 下午9:29:57  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年2月26日      Pluto       1.0         1.0 Version  
 */

public class MapergodicTest {
	public static void main(String[] args) {
		Map<String, String> map=new HashMap<>();
		map.put("key10", "value10");
		map.put("key11", "value11");
		map.put("key12", "value12");
		map.put("key13", "value13");
		//键与值都需要
		for(Map.Entry<String, String> entry :map.entrySet()) {
			System.out.println("Key="+entry.getKey()+",value="+entry.getValue());
		}
		
		//只需要key或value
		for(String key:map.keySet()) {
			System.out.println("key="+key);
		}
		
		for(String value:map.values()) {
			System.out.println("value="+value);
		}
		
		//使用Iterator遍历
		Iterator<Map.Entry<String, String>> entries=map.entrySet().iterator();
		while(entries.hasNext()) {
			Map.Entry<String, String> entry=entries.next();
			System.out.println("Key="+entry.getKey()+",Value="+entry.getValue());
			
		}
		

	}

}

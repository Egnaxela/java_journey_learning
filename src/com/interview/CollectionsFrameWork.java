/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月9日 下午5:16:07  
 *  
 */  

package com.interview;

import java.util.HashMap;
import java.util.Hashtable;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月9日 下午5:16:07  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月9日      Eg                      1.0         1.0 Version  
 */

public class CollectionsFrameWork {

	public static void main(String[] args) {
		HashMap<Object, Object> map=new HashMap<>();
		Hashtable<Object, Object> table=new Hashtable<>();
		/*
		 * HashMap允许放入key为null的值
		 * 因为 hash(key)   JDK 1.8
		 * return (key==null)?0:(h=key.hashCode())^(h>>>16);
		 */
		map.put(null, "2"); 
		
		/*
		 * HashTable不允许放入key为null的值
		 * 因为 int hash=key.hashCode();
		 */
	//	table.put(null, "3");
		String str="Hello"; //69609650
		System.out.println(str.hashCode());
		System.out.println(map.get(null));
	//	System.out.println(table.get(null));
		
	}
}

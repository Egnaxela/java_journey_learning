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
		
		System.out.println("**********");
		Integer i01=59;
		int i02=59;
		Integer i03=Integer.valueOf(59);
		Integer i04=new Integer(59);
		System.out.println(i01==i02);
		System.out.println(i01==i03);
		System.out.println(i03==i04);
		System.out.println(i02==i04);
		System.out.println("**********");
		Integer i011=159;
		int i021=159;
		Integer i031=Integer.valueOf(159);
		Integer i041=new Integer(159);
		System.out.println(i011==i021);
		System.out.println(i011==i031);
		System.out.println(i031==i041);
		System.out.println(i021==i041);
		System.out.println("************");
		System.out.println(sun.misc.VM.getSavedProperty("java.runtime.name"));
		System.out.println(System.getProperties());
		System.out.println("************");
		String a="1234";
        String b="1234";
        String c = new String("1234");
        System.out.println(a==b);
        System.out.println(a==c);
        System.out.println(a.equals(c));
        System.out.println("--"+CollectionsFrameWork.class.getClassLoader());
        
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月28日 下午10:44:25  
 *  
 */  

package com.interview.day0;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月28日 下午10:44:25  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月28日      Pluto       1.0         1.0 Version  
 */

public class ArrayListTest {
	public static void main(String[] args) throws Exception {
		List<String> list=new ArrayList<String>();
		System.out.println(getElementDataLength(list));
		System.out.println(list.size());
		list.add("Michael");
		System.out.println(getElementDataLength(list));
		System.out.println(list.size());
		System.out.println(list);
		
		List<String> list2=new ArrayList<String>();
		System.out.println(getElementDataLength(list2));
		System.out.println(list2.size());
		for(int i=0;i<11;i++) {
			list2.add("Michael:"+System.currentTimeMillis());
		}
		System.out.println(getElementDataLength(list2));
		System.out.println(list2.size());
		System.out.println(list2);
		
	}
	
	public static Integer getElementDataLength(List list) {
		Integer length =null;
		//通过反射获取elementData的值
		try {
			Field field=list.getClass().getDeclaredField("elementData");
			field.setAccessible(true);
			Object[] obj=(Object[]) field.get(list);
			return obj.length;
		} catch (NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return length;
		
	}
}

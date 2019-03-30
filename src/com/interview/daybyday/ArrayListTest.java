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

package com.interview.daybyday;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
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
@SuppressWarnings("rawtypes") 
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
			list2.add("Michael:"+i);
		}
		list2.add("Michael:"+3);
		System.out.println(getElementDataLength(list2));
		System.out.println(list2.size());
		System.out.println(list2);
		System.out.println("----------------------------");
		ergodicList(list2);
		ergodicList1(list2);
		ergodicList2(list2);
		ergodicList(delList1(list2, "Michael:3"));
		
	}
	
	
	
	//通过for循环来遍历  推荐
	public static void ergodicList(List list) {
		for(int i=0;i<list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
	}
	
	//使用增强型for循环来遍历
	public static void ergodicList1(List list) {
		for(Object o:list) {
			System.out.print(o+" ");
		}
		System.out.println();
	}
	
	//通过迭代器来遍历
	public static void ergodicList2(List list) {
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
		System.out.println();
	}
	
	//使用迭代器遍历的方式来删除指定元素
	public static List delList1(List list,String str) {
		Iterator iterator=list.iterator();
		while(iterator.hasNext()) {
			if(str.equals(iterator.next())) {
				iterator.remove();
			}
		}
		return list;
	}
	/**
	 * 
	* <p>描述:通过反射获取elementData的容积</p>
	* @param list
	* @return
	* @author Pluto
	 */
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

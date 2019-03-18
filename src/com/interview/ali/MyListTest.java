/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月18日 下午7:03:18  
 *  
 */  

package com.interview.ali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月18日 下午7:03:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月18日      Pluto       1.0         1.0 Version  
 */

public class MyListTest {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("5");
		list.add("1");
		list.add("2");
		list.add("5");
		list.add("8");
		list.add("7");
		list.add("7");
		list.add("9");
		list.add("19");
		
	
	//	list1(list);
	//	list2(list);
		list3(list);
		
		System.out.println(list);
		
		
	}
	
	
	//推荐
	public static List<String> list3(List<String> list){
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			if("5".equals(str)||"7".equals(str)) {
				iterator.remove();
			}
		}
		return list;
	}
	
	public static List<String> list1(List<String> list){
		for(int i=list.size()-1;i>=0;i--) {
			String str=list.get(i);
			if("5".equals(str)||"7".equals(str)) {
				list.remove(str);
			}
		}
		return list;
	}
	
	public static List<String> list2(List<String> list){
		for(int i=0;i<list.size();i++) {
			String str=list.get(i);
			if("5".equals(str)||"7".equals(str)) {
				list.remove(i);
				i--;
			}
		}
		return list;
	}	
	
	

}
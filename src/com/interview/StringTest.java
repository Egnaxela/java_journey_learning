/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月17日 下午6:28:36  
 *  
 */  

package com.interview;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月17日 下午6:28:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月17日      Eg                      1.0         1.0 Version  
 */

public class StringTest {
	private final char value[]=null;
	private int hash;
	
	public static void main(String[] args) {
		/*
		 * stack 栈 (VM stack 虚拟机栈; Native method stack 本地方法栈)
		 * heap 堆 
		 * method Area 方法区
		 * program counter register 程序计数器
		 */
		String str="NAME";
		System.out.println(new StringTest().hashCode());
	}
	
	public int hashCode() {
		int h=hash;
		if(h==0&&value.length>0) {
			char val[]=value;
			for(int i=0;i<value.length;i++) {
				h=h*31+val[i];
			}
			hash=h;
		}
		return h;
	}
}

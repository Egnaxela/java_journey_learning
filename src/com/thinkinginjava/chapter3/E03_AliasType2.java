/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月6日 下午4:16:46  
 *  
 */  

package com.thinkinginjava.chapter3;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月6日 下午4:16:46  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月6日      Pluto       1.0         1.0 Version  
 */

public class E03_AliasType2 {
	
	float price ;
	
	static void objectMod(E03_AliasType2 obj) {
		obj.price=30.9f;
	}
	
	public static void main(String[] args) {
		E03_AliasType2 e1=new E03_AliasType2();
		e1.price=30f;
		System.out.println("e1.price:"+e1.price);
		objectMod(e1);
		System.out.println("e1.price:"+e1.price);
		
	}
}

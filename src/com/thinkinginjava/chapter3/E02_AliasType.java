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

public class E02_AliasType {
	
	float price ;
	public static void main(String[] args) {
		E02_AliasType e1=new E02_AliasType();
		E02_AliasType e2=new E02_AliasType();
		e1.price=27.5f;
		e2.price=27.3f;
		System.out.println("e1.price:"+e1.price+", e2.price:"+e2.price);
		
		e1=e2;
		System.out.println("e1.price:"+e1.price+", e2.price:"+e2.price);
		
		e1.price=29.7f;
		e2.price=29.9f;
		System.out.println("e1.price:"+e1.price+", e2.price:"+e2.price);
	}
}

class Tank{
	float price;
}
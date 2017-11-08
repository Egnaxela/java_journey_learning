/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月3日 上午10:32:19  
 *  
 */  

package com.interview;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisTemplate;

import com.google.GuavaTester;
import com.rongji.dfish.base.crypt.Base32;

import static java.lang.System.out;
import static java.lang.Math.PI;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月3日 上午10:32:19  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年11月3日      Eg                      1.0         1.0 Version  
 */


public class BasicGrammar {

	private static final String radio="2.14";
	/**
	 * chapter one
	 * 关键字 static final transient volatile
	 */
	//static
	/*
	 * 修改变量、方法
	 * 静态块、静态内部类、静态导包
	 */
	RedisTemplate<Serializable,Object> redisTemplate;
	
	/**
	 * 
	 */
	public BasicGrammar() {
		System.out.println("Constructor");
	}
	
	{
		System.out.println("Block");
	}
	
	static {
		System.out.println("static Block");
	}
	
	GuavaTester guavaTester=new GuavaTester();
	public static void main(String[] args) {
		/*静态导入适用于导入静态方法和静态变量
		 *对于经常使用的静态属性和静态方法,使用静态导包后会变得简单;
		 *但同时也不便于阅读，如果同一个静态属性和方式同时存在于多个类中,就无法确定使用的是那一个 
		 *不建议使用。
		 *若必须使用需遵循如下规则：
		 *1、不使用*（星号）通配符，除非是导入静态常量类（只包含常量的类或接口）。
		 *2、方法名是具有明确、清晰表象意义的工具类。
		 */
		BasicGrammar grammar=new BasicGrammar();
		BasicGrammar grammar2=new BasicGrammar();
		out.println("PI:"+PI);
		out.println("radio"+radio);
	}
	
	
}

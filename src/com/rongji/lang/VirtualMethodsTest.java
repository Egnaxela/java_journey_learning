/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年8月8日 下午5:24:14  
 *  
 */  

package com.rongji.lang;

import org.junit.Test;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年8月8日 下午5:24:14  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月8日      Eg                      1.0         1.0 Version  
 */

public class VirtualMethodsTest extends Base{
	
	String str="Sub String";
	
	@Override
	public void init() {
		System.out.println("Sub init");
	}
	
	@Test
	public void test() {
		VirtualMethodsTest vTest=new VirtualMethodsTest();
		vTest.show();
	}
	
	@Test
	public void test2() {
		System.out.println(" "+VirtualMethodsTest.class.getClass().getClass().getName());
		System.out.println(" "+Object.class.getClassLoader());
		System.out.println("自定义类的类加载器: "+VirtualMethodsTest.class.getClassLoader());
		System.out.println("自定义类的类加载器的父类加载器: "+VirtualMethodsTest.class.getClassLoader().getParent());
		System.out.println("自定义类的类加载器的父类加载器的父类加载器: "+VirtualMethodsTest.class.getClassLoader().getParent().getParent());
		System.out.println(" "+ClassLoader.getSystemClassLoader().getParent());

	}
	
	@Test
	public void test3() throws Exception {
		/**
		 * 直接调用空构造器肯能会出现还是使用AppClassLoader
		 * 因为AppClassLoader会自动加载CLASSPATH下面的 .class文件
		 */
		//MyClassLoader mc=new MyClassLoader();
		
		/**ClassLoader.getSystemClassLoader()
		 * 返回的是委托的系统加载器，通常是AppClassLoader
		 * 
		 */
		
		MyClassLoader mc = new MyClassLoader(ClassLoader.getSystemClassLoader().getParent());
		Class<?> clazz=Class.forName("com.rongji.lang.WorldTest",true,mc);
		System.out.println("clazz.newInstance: "+clazz.newInstance());
		System.out.println("clazz.getClassLoader: "+clazz.getClassLoader());
	}
	
	/**
	 * 普通用户自定义的类是由AppClassLoader加载的
	 * AppClassLoader的父类加载器是ExtClassLoader
	 * ExtClassLoader的父类加载器是BootStrap ClassLoader,
	 * 由于BootStrap ClassLoader不是一个
	* <p>描述:</p>
	* @author Eg
	 */
	@Test
	public void test4() {
		ClassLoader loader=VirtualMethodsTest.class.getClassLoader();
		while(loader!=null) {
			System.out.println(" "+loader);
			loader=loader.getParent();
		}
		System.out.println(" "+loader);
	}
	
}

class Base{
	String str="Base String";
	public void show() {
		System.out.println(str);
		init();
	}
	
	public void init() {
		System.out.println("Base init");
	}
	
}

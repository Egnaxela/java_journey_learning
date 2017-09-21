/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年8月11日 下午2:12:25  
 *  
 */  

package com.rongji.lang;
/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年8月11日 下午2:12:25  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年8月11日      Eg                      1.0         1.0 Version  
 */

/**
 * ClassLoader 初探 
 * 类加载器是负责加载类的一个对象，是一个抽象类
 * 
 */
public abstract class ClassLoaderInit {

	private ClassLoaderInit parent;
	/**
	 * 
	* <p>描述:
	* protected修饰表示此方法可以被ClassLoader的子类重写且应该被类加载器的实现重写。
	* 使用指定的二进制名称类查找类
	* 二进制名称如：
	* 	"java.lang.String"
	* 	"java.security.KeyStore$Builder$FileBuilder$1"
	* 	"java.net.URLClassLoader$3$1"
	* 按照委托模式来加载类，在通过父类加载器检查所请求的类后，此方法被loadClass()调用
	* </p>
	* @param name
	* @return
	* @throws ClassNotFoundException
	* @author Eg
	 */
	protected Class<?> findClass(String name) throws ClassNotFoundException{
		throw new ClassNotFoundException(name);
	}
	
	public Class<?> loadClass(String name) throws ClassNotFoundException{
		return loadClass(name,false);
	}
	
	/**
	 * 
	* <p>描述:使用指定的二进制名称来加载类</p>
	* @param name
	* @param resolve
	* @return
	* @throws ClassNotFoundException
	* @author Eg
	 */
	protected synchronized Class<?> loadClass(String name,boolean resolve) throws ClassNotFoundException{
		Class c=findLoadedClass(name);
		if(c==null) {
			try {
				if(parent!=null) {
					c=parent.loadClass(name,false);
				}else {
					c=findBootstrapClass0(name);
				}
			} catch (ClassNotFoundException e) {
				c=findClass(name);
			}
		}
		
		if(resolve) {
			resolveClass(c);
		}
		return c;
		
	}
	
	protected final void resolveClass(Class c) {
		resolveClass0(c);
	}
	
	private native void resolveClass0(Class c);
	
	protected final Class<?> findLoadedClass(String name) {
		if(!checkName(name))
			return null;
		return findLoadedClass0(name);
	}
	
	private boolean checkName(String name) {
		if((name==null)||(name.length()==0))
			return true;
//		if((name.indexOf('/')!=-1)||(!VM.allowArraySyntax()&&(name.charAt(0)=='[')))
//			return false;
		
		return true;
	}
	

	
	


private native final Class findLoadedClass0(String name);

private Class findBootstrapClass0(String name) throws ClassNotFoundException{
	if(!checkName(name)) 
		throw new ClassNotFoundException(name);
	return null;
}
}


//private native Class findBootstrapClass(String name) throws ClassNotFoundException;

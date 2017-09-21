/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      吴有根  
 * @version:     1.0
 * Createdate:   2017年9月20日 下午7:50:36  
 *  
 */  

package com.rongji.lang;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     吴有根  
 * @version:    1.0  
 * Create at:   2017年9月20日 下午7:50:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年9月20日      吴有根                      1.0         1.0 Version  
 */

/**
 * String为什么被修饰为final
 * 
 * String应用的非常非常广泛，几乎每一个类都会用到。
 * 如果不被修饰为final,其他的类就可以继承修改其方法，导致混乱。
 * 为了安全性和性能？
 * 
 * */
public final class StringTest
	implements java.io.Serializable,Comparable<StringTest>,CharSequence
	{

	/**
	 * final修饰的变量必须要初始化(在定义的时候初始化或者构造函数中初始化)
	 * static final (必须在定义的时候初始化)
	 * */
	private final char value[];
	
	private final int offset;
	
	
	
	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public char charAt(int index) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public int compareTo(StringTest o) {
		// TODO Auto-generated method stub
		return 0;
	}

}

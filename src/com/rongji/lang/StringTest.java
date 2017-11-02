/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg  
 * @version:     1.0
 * Createdate:   2017年9月20日 下午7:50:36  
 *  
 */  

package com.rongji.lang;

import java.io.ObjectStreamField;
import java.util.Arrays;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年9月20日 下午7:50:36  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年9月20日      Eg                      1.0         1.0 Version  
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
	
	private final int count;
	
	private int hash;
	
	private static final long serialVersionUID = 1L;

	private static final ObjectStreamField[] serialPersistentFields=
			new ObjectStreamField[0];
	

	public StringTest() {
		this.offset=0;
		this.count=0;
		this.value=new char[0];
	}
	
	public StringTest(StringTest original) {
		int size=original.count;
		char[] originalValue=original.value;
		char[] v;
		if(originalValue.length>size) {
			int off=original.offset;
			v=Arrays.copyOfRange(originalValue, off, off+size);
		}else {
			v=originalValue;
		}
		this.offset=0;
		this.count=size;
		this.value=v;
	}
	
	
	
	
	
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

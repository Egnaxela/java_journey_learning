/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年11月15日 下午6:59:35  
 *  
 */  

package com.interview.meituan;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年11月15日 下午6:59:35  
 *  
 * Modification History:  
 * Date            Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017-11-15      Eg          1.0         1.0 Version  
 * 
 */

/**
 * Question:HashMap的实现原理?是不是线程安全?如何是其线程安全?
 */
public class HashMapTest<K,V> extends AbstractMap<K, V> implements Map<K, V>,Cloneable,Serializable{

	private static final long serialVersionUID = -6399210646915638640L;

	//默认初始化容量
	static final int DEFAULT_INITIAL_CAPACITY=1<<4;
	//最大容量
	static final int MAXIMUM_CAPACITY=1<<30;
	//默认负载因子
	static final float DEFAULT_LOAD_FACTOR=0.75f;
	
	
	//********************************************
	static class Node<K,V> implements Map.Entry<K, V>{
		final int hash;
		final K key;
		V value;
		Node<K, V> next;
		
		Node(int hash,K key,V value,Node<K, V> next) {
			this.hash=hash;
			this.key=key;
			this.value=value;
			this.next=next;
		}
		public final K getKey() {
			return key;
		}
		
		public final V getValue() {
			return value;
		}
		
		public final String toString() {
			return key+"="+value;
		}
		
		public final int hashCode() {
			return Objects.hashCode(key) ^ Objects.hashCode(value);
		}
		
		public final V setValue(V newValue) {
			V oldValue=value;
			value=newValue;
			return oldValue;
		}
		
		public final boolean equals(Object o) {
			if(o==this) {
				return true;
			}
			if(o instanceof Map.Entry) {
				Map.Entry<?, ?> e=(Map.Entry<?, ?>)o;
				if(Objects.equals(key, e.getKey())&&
						Objects.equals(value, e.getValue())) {
					return false;
				}
			}
			return false;
		}
	}
	//**********************************************
	
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		
		return null;
	}

}

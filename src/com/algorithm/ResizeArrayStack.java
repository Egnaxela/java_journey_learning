/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年2月26日 下午4:08:18  
 *  
 */  

package com.algorithm;

import java.util.Iterator;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年2月26日 下午4:08:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年2月26日      Eg                      1.0         1.0 Version  
 */

//https://github.com/CyC2018/InterviewNotes/blob/master/notes/%E7%AE%97%E6%B3%95.md#%E7%AC%AC%E4%B8%80%E7%AB%A0-%E5%9F%BA%E7%A1%80
//算法 Interview
@SuppressWarnings("unchecked")
public class ResizeArrayStack<Item> implements Iterable<Item> {

	private Item[] a=(Item[])new Object[1];
	private int N=0;
	
	public void push(Item item) {
		if(N>=a.length) {
			resize(2*a.length);
		}
		a[N++]=item;
	}
	
	public Item pop() {
		Item item=a[--N];
		if(N<=a.length/4) {
			resize(a.length/2);
		}
		return item;
	}
	
	private void resize(int size) {
		
		Item[] temp=(Item[]) new Object[size];
		for(int i=0;i<N;i++) {
			temp[i]=a[i];
		}
		a=temp;
	}
	
	public boolean isEmpty() {
		return N==0;
	}
	
	public int size() {
		return N;
	}
	
	@Override
	public Iterator<Item> iterator() {
		return new ReverseArrayIterator();
	}
	
	private class ReverseArrayIterator implements Iterator<Item> {

		private int i=N;
		
		@Override
		public boolean hasNext() {
			return i>0;
		}

		@Override
		public Item next() {
			return a[--i];
		}
	}
	
}

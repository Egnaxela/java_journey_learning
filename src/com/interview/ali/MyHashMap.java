/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月2日 下午4:37:38  
 *  
 */  

package com.interview.ali;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;



/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月2日 下午4:37:38  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月2日      Pluto       1.0         1.0 Version  
 */

public class MyHashMap<K,V> extends AbstractMap<K,V>  implements Map<K, V>,Cloneable,Serializable{

	private static final long serialVersionUID = -7637200655500674047L;

	transient Node<K, V>[]  table;
	
	static final int MAXIMUM_CAPACITY=1<<30;
	
	static final float DEFAULT_LOAD_FACTOR=0.75f;
	
	static final int DEFAULT_INITIAL_CAPACITY=1<<4;

	private static final int TREEIFY_THRESHOLD = 8;
	
	int threshold;
	
	final float loadFactor;
	transient int size;
	transient int modCount;
	
	public MyHashMap() {
		this.loadFactor=DEFAULT_LOAD_FACTOR;
	}	
	
	@Override
	public Set<Entry<K, V>> entrySet() {
		return null;
	}
	
	
	public static final int hash(Object key) {
		int h;
		//计算key的hash值  在异或计算的hash值右移16位 
		return (key==null)?0 :(h=key.hashCode())^(h>>>16);
	}
	
	public V put(K key,V value) {
		
		return putVal(hash(key),key,value,false,true);
	}
	
	public final V putVal(int hash,K key,V value,boolean onlyIfAbsent,boolean evict) {
		
		Node<K, V>[] tab;
		Node<K, V> p;
		int n,i;
		
		//判断Node 类型的数组是否为null或者为空,若为空则直接调用resize()初始一个默认长度为16 的数组
		if((tab=table)==null||(n=tab.length)==0)
			n=(tab=resize()).length;
		
		//(n-1)&hash 把数组长度减一 & 传过来的hash值 作为数组小标，
		//若该小标处的数组元素为空，则创建一个Node 直接放入
		if ((p = tab[i = (n - 1) & hash]) == null)
            tab[i] = newNode(hash, key, value, null);
        else {
            Node<K,V> e; K k;
            if (p.hash == hash &&
                ((k = p.key) == key || (key != null && key.equals(k))))
                e = p;
            else if (p instanceof TreeNode)
                e = ((TreeNode<K,V>)p).putTreeVal(this, tab, hash, key, value);
            else {
                for (int binCount = 0; ; ++binCount) {
                    if ((e = p.next) == null) {
                    	//new 一个新Node并且把当前的next指向该对象
                        p.next = newNode(hash, key, value, null);
                        //当链表长度大于8时,就将链表转化为红黑树来处理
                        if (binCount >= TREEIFY_THRESHOLD - 1) // -1 for 1st
                            treeifyBin(tab, hash);
                        break;
                    }
                    if (e.hash == hash &&
                        ((k = e.key) == key || (key != null && key.equals(k))))
                        break;
                    p = e;
                }
            }
            if (e != null) { // existing mapping for key
                V oldValue = e.value;
                if (!onlyIfAbsent || oldValue == null)
                    e.value = value;
                afterNodeAccess(e);
                return oldValue;
            }
        }
        ++modCount;
        if (++size > threshold)
            resize();
        afterNodeInsertion(evict);
        return null;
		
	}
	
	
	/**
	* <p>描述:</p>
	* @param evict
	* @author Pluto
	*/
	private void afterNodeInsertion(boolean evict) {
		
	}

	/**
	* <p>描述:</p>
	* @param e
	* @author Pluto
	*/
	private void afterNodeAccess(Node<K, V> e) {
		
	}

	/**
	* <p>描述:</p>
	* @param tab
	* @param hash
	* @author Pluto
	*/
	private void treeifyBin(Node<K, V>[] tab, int hash) {
		
	}

	Node<K, V> newNode(int hash,K key,V value,Node<K, V> next){
		return new Node<>(hash, key, value, next);
	}

	Node<K, V>[] resize(){

        Node<K,V>[] oldTab = table;
        int oldCap = (oldTab == null) ? 0 : oldTab.length;
        int oldThr = threshold;
        int newCap, newThr = 0;
        if (oldCap > 0) {
            if (oldCap >= MAXIMUM_CAPACITY) {
                threshold = Integer.MAX_VALUE;
                return oldTab;
            }
            else if ((newCap = oldCap << 1) < MAXIMUM_CAPACITY &&
                     oldCap >= DEFAULT_INITIAL_CAPACITY)
                newThr = oldThr << 1; // double threshold
        }
        else if (oldThr > 0) // initial capacity was placed in threshold
            newCap = oldThr;
        else {               // zero initial threshold signifies using defaults
            newCap = DEFAULT_INITIAL_CAPACITY;
            newThr = (int)(DEFAULT_LOAD_FACTOR * DEFAULT_INITIAL_CAPACITY);
        }
        if (newThr == 0) {
            float ft = (float)newCap * loadFactor;
            newThr = (newCap < MAXIMUM_CAPACITY && ft < (float)MAXIMUM_CAPACITY ?
                      (int)ft : Integer.MAX_VALUE);
        }
        threshold = newThr;
        @SuppressWarnings({"rawtypes","unchecked"})
            Node<K,V>[] newTab = (Node<K,V>[])new Node[newCap];
        table = newTab;
        if (oldTab != null) {
            for (int j = 0; j < oldCap; ++j) {
                Node<K,V> e;
                if ((e = oldTab[j]) != null) {
                    oldTab[j] = null;
                    if (e.next == null)
                        newTab[e.hash & (newCap - 1)] = e;
                    else if (e instanceof TreeNode)
                        ((TreeNode<K,V>)e).split(this, newTab, j, oldCap);
                    else { // preserve order
                        Node<K,V> loHead = null, loTail = null;
                        Node<K,V> hiHead = null, hiTail = null;
                        Node<K,V> next;
                        do {
                            next = e.next;
                            if ((e.hash & oldCap) == 0) {
                                if (loTail == null)
                                    loHead = e;
                                else
                                    loTail.next = e;
                                loTail = e;
                            }
                            else {
                                if (hiTail == null)
                                    hiHead = e;
                                else
                                    hiTail.next = e;
                                hiTail = e;
                            }
                        } while ((e = next) != null);
                        if (loTail != null) {
                            loTail.next = null;
                            newTab[j] = loHead;
                        }
                        if (hiTail != null) {
                            hiTail.next = null;
                            newTab[j + oldCap] = hiHead;
                        }
                    }
                }
            }
        }
        return newTab;
    
	}
	
	static class Node<K,V> implements Map.Entry<K, V>{

		final int hash;
		final K key;
		V value;
		Node<K, V> next;
		
		Node(int hash,K key,V value,Node<K,V> next) {
			this.hash=hash;
			this.key=key;
			this.value=value;
			this.next=next;
		}
		
		@Override
		public K getKey() {
			return key;
		}

		@Override
		public V getValue() {
			return value;
		}

		
		@Override
		public V setValue(V newvalue) {
			V oldValue=value;
			value=newvalue;
			return oldValue;
		}
		
		public String toString() {
			return key+"="+value;
		}
		
		public int hashCode() {
			//也是直接调用Object的hashCode方法  return o!=null ? o.hashCode() : 0 
			return Objects.hashCode(key)^Objects.hashCode(value);
		}
	}


	static  class TreeNode<K,V> extends LinkedHashMapEntry<K, V>{
		TreeNode<K, V> parent;
		TreeNode<K, V> left;
		TreeNode<K, V> right;
		TreeNode<K, V> prev;
		boolean red;

		public TreeNode(int hash,K key,V val,Node<K, V> next) {
			super(hash,key,val,next);
		}

		/**
		* <p>描述:</p>
		* @param myHashMap
		* @param tab
		* @param hash
		* @param key
		* @param value
		* @return
		* @author Pluto
		*/
		public Node<K, V> putTreeVal(MyHashMap<K, V> myHashMap, Node<K, V>[] tab, int hash, K key, V value) {
			return null;
		}

		/**
		* <p>描述:</p>
		* @param myHashMap
		* @param newTab
		* @param j
		* @param oldCap
		* @author Pluto
		*/
		public void split(MyHashMap<K, V> myHashMap, Node<K, V>[] newTab, int j, int oldCap) {
			
		}
	}
	
	static class LinkedHashMapEntry<K,V> extends MyHashMap.Node<K, V>{
		LinkedHashMapEntry<K,V> before, after;
		LinkedHashMapEntry(int hash, K key, V value, Node<K,V> next) {
	            super(hash, key, value, next);
	    }
	}	

}

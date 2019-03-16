/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月15日 下午4:54:56  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月15日 下午4:54:56  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月15日      Pluto       1.0         1.0 Version  
 */


/**
 * 	head 为头结点，不存放任何数据，只是指向第一个存放数据节点的作用
 * 	每一个节点都有一个next引用，指向下一个节点
 *  最后一个节点的next 指向NULL
 */
public class ListNode {
	
	
	public int val;
	
	public ListNode next;
	
	public ListNode(int next) {
		this.val=next;
	}
	
	
	public static ListNode createNode(int[] arr) {
		ListNode root=new ListNode(arr[0]);
		ListNode node=root;
		for(int i=1;i<arr.length;i++) {
			ListNode temp=new ListNode(arr[i]);
			node.next=temp;
			node=temp;
		}
		return root;
	}
	public static void printNode(ListNode l) {
		while(l!=null) {
			System.out.print(l.val+" ");
			l=l.next;
		}
	}
	
	public static ListNode readyNode() {
		ListNode linkNode1 = new ListNode(1);
	    ListNode linkNode2 = new ListNode(2);
	    ListNode linkNode3 = new ListNode(3);
	    ListNode linkNode4 = new ListNode(4);
	    ListNode linkNode5 = new ListNode(5);
	    linkNode1.next = linkNode2;
	    linkNode2.next = linkNode3;
	    linkNode3.next = linkNode4;
	    linkNode4.next = linkNode5;
	    return linkNode1;
	}
}

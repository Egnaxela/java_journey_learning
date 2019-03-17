/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月15日 下午4:10:41  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月15日 下午4:10:41  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月15日      Pluto       1.0         1.0 Version  
 */


/**
 * 
 * 
 * Reverse a singly linked list.
 * Example:
 * Input: 1->2->3->4->5->NULL
 * Output: 5->4->3->2->1->NULL
 * Follow up:
 * 
 * A linked list can be reversed either iteratively or recursively. Could you implement both?
 * 
 * https://leetcode.com/problems/reverse-linked-list/
 * 
 * 
 * solution:
 * 把每一个节点 的next指向前一个节点就可以实现反转了
 * 
 * 
 */
public class ReverseLinkedList206 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ListNode L = reverseLinkedList(ListNode.createNode(arr));
		ListNode.printNode(L);
		System.out.println();
		ListNode L1 = reverseLinkedList2(ListNode.readyNode());
		ListNode.printNode(L1);
	}

	/**
	 * 
	 * 迭代： 建立一个新的链表头 每次遍历链表的时候都把节点放在心链表的头部
	 * 
	 */
	public static ListNode reverseLinkedList(ListNode head) {
		ListNode newListNode = null;
		while (head != null) {
			ListNode temp = head.next;
			head.next = newListNode;
			newListNode = head;
			head = temp;
		}
		return newListNode;
	}

	/**
	 * 
	 * 
	 */
	public static ListNode reverseLinkedList2(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode newHead = reverseLinkedList2(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
}

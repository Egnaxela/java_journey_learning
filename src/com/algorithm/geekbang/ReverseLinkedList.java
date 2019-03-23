/**  
 * FileName:     
 * @Description: 
 * Company       
 * @version      1.0
 * @author:      Pluto
 * @version:     1.0
 * Createdate:   2019年3月19日 下午7:38:23  
 *  
 */  

package com.algorithm.geekbang;

import com.leetCode.ListNode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2019 
 * Company:       
 * @author:     Pluto 
 * @version:    1.0  
 * Create at:   2019年3月19日 下午7:38:23  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2019年3月19日      Pluto       1.0         1.0 Version  
 */

public class ReverseLinkedList {
	
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		ListNode L = reverseLinkedList(ListNode.createNode(arr));
		ListNode.printNode(L);
	}
	
	/**
	 * 
	* <p>描述:</p>
	* @param head
	* @return
	* @author Pluto
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
}

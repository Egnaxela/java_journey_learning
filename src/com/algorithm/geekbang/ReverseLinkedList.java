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
	* <p>描述:
	* 反转一个链表：
	* 将节点的next指向前一个节点即可。
	* 
	* 在遍历列表时，需要将当前节点的next指向前一个节点，但由于当前节点没有前一个节点的引用，因此必须事先存储它的前一个节点
	* 注意把当前节点的next指向前一个节点时，此时当前节点原先的next指向就无法被正常遍历，为了避免这种“断链”的情况
	* 需要在修改指向之前，保存当前节点的next指向。	
	* </p>
	* @param head
	* @return
	* @author Pluto
	 */
	public static ListNode reverseLinkedList(ListNode head) {
		//创建 ListNode 用来保存当前节点的前一个节点
		ListNode newListNode = null;
		while (head != null) {
			//避免断链的情况，需要先保存当前节点的next指向
			ListNode temp = head.next;
			//改变当前节点的指向为前一个节点
			head.next = newListNode;
			newListNode = head;
			
			//改变指向完成后再讲当前节点原先的next 赋给 当前节点继续下一次遍历
			head = temp;
		}
		return newListNode;
	}
}

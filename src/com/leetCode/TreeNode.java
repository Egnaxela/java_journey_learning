/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月6日 上午10:41:39  
 *  
 */  

package com.leetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月6日 上午10:41:39  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月6日      Eg                      1.0         1.0 Version  
 */

public class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x) {
		this.val=x;
	}
	
	
	/**
	 * 
	* <p>描述:</p>
	* @param a
	* @param index 0
	* @return
	* @author Eg
	 */
	public static TreeNode createTree(Integer[] a,int index) {
		TreeNode tree=null;
		if(index<a.length) {
			Integer value=a[index];
			if(value!=null) {
				tree=new TreeNode(value);
				tree.left=createTree(a, 2*index+1);
				tree.right=createTree(a, 2*index+2);
			}
			return tree;
		}
		return tree;
	}
	
	
	/**
	 * 
	* <p>描述:按层打印</p>
	* @param root
	* @return
	* @author Eg
	 */
	public static List<Integer> printTree(TreeNode root) {
		ArrayList<Integer> list=new ArrayList<Integer>();  
        Queue <TreeNode> queue=new ArrayBlockingQueue<>(100);  
        TreeNode last=root;     //当前行的最后节点  
        TreeNode nLast=root;    //下一行的最右节点  
        queue.add(root);  
        while (!queue.isEmpty()) {  
            TreeNode out=queue.poll();  
            System.out.print(out.val+" ");   
            list.add(out.val);  
            if (out.left!=null) {  
                queue.add(out.left);  
                nLast=out.left;  
            }  
            if (out.right!=null) {  
                queue.add(out.right);  
                nLast=out.right;  
            }  
            if (out==last) {  
                System.out.println("");  
                last=nLast;  
            }  
              
        }  
        return list;  
	}
	
	/**
	 * 
	* <p>描述:从上到下打印二叉树</p>
	* @param root
	* @return
	* @author Eg
	 */
	public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		if (root == null) {
			return null;
		}
		ArrayList<Integer> result = new ArrayList<Integer>();
		LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

		queue.offer(root);
		result.add(root.val);
		while (!queue.isEmpty()) {
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				TreeNode head = queue.poll();

				if (head.left != null) {
					queue.offer(head.left);
					result.add(head.left.val);
				}
				if (head.right != null) {
					queue.offer(head.right);
					result.add(head.right.val);
				}
			}

		}
		return result;
	}  
}

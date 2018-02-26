/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年2月26日 上午11:22:18  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年2月26日 上午11:22:18  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年2月26日      Eg                      1.0         1.0 Version  
 */

/**
Given a binary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

For example:
Given binary tree [3,9,20,null,null,15,7],

    3
   / \
  9  20
    /  \
   15   7

return its depth = 3.

https://leetcode.com/submissions/detail/142432057/

*/

public class MaximumDepthofBinaryTree104 {
	public static void main(String[] args) {
		
		Integer[] a={3,9,20,null,null,15,7};
		System.out.println(maxTreeNode(createTree(a, 0)));
	}
	
	public static TreeNodeMax createTree(Integer[] a,int index) {
		TreeNodeMax tree=null;
		if(index<a.length) {
			Integer value=a[index];
			if(value!=null) {
				tree=new TreeNodeMax(value);
				tree.left=createTree(a, 2*index+1);
				tree.right=createTree(a, 2*index+2);
			}
			return tree;
		}
		return tree;
	}
	
	public static int maxTreeNode(TreeNodeMax treeNode) {
		if(treeNode==null) {
			return 0;
		}
		int left=maxTreeNode(treeNode.left);
		int right=maxTreeNode(treeNode.right);
		return  Math.max(left, right)+1;
	}

}

class TreeNodeMax{
	int value;
	TreeNodeMax left;
	TreeNodeMax right;
	TreeNodeMax(int x) {
		this.value=x;
	}
}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2018年3月6日 上午10:38:49  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2018年3月6日 上午10:38:49  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2018年3月6日      Eg                      1.0         1.0 Version  
 */

/*
 * 
Invert a binary tree.

     4
   /   \
  2     7
 / \   / \
1   3 6   9

to

     4
   /   \
  7     2
 / \   / \
9   6 3   1
 */
public class InvertBinaryTree226 {

	public static void main(String[] args) {
		Integer[] a={4,2,7,1,3,6,9};
		TreeNode.printTree(TreeNode.createTree(a, 0));
		TreeNode.printTree(invertTree(TreeNode.createTree(a, 0)));
	}
	
	public static TreeNode invertTree(TreeNode root) {
		if(root==null) {
			return null;
		}
		TreeNode tempNode=root.left;
		root.left=root.right;
		root.right=tempNode;
		invertTree(root.left);
		invertTree(root.right);
		return root;
	}
	
	
	

}

/**  
 * FileName:     
 * @Description: 
 * Company       rongji
 * @version      1.0
 * @author:      Eg 
 * @version:     1.0
 * Createdate:   2017年10月11日 下午12:03:54  
 *  
 */  

package com.leetCode;

/**  
 * Description:   
 * Copyright:   Copyright (c)2017 
 * Company:     rongji  
 * @author:     Eg  
 * @version:    1.0  
 * Create at:   2017年10月11日 下午12:03:54  
 *  
 * Modification History:  
 * Date         Author      Version     Description  
 * ------------------------------------------------------------------  
 * 2017年10月11日      Eg                      1.0         1.0 Version  
 */


/**
 * 
 * Given two binary trees and imagine that when you put one of them to cover the other, some nodes of the two trees are overlapped while the others are not.
 * You need to merge them into a new binary tree. 
 * The merge rule is that if two nodes overlap, 
 * then sum node values up as the new value of the merged node. 
 * Otherwise, the NOT null node will be used as the node of new tree.
 * 
 * Example 1:
 * Input: 
 * Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
      Output: 
      Merged tree:
	     3
	    / \
	   4   5
	  / \   \ 
 * 
 * 
 */
public class MergeTree617 {
	public static void main(String[] args) {
		TreeNode t1=new TreeNode(3);
		TreeNode t2=new TreeNode(3);
		System.out.println("--"+mergerTree(t1, t2));
		
	}
	
	public static TreeNode mergerTree(TreeNode t1, TreeNode t2) {
		if (t1 == null && t2 == null) {
			return null;
		}

		if (t1 != null && t2 == null) {
			return t1;
		}

		if (t1 == null && t2 != null) {
			return t2;
		}

		t1.val += t2.val;
		t1.left = mergerTree(t1.left, t2.left);
		t1.right = mergerTree(t1.right, t2.right);
		return t1;
	}
	
}

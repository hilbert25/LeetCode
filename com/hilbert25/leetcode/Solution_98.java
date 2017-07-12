package com.hilbert25.leetcode;

import java.util.Stack;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月23日 下午1:44:35 LeetCode com.hilbert25.leetcode
 *          Solution_98
 */
public class Solution_98 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isValidBST(TreeNode root) {
		if (root == null || (root.left == null && root.right == null))
			return true;
		if (root.left != null && root.left.val >= root.val)
			return false;
		if (root.right != null && root.right.val <= root.val)
			return false;
		return isValidBST(root.left) && isValidBST(root.right);
	}
}

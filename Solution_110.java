package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月11日 上午1:20:06 LeetCode com.hilbert25.leetcode
 *          Solution_110
 */
public class Solution_110 {

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

	public boolean isBalanced(TreeNode root) {
		if (root == null)
			return true;
		return isBalanced(root.left) && isBalanced(root.right)
				&& (Math.abs(getDepth(root.left) - getDepth(root.right)) <= 1);
	}

	public int getDepth(TreeNode node) {
		if (node == null)
			return 0;
		int leftDepth = getDepth(node.left);
		int rightDepth = getDepth(node.right);
		return Math.max(leftDepth, rightDepth) + 1;
	}
}

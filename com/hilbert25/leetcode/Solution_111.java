package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月11日 上午1:12:21 LeetCode com.hilbert25.leetcode
 *          Solution_111
 */
public class Solution_111 {

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

	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		if (root.left == null && root.right == null)
			return 1;
		else if (root.left != null && root.right == null)
			return minDepth(root.left) + 1;
		else if (root.left == null && root.right != null)
			return minDepth(root.right) + 1;
		else
			return Math.min(minDepth(root.left), minDepth(root.right)) + 1;
	}
}

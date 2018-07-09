package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月13日 下午2:05:19 LeetCode com.hilbert25.leetcode
 *          Solution_124
 */
public class Solution_124 {
	public static void main(String[] args) {

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static int sum = 0;

	public int maxPathSum(TreeNode root) {
		sum = root.val;
		dfs(root);
		return sum;
	}

	/**
	 * @param node
	 * @return
	 */
	public int dfs(TreeNode node) {
		if (node == null)
			return 0;
		int curValue = node.val;
		int left = dfs(node.left);
		int right = dfs(node.right);
		if (left > 0) {
			curValue += left;
		}
		if (right > 0) {
			curValue += right;
		}
		sum = Math.max(curValue, sum);
		return Math.max(node.val, Math.max(node.val + left, node.val + right));
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月3日 下午10:07:52 LeetCode com.hilbert25.leetcode
 *          Solution_112
 */
public class Solution_112 {

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

	public boolean hasPathSum(TreeNode root, int sum) {
		return search(root, sum);
	}

	public boolean search(TreeNode node, int sum) {
		if (node == null) {
			return false;
		} else {
			if (node.val == sum && (node.left == null && node.right == null)) {
				return true;
			} else {
				return search(node.left, sum - node.val) || search(node.right, sum - node.val);
			}
		}
	}
}

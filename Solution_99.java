package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月26日 上午8:45:10 LeetCode com.hilbert25.leetcode
 *          Solution_99
 */
public class Solution_99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node0 = new TreeNode(0);
		TreeNode node1 = new TreeNode(1);
		node0.left = node1;
		recoverTree(node0);
 	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static void recoverTree(TreeNode root) {
		search(root);
	}

	public static void search(TreeNode node) {
		if (node.left != null && node.left.val > node.val) {
			TreeNode tranNode = node;
			node = node.left;
			node.left = tranNode;
			return;
		}
		if (node.right != null && node.right.val > node.val) {
			TreeNode tranNode = node;
			node = node.right;
			node.right = tranNode;
			return;
		}
		if ((node.left != null && node.left.val < node.val) && (node.right != null && node.right.val < node.val)) {
			search(node.left);
			search(node.right);
			return;
		}
	}
}

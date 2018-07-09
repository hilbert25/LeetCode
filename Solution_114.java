package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月12日 上午1:34:37 LeetCode com.hilbert25.leetcode
 *          Solution_114
 */
public class Solution_114 {

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

	/**
	 * @param root
	 */
	public static TreeNode prev = null;

	public void flatten(TreeNode root) {
		// getTail(root);
		if (root == null)
			return;
		flatten(root.right);//right先成为prev，那么处理left的时候left的右就是prev
		flatten(root.left);//后处理的left，那么left就是prev
		root.right = prev;
		root.left = null;
		prev = root;
	}

	/**
	 * @param node
	 * @return
	 */
	public TreeNode getTail(TreeNode node) {
		if (node == null || (node.left == null && node.right == null))
			return node;
		TreeNode leftNode = getTail(node.left);// 左子树最右，如果没有就返回最左
		TreeNode rightNode = getTail(node.right);// 左子树最右，如果没有就返回最左
		if (leftNode != null && rightNode != null) {
			leftNode.right = node.right;
			node.right = node.left;
			node.left = null;
			return rightNode;
		} else if (leftNode != null && rightNode == null) {
			node.right = node.left;
			node.left = null;
			return leftNode;
		}
		return rightNode;
	}

}

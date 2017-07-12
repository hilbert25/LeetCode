package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月20日 下午11:39:36 LeetCode com.hilbert25.leetcode
 *          Solution_94
 */
public class Solution_94 {

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

	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			while (root != null && root.left != null) {
				stack.push(root.left);
				root = root.left;
			}
			TreeNode node = stack.pop();
			res.add(node.val);
			if (node.right != null) {
				root = node.right;
				stack.push(root);
			}
		}
		return res;
	}
}

package com.hilbert25.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月18日 上午9:55:48 LeetCode com.hilbert25.leetcode
 *          Solution_129
 */
public class Solution_129 {

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
	 * @return
	 */
	public int sumNumbers(TreeNode root) {
		if (root == null)
			return 0;
		int sum = 0;
		Queue<TreeNode> nodeQueue = new LinkedList<>();
		nodeQueue.add(root);
		while (!nodeQueue.isEmpty()) {
			int count = nodeQueue.size();
			for (int i = 0; i < count; i++) {
				TreeNode node = nodeQueue.poll();
				if (node.left == null && node.right == null) {
					sum += node.val;
				} else {
					node.val *= 10;
					if (node.left != null) {
						node.left.val += node.val;
						nodeQueue.add(node.left);
					}
					if (node.right != null) {
						node.right.val += node.val;
						nodeQueue.add(node.right);
					}
				}
			}
		}
		return sum;
	}
}

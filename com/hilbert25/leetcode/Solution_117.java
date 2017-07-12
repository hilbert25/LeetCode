package com.hilbert25.leetcode;

import java.util.LinkedList;
import java.util.Queue;

import com.hilbert25.leetcode.Solution_116.TreeLinkNode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月13日 下午1:35:37 LeetCode com.hilbert25.leetcode
 *          Solution_117
 */
public class Solution_117 {
	public static void main(String[] args) {

	}
	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}
	/**
	 * @param root
	 */
	public void connect(TreeLinkNode root) {
		Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
		if (root == null)
			return;
		queue.offer(root);
		while (!queue.isEmpty()) {
			int count = queue.size();
			TreeLinkNode pre = null;
			for (int i = 0; i < count; i++) {
				TreeLinkNode node = queue.poll();
				if (node.left != null) {
					queue.offer(node.left);
				}
				if (node.right != null) {
					queue.offer(node.right);
				}
				if (pre != null)
					pre.next = node;
				pre = node;
			}

		}
	}
}

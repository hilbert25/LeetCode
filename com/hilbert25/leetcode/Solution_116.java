package com.hilbert25.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月12日 上午11:00:22 LeetCode com.hilbert25.leetcode
 *          Solution_116
 */
public class Solution_116 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeLinkNode {
		int val;
		TreeLinkNode left, right, next;

		TreeLinkNode(int x) {
			val = x;
		}
	}

	// /**
	// * @param root
	// */
	// public void connect(TreeLinkNode root) {
	// Queue<TreeLinkNode> queue = new LinkedList<TreeLinkNode>();
	// if (root == null)
	// return;
	// queue.offer(root);
	// while (!queue.isEmpty()) {
	// int count = queue.size();
	// TreeLinkNode pre = null;
	// for (int i = 0; i < count; i++) {
	// TreeLinkNode node = queue.poll();
	// if (node.left != null) {
	// queue.offer(node.left);
	// }
	// if (node.right != null) {
	// queue.offer(node.right);
	// }
	// if (pre != null)
	// pre.next = node;
	// pre = node;
	// }
	//
	// }
	// }
	public void connect(TreeLinkNode root) {
		TreeLinkNode beginNode = root;
		while (beginNode != null) {
			TreeLinkNode curNode = beginNode;
			while (curNode != null) {
				if (curNode.left != null) {
					curNode.left.next = curNode.right;
				}
				if (curNode.right != null && curNode.next != null) {
					curNode.right.next = curNode.next.left;
				}
				curNode = curNode.next;
			}
			beginNode = beginNode.left;
		}
	}
}

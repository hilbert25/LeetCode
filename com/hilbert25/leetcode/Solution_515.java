package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月23日 下午6:36:39 LeetCode com.hilbert25.leetcode
 *          Solution_515
 */
public class Solution_515 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode node1 = new TreeNode(1);
		TreeNode node2 = new TreeNode(2);
		TreeNode node3 = new TreeNode(3);
		node1.left = node2;
		node1.right = node3;
		List<Integer> list = largestValues(node1);
		for (int i : list)
			System.out.println(i);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static List<Integer> largestValues(TreeNode root) {
		List<Integer> res = new ArrayList<Integer>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		int max = Integer.MIN_VALUE;
		while (!queue.isEmpty()) {
			max = Integer.MIN_VALUE;
			int l = queue.size();
			for (int i = 0; i < l; i++) {
				TreeNode node = queue.poll();
				max = Math.max(node.val, max);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			res.add(max);
		}
		return res;
	}
}

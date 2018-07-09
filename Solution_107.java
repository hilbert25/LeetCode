package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月9日 下午3:36:02 LeetCode com.hilbert25.leetcode
 *          Solution_107
 */
public class Solution_107 {

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

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if (root == null)
			return res;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			count = queue.size();
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < count; i++) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if (node.left != null)
					queue.add(node.left);
				if (node.right != null)
					queue.add(node.right);
			}
			res.add(list);
		}
		Collections.reverse(res);
		return res;
	}
}

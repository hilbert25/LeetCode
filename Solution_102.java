package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月3日 下午6:22:51 LeetCode com.hilbert25.leetcode
 *          Solution_102
 */
public class Solution_102 {

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

	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(root==null)
			return res;
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		int level = 1;
		int nodeCount = 1;
		while (nodeCount != 0) {
			nodeCount = 0;
			List<Integer> list = new ArrayList<Integer>();
			for (int i = 1; i <= Math.pow(2, level - 1); i++) {
				TreeNode tempNode = queue.poll();
				if (tempNode != null) {
					list.add(tempNode.val);
					if (tempNode.left != null) {
						queue.add(tempNode.left);
						nodeCount++;
					} else {
						queue.add(null);
					}
					if (tempNode.right != null) {
						queue.add(tempNode.right);
						nodeCount++;
					} else {
						queue.add(null);
					}
				} else {
					queue.add(null);
					queue.add(null);
				}
			}
			level++;
			res.add(list);
		}
		return res;
	}
}

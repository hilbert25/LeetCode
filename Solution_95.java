package com.hilbert25.leetcode;

import java.awt.TextArea;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月25日 下午11:24:42 LeetCode com.hilbert25.leetcode
 *          Solution_95
 */
public class Solution_95 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateTrees(3);
	}

	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public static List<TreeNode> generateTrees(int n) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if (n < 1)
			return res;
		else {
			return search(1, n);
		}
	}

	public static List<TreeNode> search(int begin, int end) {
		List<TreeNode> res = new ArrayList<TreeNode>();
		if (begin > end)
			return res;
		else if (begin == end) {
			res.add(new TreeNode(begin));
			return res;
		}
		for (int i = begin; i <= end; i++) {
			List<TreeNode> left = search(begin, i - 1);
			List<TreeNode> right = search(i + 1, end);
			if (right.size() == 0) {
				for (TreeNode leftNode : left) {
					TreeNode node = new TreeNode(i);
					node.left = leftNode;
					res.add(node);
				}
			} else if (left.size() == 0) {
				for (TreeNode rightNode : right) {
					TreeNode node = new TreeNode(i);
					node.right = rightNode;
					res.add(node);
				}
			} else {
				for (TreeNode leftNode : left) {
					for (TreeNode rightNode : right) {
						TreeNode node = new TreeNode(i);
						node.left = leftNode;
						node.right = rightNode;
						res.add(node);
					}
				}
			}
		}
		return res;
	}
}

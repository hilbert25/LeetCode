package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月3日 下午4:48:42 LeetCode com.hilbert25.leetcode
 *          Solution_101
 */
public class Solution_101 {

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

	public boolean isSymmetric(TreeNode root) {
		if (root == null)
			return true;
		List<String> leftList = new ArrayList<>();
		leftVisit(root.left, leftList);
		List<String> rightList = new ArrayList<>();
		rightVisit(root.right, rightList);
		if (leftList.size() != rightList.size())
			return false;
		else {
			leftList.forEach(a -> System.out.print(a));
			System.out.println();
			rightList.forEach(a -> System.out.print(a));
			for (int i = 0; i < leftList.size(); i++) {
				if (!leftList.get(i).equals(rightList.get(i)))
					return false;
			}
		}
		return true;
	}

	public void leftVisit(TreeNode node, List<String> list) {
		if (node == null) {
			list.add("a");
			return;
		}
		list.add(String.valueOf(node.val));
		leftVisit(node.left, list);
		leftVisit(node.right, list);
	}

	public void rightVisit(TreeNode node, List<String> list) {
		if (node == null) {
			list.add("a");
			return;
		}
		list.add(String.valueOf(node.val));
		rightVisit(node.right, list);
		rightVisit(node.left, list);
	}
}

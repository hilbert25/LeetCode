package com.hilbert25.leetcode;

import java.util.Arrays;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月9日 下午4:08:17 LeetCode com.hilbert25.leetcode
 *          Solution_109
 */
public class Solution_106 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		if (inorder.length == 0)
			return null;
		TreeNode root = new TreeNode(postorder[postorder.length - 1]);
		int i = 0;
		while (i < inorder.length && inorder[i] != postorder[postorder.length - 1])
			i++;
		root.left = buildTree(Arrays.copyOfRange(inorder, 0, i), Arrays.copyOfRange(postorder, 0, i));
		root.right = buildTree(Arrays.copyOfRange(inorder, i + 1, inorder.length),
				Arrays.copyOfRange(postorder, i, postorder.length - 1));
		return root;
	}

}

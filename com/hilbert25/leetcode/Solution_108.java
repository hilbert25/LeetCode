package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月9日 下午3:57:45 LeetCode com.hilbert25.leetcode
 *          Solution_108
 */
public class Solution_108 {

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

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums.length == 0)
			return null;
		return createNode(0, nums.length - 1, nums);
	}

	public TreeNode createNode(int begin, int end, int[] nums) {
		if (begin > end)
			return null;
		int middle = (begin + end) / 2;
		TreeNode node = new TreeNode(nums[middle]);
		node.left = createNode(begin, middle - 1, nums);
		node.right = createNode(middle + 1, end, nums);
		return node;
	}
}

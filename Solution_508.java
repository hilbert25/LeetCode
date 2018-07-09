package com.hilbert25.leetcode;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月12日 下午12:47:03 LeetCode com.hilbert25.leetcode
 *          Solution_508
 */
public class Solution_508 {

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

	public int[] findFrequentTreeSum(TreeNode root) {
		Map<Integer, Integer> sum = new HashMap<Integer, Integer>();
		calSumOfSubTree(sum, root);
		int maxOccurs = sum.values().stream().max(Comparator.naturalOrder()).orElse(-1);
		return sum.entrySet().stream().filter(e -> e.getValue() == maxOccurs).mapToInt(e -> e.getKey()).toArray();
	}

	public int calSumOfSubTree(Map<Integer, Integer> sum, TreeNode node) {
		if (node == null)
			return 0;
		else {
			int value = calSumOfSubTree(sum, node.left) + calSumOfSubTree(sum, node.right) + node.val;
			sum.compute(value, (k, v) -> v == null ? 1 : v + 1);
			return value;
		}
	}
}

package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月12日 上午12:46:07 LeetCode com.hilbert25.leetcode
 *          Solution_113
 */
public class Solution_113 {

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

	/**
	 * @param root
	 * @param sum
	 * @return
	 */
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> currentResult = new ArrayList<Integer>();
		dfs(root, sum, result, currentResult);
		return result;
	}

	/**
	 * 回溯法
	 * 
	 * @param node
	 * @param sum
	 * @param result
	 * @param currentResult
	 */
	public void dfs(TreeNode node, int sum, List<List<Integer>> result, List<Integer> currentResult) {
		if (node == null) {
			return;
		} else {
			sum -= node.val;
			currentResult.add(node.val);
			if (node.left == null && node.right == null && sum == 0) {
				result.add(new ArrayList<Integer>(currentResult));
			}
			dfs(node.left, sum, result, currentResult);
			dfs(node.right, sum, result, currentResult);
			currentResult.remove(currentResult.size() - 1);
			sum += node.val;
			return;
		}
	}

}

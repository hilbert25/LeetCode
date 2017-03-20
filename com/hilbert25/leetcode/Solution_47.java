package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月20日 下午11:25:28 LeetCode com.hilbert25.leetcode
 *          Solution47
 */
public class Solution_47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> permuteUnique(int[] nums) {
		List<Integer> list = new ArrayList<Integer>(nums.length);
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		boolean[] visited = new boolean[nums.length];
		Arrays.sort(nums);
		search(nums, visited, 0, list, result);
		return result;
	}

	public static void search(int[] nums, boolean[] visited, int cur, List<Integer> list, List<List<Integer>> result) {
		if (cur == nums.length) {
			result.add(new ArrayList<Integer>(list));
			return;
		}
		int i = 0;
		int last = Integer.MIN_VALUE;
		while (i < nums.length) {
			if (!visited[i] && nums[i] != last) {
				last = nums[i];
				list.add(nums[i]);
				visited[i] = true;
				search(nums, visited, cur + 1, list, result);
				visited[i] = false;
				list.remove(list.size() - 1);
			}
			i++;
		}
		return;
	}
}

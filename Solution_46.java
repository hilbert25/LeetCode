package com.hilbert25.leetcode;

import java.time.Period;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月16日 下午8:31:09 LeetCode com.hilbert25.leetcode
 *          Solution_46
 */
public class Solution_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 3 };
		permute(nums);
	}

	public static List<List<Integer>> permute(int[] nums) {
		List<Integer> list = new ArrayList<Integer>(nums.length);
		List<List<Integer>> result = new ArrayList<>((int) Math.pow(2, nums.length) - 1);
		boolean[] visited = new boolean[nums.length];
		if (nums.length == 0) {
			result.add(new ArrayList<Integer>());
			return result;
		}
		search(nums, visited, nums.length, list, result);
		return result;
	}

	public static void search(int[] nums, boolean[] visited, int cur, List<Integer> add, List<List<Integer>> list) {
		if (cur == 0) {
			list.add(new ArrayList<>(add));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!visited[i]) {
				add.add(nums[i]);
				visited[i] = true;
				search(nums, visited, cur - 1, add, list);
				visited[i] = false;
				add.remove(add.size() - 1);
			}
		}
	}

}

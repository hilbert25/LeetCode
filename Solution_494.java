package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月21日 下午9:47:01 LeetCode com.hilbert25.leetcode
 *          Solution_494
 */
public class Solution_494 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 44, 20, 38, 6, 2, 47, 18, 50, 41, 38, 32, 24, 38, 38, 30, 5, 26, 15, 37, 35 };
		int S = 44;
		System.out.println(findTargetSumWays(nums, S));
	}

//	public static int findTargetSumWays(int[] nums, int S) {
//		@SuppressWarnings("unchecked")
//		List<Integer>[] count = new List[nums.length];
//		for (int i = 0; i < nums.length; i++)
//			count[i] = new ArrayList<Integer>((int) Math.pow(2, nums.length));
//		count[0].add(nums[0]);
//		count[0].add(-nums[0]);
//		for (int i = 1; i < nums.length; i++) {
//			for (int j : count[i - 1]) {
//				count[i].add(j + nums[i]);
//				count[i].add(j - nums[i]);
//			}
//		}
//		int re = 0;
//		for (int i : count[nums.length - 1])
//			if (i == S)
//				re++;
//		return re;
//	}
	public static int findTargetSumWays(int[] nums, int S) {
		return f(nums, nums.length - 1, S);
	}

	public static int f(int[] nums, int m, int n) {
		if (m == 0) {
			if (n == 0 && nums[0] == 0)
				return 2;
			if (n == nums[0] || n == -nums[0])
				return 1;
			else
				return 0;
		}
		return f(nums, m - 1, n - nums[m]) + f(nums, m - 1, n + nums[m]);
	}
}

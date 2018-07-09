package com.hilbert25.leetcode;

import java.util.Arrays;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 上午1:04:05 LeetCode com.hilbert25.leetcode
 *          Solution_300
 */
public class Solution_300 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 10, 9, 2, 5, 3, 7, 101, 18 };
		int[] a = { 1, 2, 3, 4, 6 };
		System.out.println("result:" + lengthOfLIS(nums));
	}

	/**
	 * @param nums
	 * @return
	 */
	// public static int lengthOfLIS(int[] nums) {
	// if (nums.length == 0)
	// return 0;
	// int[] currentLength = new int[nums.length];
	// Arrays.fill(currentLength, 1);
	// int max = 1;
	// for (int i = 1; i < nums.length; i++) {
	// for (int j = i - 1; j >= 0; j--) {
	// if (nums[j] < nums[i] && 1 + currentLength[j] > currentLength[i]) {
	// currentLength[i] = 1 + currentLength[j];
	// max = max < currentLength[i] ? currentLength[i] : max;
	// }
	// }
	// }
	// return max;
	// }
	public static int lengthOfLIS(int[] nums) {
		int[] dp = new int[nums.length];
		int len = 0;

		for (int x : nums) {
			int i = Arrays.binarySearch(dp, 0, len, x);// 找到最接近x的？
			if (i < 0) {
				i = -(i + 1);// 这里是x应该放的地方
			}
			if (dp[i] > x||dp[i]==0)
				dp[i] = x;
			if (i == len)
				len++;
		}
		return len;
	}
}

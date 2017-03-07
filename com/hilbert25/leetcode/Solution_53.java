package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月7日 下午7:55:52 LeetCode com.hilbert25.leetcode Solution_53
 */
public class Solution_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int currentMax = nums[0];
		int l = nums.length;
		for (int i = 1; i < l; i++) {
			currentMax = Math.max(nums[i], currentMax + nums[i]);
			max = Math.max(max, currentMax);
		}
		return max;
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月7日 下午7:51:55 LeetCode com.hilbert25.leetcode
 *          Solution_198
 */
public class Solution_198 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int rob(int[] nums) {
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; ++i) {
			if (i % 2 == 0) {
				a += nums[i];
				a = Math.max(a, b);
			} else {
				b += nums[i];
				b = Math.max(a, b);
			}
		}
		return Math.max(a, b);
	}
}

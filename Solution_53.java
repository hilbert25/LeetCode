package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月7日 下午7:55:52 LeetCode com.hilbert25.leetcode Solution_53
 */
public class Solution_53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean canJump(int[] nums) {
		int farthest = 0;
		for (int i = 0; farthest >= i && farthest <= nums.length - 1; i++)
			farthest = Math.max(farthest, i + nums[i]);
		return farthest >= nums.length - 1;
	}
}

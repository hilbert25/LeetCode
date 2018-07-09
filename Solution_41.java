package com.hilbert25.leetcode;
public class Solution_41 {
   public int firstMissingPositive(int[] nums) {
		int[] record = new int[10000];
		int l = nums.length;
		for (int i = 0; i < l; i++) {
			if (nums[i] >= 0)
				record[nums[i]] = 1;
		}
		for (int i = 1; i < 10000; i++)
			if (record[i] == 0)
				return i;
		return 0;
	}
}
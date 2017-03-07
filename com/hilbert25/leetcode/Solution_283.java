package com.hilbert25.leetcode;
public class Solution_283 {
    public void moveZeroes(int[] nums) {
		int i = 0;
		for (int n : nums) {
			if (n != 0)
				nums[i++] = n;
		}
		while (i < nums.length)
			nums[i++] = 0;
    }
}
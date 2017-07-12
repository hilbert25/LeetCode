package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月19日 下午8:00:23 LeetCode com.hilbert25.leetcode
 *          Solution_80
 */
public class Solution_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 1, 2, 2, 3 };
		System.out.println(removeDuplicates(nums));
	}

	public static int removeDuplicates(int[] nums) {
		if (nums.length <= 1)
			return nums.length;
		int count = 1;
		int index = 1;
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] == nums[i - 1]) {
				count++;
				if (count >= 3)
					continue;
			} else {
				count = 1;
			}
			nums[index] = nums[i];
			index++;
		}
		return index;
	}
}

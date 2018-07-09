package com.hilbert25.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月28日 下午10:30:32 LeetCode com.hilbert25.leetcode
 *          Solution_352
 */
public class Solution_352 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1 % 0);
	}

	public static boolean checkSubarraySum(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		k = Math.abs(k);
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (k != 0)
				sum %= k;
			Integer t = map.get(sum);
			if (t != null) {
				if (i - t > 1)
					return true;
			} else
				map.put(sum, i);
		}
		return false;
	}
}

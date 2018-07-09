package com.hilbert25.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月15日 下午10:26:01 LeetCode com.hilbert25.leetcode
 *          Solution_128
 */
public class Solution_128 {
	public static void main(String[] args) {

	}

	/**
	 * union set
	 * 
	 * @param nums
	 * @return
	 */
	public int longestConsecutive(int[] nums) {
		int maxLongest = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int n : nums) {
			if (!map.containsKey(n)) {
				int left = (map.containsKey(n - 1) ? map.get(n - 1) : 0);
				int right = (map.containsKey(n + 1) ? map.get(n + 1) : 0);
				int curLongest = left + right + 1;
				map.put(n, curLongest);
				maxLongest = Math.max(maxLongest, curLongest);
				map.put(n - left, curLongest);
				map.put(n + right, curLongest);
			}
		}
		return maxLongest;
	}
}

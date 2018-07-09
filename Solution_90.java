package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月22日 下午10:22:08 LeetCode com.hilbert25.leetcode
 *          Solution_90
 */
public class Solution_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 2 };
		subsetsWithDup(nums);
	}

	public static List<List<Integer>> subsetsWithDup(int[] nums) {
		Arrays.sort(nums);
		int count = 1 << nums.length;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Set<String> set = new HashSet<String>();
		while (count > 0) {
			int t = count;
			String str = "";
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				if ((t & 1) == 1) {
					list.add(nums[i]);
					str += String.valueOf(nums[i]);
				}
				t = t >> 1;
			}
			count--;
			if (!set.contains(str)) {
				res.add(list);
				set.add(str);
			}
		}
		return res;
	}
}

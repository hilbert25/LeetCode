package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月18日 下午11:04:47 LeetCode com.hilbert25.leetcode
 *          Solution_78
 */
public class Solution_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		int[] nums = { 1, 2, 3 };
		res = subsets(nums);
		System.out.println(res.size());
		for (List<Integer> l : res) {
			for (int i : l)
				System.out.print(i + ",");
			System.out.println();
		}
	}

	public static List<List<Integer>> subsets(int[] nums) {
		int count = 1 << nums.length;
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		while (count > 0) {
			int t = count;
			List<Integer> list = new ArrayList<>();
			for (int i = 0; i < nums.length; i++) {
				if ((t & 1) == 1)
					list.add(nums[i]);
				t = t >> 1;
			}
			count--;
			res.add(list);
		}
		return res;
	}
}

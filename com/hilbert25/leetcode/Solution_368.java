package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 下午4:56:03 LeetCode com.hilbert25.leetcode
 *          Solution_368
 */
public class Solution_368 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2, 4, 8, 16 };
		largestDivisibleSubset(nums);
		System.out.println(Arrays.binarySearch(nums, 0, 4, 5));
	}

	public static List<Integer> largestDivisibleSubset(int[] nums) {
		List<Integer> list = new ArrayList<>();
		if (nums.length == 0)
			return list;
		Arrays.sort(nums);
		int[][] record = new int[2][nums.length];// index count
		Arrays.fill(record[0], -1);
		for (int i = 0; i < nums.length; i++) {
			int maxIndex = i;
			int max = 0;
			int t = 0;
			if (nums[i] / 2 == 0)
				t = Arrays.binarySearch(nums, 0, i, nums[i] / 2);
			else
				t = Arrays.binarySearch(nums, 0, i, nums[i] / 3);
			t = t < 0 ? -t - 1 : t;
			for (int j = t; j >= 0; j--) {
				if (nums[i] % nums[j] == 0 && record[1][j] > max) {
					maxIndex = j;
					max = record[1][j];
				}
			}
			record[0][i] = max == 0 ? -1 : maxIndex;
			record[1][i] = max + 1;
		}
		int max = 0;
		for (int i = 0; i < record[0].length; i++)
			max = record[1][i] > record[1][max] ? i : max;
		list.add(nums[max]);
		while (record[0][max] != -1) {
			list.add(nums[record[0][max]]);
			max = record[0][max];
		}
		Collections.sort(list);
		return list;
	}
}

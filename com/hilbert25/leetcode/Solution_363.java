package com.hilbert25.leetcode;

import java.util.TreeSet;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月6日 下午2:56:49 LeetCode com.hilbert25.leetcode
 *          Solution_363
 */
public class Solution_363 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> set = new TreeSet<>();
		set.add(0);
		set.add(1);
		set.add(2);
		System.out.println(set.floor(3));
	}

	public static int longestSubSeq(int[] nums) {
		int[] currentSum = new int[nums.length];
		int max = nums[0];
		currentSum[0] = nums[0];
		for (int i = 1; i < nums.length; i++) {
			currentSum[i] = currentSum[i - 1] > 0 ? currentSum[i - 1] + nums[i] : nums[i];
			if (max < currentSum[i])
				max = currentSum[i];
		}
		return max;
	}

	public int maxSumSubmatrix(int[][] matrix, int k) {
		TreeSet<Integer> set = new TreeSet<>();
		for (int i = 0; i < matrix.length; i++) {
			int[] sum = new int[matrix[0].length];
			for (int j = i; j < matrix.length; j++) {
				for (int n = 0; n < matrix[0].length; n++) {
					sum[n] += matrix[j][n];
				}

			}
		}
		return 0;
	}

}

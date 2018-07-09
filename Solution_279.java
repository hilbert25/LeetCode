package com.hilbert25.leetcode;

import java.util.Arrays;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 下午4:06:27 LeetCode com.hilbert25.leetcode
 *          Solution_279
 */
public class Solution_279 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 5; i++)
			System.out.println(numSquares(i));
	}

	/**
	 * @param n
	 * @return
	 */
	public static int numSquares(int n) {
		int[] dp = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			int j = 1;
			int min = Integer.MAX_VALUE;
			while (i >= j * j) {
				min = Math.min(min, dp[i - j * j] + 1);
				j++;
			}
			dp[i] = min;
		}
		return dp[n];
	}
}

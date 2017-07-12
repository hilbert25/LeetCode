package com.hilbert25.leetcode;

import java.util.Arrays;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月28日 上午10:31:53 LeetCode com.hilbert25.leetcode
 *          Solution_62
 */
public class Solution_62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello world");
	}

	/**
	 * 滚动数组
	 * 
	 * @param m
	 * @param n
	 * @return
	 */
	public int uniquePaths(int m, int n) {
		int[] road = new int[n];
		Arrays.fill(road, 1);
		for (int i = 1; i < m; i++)
			for (int j = 1; j < n; j++) {
				road[j] = road[j] + road[j - 1];
			}
		return road[n - 1];
	}
}

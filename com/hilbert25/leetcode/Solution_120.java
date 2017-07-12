package com.hilbert25.leetcode;

import java.util.Arrays;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 下午3:52:04 LeetCode com.hilbert25.leetcode
 *          Solution_120
 */
public class Solution_120 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int minimumTotal(List<List<Integer>> triangle) {
		int size = triangle.size();
		int[][] count = new int[2][size];
		Arrays.fill(count[0], Integer.MAX_VALUE);
		Arrays.fill(count[1], Integer.MAX_VALUE);
		count[0][0] = triangle.get(0).get(0);
		for (int i = 1; i < size; i++) {
			List<Integer> list = triangle.get(i);
			int tempSize = list.size();
			for (int j = 0; j < tempSize; j++) {
				count[i % 2][j] = list.get(j) + Math.min(count[(i - 1) % 2][j - 1], count[(i - 1) % 2][j]);
			}
		}
		int min = count[(size - 1) % 2][0];
		for (int i = 1; i < size; i++)
			if (count[(size - 1) % 2][i] < min)
				min = count[(size - 1) % 2][i];
		return min;
	}

}

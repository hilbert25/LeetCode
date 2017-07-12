package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月12日 上午12:36:13 LeetCode com.hilbert25.leetcode
 *          Solution_59
 */
public class Solution_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[][] generateMatrix(int n) {
		int[][] matrix = new int[n][n];
		if (n == 0)
			return matrix;
		int index = 1;
		int l = (n + 1) / 2;
		int begin = -1;
		for (int i = 0; i < l; i++) {
			begin++;
			for (int j = begin; j <= n - 1 - begin; j++)
				matrix[begin][j] = index++;
			for (int j = begin + 1; j <= n - 1 - begin; j++)
				matrix[j][n - 1 - begin] = index++;
			for (int j = n - 1 - begin - 1; j >= begin; j--)
				matrix[n - 1 - begin][j] = index++;
			for (int j = n - 1 - begin - 1; j > begin; j--)
				matrix[j][begin] = index++;
		}
		return matrix;
	}
}

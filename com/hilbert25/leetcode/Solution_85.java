package com.hilbert25.leetcode;

import java.util.Arrays;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月2日 下午2:34:02 LeetCode com.hilbert25.leetcode Solution_85
 */
public class Solution_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] matrix = new char[][] { { '1', '0', '1', '0', '0' }, { '1', '0', '1', '1', '1' },
				{ '1', '1', '1', '1', '1' }, { '1', '0', '0', '1', '0' } };
		maximalRectangle(matrix);
	}

	public static int maximalRectangle(char[][] matrix) {
		int maxArea = 0;
		if (matrix.length == 0)
			return 0;
		int col = matrix[0].length;
		int row = matrix.length;
		int[][] far = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < row; i++) {
			int j = col - 1;
			while (j >= 0) {
				int end = j;
				while (j >= 0 && matrix[i][j] == '0') {
					end--;
					j--;
				}
				while (j >= 0 && matrix[i][j] == '1') {
					far[i][j] = end;
					j--;
				}
			}
		}
		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++) {
				if ((row - i + 1) * (col - j + 1) <= maxArea)
					break;
				if (matrix[i][j] == '1') {
					int minWidth = far[i][j] - j + 1;
					for (int endRow = i; endRow < row && matrix[endRow][j] == '1'; endRow++) {
						minWidth = Math.min(minWidth, far[endRow][j] - j + 1);
						maxArea = Math.max(maxArea, minWidth * (endRow - i + 1));
					}
				}
			}
		return maxArea;
	}
}

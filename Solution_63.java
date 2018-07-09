package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月12日 下午3:35:22 LeetCode com.hilbert25.leetcode
 *          Solution_63
 */
public class Solution_63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int h = obstacleGrid.length;
		int w = obstacleGrid[0].length;
		int[][] path = new int[h][w];
		for (int i = 0; i < w && obstacleGrid[0][i] != 1; i++) {
			path[0][i] = 1;
		}
		for (int i = 0; i < h && obstacleGrid[i][0] != 1; i++) {
			path[i][0] = 1;
		}
		for (int i = 1; i < h; i++) {
			for (int j = 1; j < w; j++) {
				if (obstacleGrid[i][j] == 1)
					continue;
				if (i == 0 || j == 0)
					path[i][j] = 1;
				else {
					path[i][j] = path[i - 1][j] + path[i][j - 1];
				}
			}
		}
		return path[h - 1][w - 1];
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 上午11:51:32 LeetCode com.hilbert25.leetcode
 *          Solution_64
 */
public class Solution_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param grid
	 * @return
	 */
//	public int minPathSum(int[][] grid) {
//		if (grid.length == 0)
//			return 0;
//		int[][] currentMatrix = new int[grid.length][grid[0].length];
//		int height = grid.length;
//		int width = grid[0].length;
//		currentMatrix[0][0] = grid[0][0];
//		for (int j = 1; j < width; j++)
//			currentMatrix[0][j] = currentMatrix[0][j - 1] + grid[0][j];
//		for (int i = 1; i < height; i++) {
//			for (int j = 0; j < width; j++) {
//				if (j == 0)
//					currentMatrix[i][j] = currentMatrix[i - 1][j] + grid[i][j];
//				else
//					currentMatrix[i][j] = Math.min(currentMatrix[i - 1][j], currentMatrix[i][j - 1]) + grid[i][j];
//			}
//		}
//		return currentMatrix[height-1][width-1];
//	}
	public int minPathSum(int[][] grid) {
		int height = grid.length;
		int width = grid[0].length;
		for (int j = 1; j < width; j++)
			grid[0][j] = grid[0][j - 1] + grid[0][j];
		for (int i = 1; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if (j == 0)
					grid[i][j] = grid[i - 1][j] + grid[i][j];
				else
					grid[i][j] = Math.min(grid[i - 1][j], grid[i][j - 1]) + grid[i][j];
			}
		}
		return grid[height-1][width-1];
	}
}

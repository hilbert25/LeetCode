package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午2:15:36 LeetCode com.hilbert25.leetcode
 *          Solution_74
 */
public class Solution_74 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 }, { 23, 30, 34, 50 } };
		for (int i = 0; i < 51; i++)
			System.out.println(i + " " + searchMatrix(matrix, i));
	}

	public static boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length;
		if (m == 0)
			return false;
		int n = matrix[0].length;
		if (n==0||target < matrix[0][0] || target > matrix[m - 1][n - 1])
			return false;
		int begin = 0, end = m * n - 1, middle = 0;
		while (begin <= end) {
			middle = (begin + end) / 2;
			int temp = matrix[middle / n][middle % n];
			if (temp == target) {
				return true;
			} else if (temp < target) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
		return false;
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月12日 下午11:05:57 LeetCode com.hilbert25.leetcode
 *          Solution_115
 */
public class Solution_115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param s
	 * @param t
	 * @return
	 */
	public int numDistinct(String s, String t) {
		if (s.length() < t.length())
			return 0;
		int[][] matrix = new int[s.length()][t.length()];
		if (s.charAt(0) == t.charAt(0))
			matrix[0][0] = 1;
		for (int i = 1; i < s.length(); i++) {
			matrix[i][0] = s.charAt(i) == t.charAt(0) ? matrix[i - 1][0] + 1 : matrix[i - 1][0];
		}
		for (int i = 1; i < s.length(); i++) {
			for (int j = 1; j < t.length(); j++) {
				if (s.charAt(i) == t.charAt(j)) {
					matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j];
				} else {
					matrix[i][j] = matrix[i - 1][j];
				}
			}
		}
		return matrix[s.length() - 1][t.length() - 1];
	}

}

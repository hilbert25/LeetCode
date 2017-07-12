package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月23日 下午5:03:39 LeetCode com.hilbert25.leetcode
 *          Solution_518
 */
public class Solution_516 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int longestPalindromeSubseq(String s) {
		if (s.length() <= 1)
			return s.length();
		int max = 1;
		int[][] length = new int[s.length()][s.length()];
		for (int i = 0; i < s.length(); i++) {
			length[i][i] = 1;
		}
		for (int i = 1; i < s.length(); i++) {
			for (int j = 0; j < s.length() - i; j++) {
				length[j][j + i] = s.charAt(j) == s.charAt(j + i) ? length[j + 1][j + i - 1] + 2
						: Math.max(length[j][j + i - 1], length[j + 1][j + i]);
				max = Math.max(max, length[j][j + i]);
			}
		}
		return max;
	}
}

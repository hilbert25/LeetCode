package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月11日 下午8:53:15 LeetCode com.hilbert25.leetcode
 *          Solution_32
 */
public class Solution_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestValidParentheses("()(())");
	}

	public static int longestValidParentheses(String s) {
		if (s.length() <= 1)
			return 0;
		int max = 0;
		int[] length = new int[s.length()];
		length[0] = -1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '(')
				length[i] = -1;
			else {
				if (s.charAt(i - 1) == '(') {
					if (i >= 2) {
						length[i] = length[i - 2] == -1 ? 2 : length[i - 2] + 2;
					} else
						length[i] = 2;
				} else {
					if (length[i - 1] == -1)
						length[i] = -1;
					else {
						int pre = i - length[i - 1] - 1;
						if (pre >= 0 && s.charAt(pre) == '(') {
							length[i] = length[i - 1] + 2;
							if (pre >= 1 && length[pre - 1] > 0) {
								length[i] += length[pre - 1];
							}
						} else {
							length[i] = -1;
						}
					}
				}
			}
			max = Math.max(max, length[i]);
		}
		return max;
	}
}

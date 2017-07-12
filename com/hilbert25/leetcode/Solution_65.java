package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月6日 上午11:02:32 LeetCode com.hilbert25.leetcode
 *          Solution_65
 */
public class Solution_65 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isNumber("+.8"));
	}

	public static boolean isNumber(String s) {
		int[][] transfer = { { -1, 0, 3, 1, 2, -1 }, { -1, 8, -1, 1, 4, 5 }, { -1, -1, -1, 4, -1, -1 },
				{ -1, -1, -1, 1, 2, -1 }, { -1, 8, -1, 4, -1, 5 }, { -1, -1, 6, 7, -1, -1 }, { -1, -1, -1, 7, -1, -1 },
				{ -1, 8, -1, 7, -1, -1 }, { -1, 8, -1, -1, -1, -1 } };
		int state = 0;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			state = transfer[state][getSymbol(c)];
			System.out.println(state);
			if (state == -1)
				return false;
		}
		if (state == 1 || state == 4 || state == 7 || state == 8)
			return true;
		else
			return false;
	}

	public static int getSymbol(char c) {
		if (c == ' ')
			return 1;
		else if (c == '+' || c == '-')
			return 2;
		else if (c >= '0' && c <= '9')
			return 3;
		else if (c == '.')
			return 4;
		else if (c == 'e' || c == 'E')
			return 5;
		else
			return 0;
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 下午11:45:16 LeetCode com.hilbert25.leetcode
 *          Solution_8
 */
public class Solution_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int myAtoi(String str) {// symbol: 0 space ,1 sign,2 number,3 others
									// state: 0 init or only has space,1 only
									// sign ,2 only number,3 both sign and
									// number -1 end
		long t = 0;
		int stateMatrix[][] = { { 0, 1, 2, -1 }, { -1, -1, 3, -1 }, { -1, -1, 2, -1 }, { -1, -1, 3, -1 } };
		int l = str.length();
		int state = 0;
		int sign = 1;
		for (int i = 0; i < l; i++) {
			char c = str.charAt(i);
			if (c == ' ') {
				state = stateMatrix[state][0];
			} else if (c == '+' || c == '-') {
				if (c == '-')
					sign = -1;
				state = stateMatrix[state][1];
			} else if (c >= '0' && c <= '9') {
				state = stateMatrix[state][2];
				t = t * 10 + c - '0';
				if (sign == 1 && t >= Integer.MAX_VALUE)
					return Integer.MAX_VALUE;
				if (sign == -1 && t >= (long) Integer.MAX_VALUE + 1)
					return Integer.MIN_VALUE;
			} else {
				state = stateMatrix[state][3];
			}
			if (state == -1)
				break;
		}
		return (int) (sign == 1 ? t : -t);
	}
}

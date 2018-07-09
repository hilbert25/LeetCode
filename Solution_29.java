package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月7日 下午10:27:48 LeetCode com.hilbert25.leetcode
 *          Solution_29
 */
public class Solution_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(div(100, 3));
		for (int i = 0; i <= 100; i++) {
			System.out.println("100/" + "" + i + "=" + div(100, i));
		}
	}

	public static int div(int dividend, int divisor) {
		if (divisor == 0)
			return Integer.MAX_VALUE;
		if (divisor == 1)
			return dividend;
		if (dividend == 0 || dividend < divisor)
			return 0;
		int middle = 0;
		int begin = 1, end = dividend - 1;
		while (true) {
			middle = (begin + end) >> 1;
			int temp = middle * divisor;
			if (temp == dividend || (temp < dividend && (middle + 1) * divisor > dividend))
				return middle;
			else if (temp < dividend) {
				begin = middle + 1;
			} else {
				end = middle - 1;
			}
		}
	}
}

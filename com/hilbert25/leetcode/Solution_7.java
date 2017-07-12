package com.hilbert25.leetcode;

import java.math.BigDecimal;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 下午9:23:19 LeetCode com.hilbert25.leetcode Solution_7
 */
public class Solution_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1));
	}

	// /**
	// * @param x
	// * @return
	// */
	// public static int reverse(int x) {
	// if (x == 0)
	// return 0;
	// boolean negative = false;
	// if (x < 0)
	// negative = true;
	// StringBuffer sb = new StringBuffer();
	// while (x != 0) {
	// sb.append(Math.abs(x % 10));
	// x = x / 10;
	// }
	// BigDecimal bd = new BigDecimal(sb.toString());
	// if (negative) {
	// bd = bd.divide(new BigDecimal(("-1")));
	// if (bd.compareTo(new BigDecimal(String.valueOf(Integer.MIN_VALUE))) ==
	// -1) {
	// return 0;
	// } else
	// return Integer.valueOf(bd.toString());
	// } else {
	// if (bd.compareTo(new BigDecimal(String.valueOf(Integer.MAX_VALUE))) == 1)
	// {
	// return 0;
	// } else
	// return Integer.valueOf(bd.toString());
	// }
	// }
	public static int reverse(int x) {
		long sum = 0;
		while (x != 0) {
			sum = sum * 10 + x % 10;
			x /= 10;
		}
		if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
			return 0;
		else
			return (int) sum;
	}
}

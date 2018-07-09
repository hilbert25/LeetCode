package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月10日 下午8:55:19 LeetCode com.hilbert25.leetcode
 *          Solution_357
 */
public class Solution_357 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int countNumbersWithUniqueDigits(int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 10;
		else
			return (countNumbersWithUniqueDigits(n - 1) - countNumbersWithUniqueDigits(n - 2)) * (10 - (n - 1))
					+ countNumbersWithUniqueDigits(n - 1);
	}
}

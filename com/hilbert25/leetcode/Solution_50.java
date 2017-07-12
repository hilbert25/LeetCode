package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月7日 上午11:01:06 LeetCode com.hilbert25.leetcode
 *          Solution_50
 */
public class Solution_50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public double myPow(double x, int n) {
		if (n == 1)
			return x;
		if (n == 0)
			return 1.0;
		if (n < 0) {
			if (n == Integer.MIN_VALUE) {
				n++;
				return 1.0 / (myPow(x, -n) * x);
			}
			return 1.0 / myPow(x, -n);
		} else {
			double half = myPow(x, n >> 1);
			if ((n % 2) == 1) {// 奇数
				return half * half * x;
			} else {
				return half * half;
			}
		}
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月21日 上午10:17:51 LeetCode com.hilbert25.leetcode
 *          Solution_343
 */
public class Solution_343 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(integerBreak(8));
	}

	public static int integerBreak(int n) {
		int[] product = new int[n + 1];
		if (n < 3)
			return 1;
		for (int i = 0; i < 3; i++)
			product[i] = 1;
		for (int i = 3; i <= n; i++) {
			int max = 0;
			for (int j = 1; j <= i / 2 + 1; j++) {
				int a = Math.max(j, product[j]);
				int b = Math.max(i - j, product[i - j]);
				if (max < a * b)
					max = a * b;
			}
			product[i] = max;
		}
		return product[n];
	}
}

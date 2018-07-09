package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月28日 下午3:21:40 LeetCode com.hilbert25.leetcode
 *          Solution_476
 */
public class Solution_476 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(findComplement(8));
	}

	public static int findComplement(int num) {
		if (num == 0)
			return 1;
		long t = 1;
		while (t <= num) {
			t = t << 1;
		}
		return (int) (num ^ (t - 1));
	}
}

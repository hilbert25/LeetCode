package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 下午6:36:53 LeetCode com.hilbert25.leetcode
 *          Solution_507
 */
public class Solution_507 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkPerfectNumber(6);
	}

	public static boolean checkPerfectNumber(int num) {
		if (num <= 1 || (num & 1) == 1)
			return false;
		int sum = 1;
		int end = (int) Math.ceil(Math.sqrt(num));
		for (int i = 2; i <end; i++) {
			if (num % i == 0) {
				sum += i + num / i;
			}
		}
		return sum == num;
	}
}

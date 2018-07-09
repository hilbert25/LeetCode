package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月20日 下午11:02:17 LeetCode com.hilbert25.leetcode
 *          Solution_413
 */
public class Solution_413 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 1, 2, 3, 8, 9, 10 };
		System.out.println(numberOfArithmeticSlices(A));
	}

	public static int numberOfArithmeticSlices(int[] A) {
		if (A.length < 3)
			return 0;
		int begin = 0;
		int value = A[1] - A[0];
		int[] count = new int[A.length];
		count[0] = 0;
		count[1] = 0;
		for (int i = 2; i < A.length; i++) {
			if (A[i] - A[i - 1] == value) {
				count[i] = i - 2 - begin + 1;
			} else {
				begin = i-1;
				value = A[i] - A[i - 1];
			}
		}
		int sum = 0;
		for (int i : count)
			sum += i;
		return sum;
	}
}

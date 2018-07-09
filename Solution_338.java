package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月20日 下午10:32:32 LeetCode com.hilbert25.leetcode
 *          Solution_338
 */
public class Solution_338 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] countBits(int num) {
		int[] res = new int[num + 1];
		for (int i = 0; i <= num; i++)
			res[i] = Integer.bitCount(i);
		return res;
	}
}

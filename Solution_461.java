package com.hilbert25.leetcode;

import java.util.BitSet;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月26日 下午4:08:45 LeetCode com.hilbert25.leetcode
 *          Solution_461
 */
public class Solution_461 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2 ^ 4);
	}

	public int hammingDistance(int x, int y) {
		return Integer.bitCount(x ^ y);
	}
}

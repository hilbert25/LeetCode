package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午1:10:35 LeetCode com.hilbert25.leetcode
 *          Solution_69
 */
public class Solution_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(mySqrt(2147483333));
	}

	public static int mySqrt(int x) {
		if(x<=1)
			return x;
		int end = x >> 1;
		for (int i = 0; i <= end; i++) {
			long next = (long) (i + 1) * (long) (i + 1);
			if (i * i <= x && next > x)
				return i;
		}
		return 0;
	}
}

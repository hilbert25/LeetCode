package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月27日 下午6:25:56 LeetCode com.hilbert25.leetcode Solution_5
 */
public class Solution_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String longestPalindrome(String s) {
		char[] cArr = s.toCharArray();
		int[] temp = new int[cArr.length];
		if (cArr.length <= 1)
			return s;
		else if (cArr.length == 2) {
			if (cArr[0] == cArr[1])
				return s;
			else
				return String.valueOf(cArr[0]);
		} else {
			for (int i = 1; i < cArr.length - 1; i++) {
				if (cArr[i] == cArr[i - 1]) {
					temp[i] = 2;
					break;
				} else if (cArr[i - 1] == cArr[i + 1]) {
					temp[i] = 3;
					break;
				}
			}
		}
		return null;
	}

}

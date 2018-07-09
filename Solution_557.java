package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月26日 下午4:54:49 LeetCode com.hilbert25.leetcode
 *          Solution_557
 */
public class Solution_557 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public String reverseWords(String s) {
		String[] sArr = s.split(" ");
		for (int i = 0; i < sArr.length; i++) {
			String t = "";
			for (int j = sArr[i].length() - 1; j >= 0; j--) {
				t += sArr[i].charAt(j);
			}
			sArr[i] = t;
		}
		s = "";
		for (int i = 0; i < sArr.length - 1; i++)
			s += sArr[i] + " ";
		s += sArr[sArr.length - 1];
		return s;
	}
}

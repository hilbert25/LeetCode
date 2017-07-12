package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午10:57:13 LeetCode com.hilbert25.leetcode
 *          Solution_58
 */
public class Solution_58 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int lengthOfLastWord(String s) {
		int end = s.length() - 1;
		int begin = 0;
		for (; end >= 0 && s.charAt(end) == ' '; end--)
			;
		for (begin = end; begin >= 0 && s.charAt(begin) != ' '; begin--)
			;
		return end - begin;
	}
}

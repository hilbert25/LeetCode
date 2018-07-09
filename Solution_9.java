package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月20日 下午12:14:26 LeetCode com.hilbert25.leetcode
 *          Solution_9
 */
public class Solution_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static boolean isPalindrome(int x) {
		if (x < 0)
			return false;
		String t = String.valueOf(x);
		int begin = 0, end = t.length() - 1;
		while (begin <= end) {
			if (t.charAt(begin) == t.charAt(end)) {
				begin++;
				end--;
			} else
				return false;
		}
		return true;
	}
}

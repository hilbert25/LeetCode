package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月14日 下午11:11:50 LeetCode com.hilbert25.leetcode
 *          Solution_125
 */
public class Solution_125 {
	public static void main(String[] args) {

	}

	/**
	 * @param s
	 * @return
	 */
	public boolean isPalindrome(String s) {
		if (s.length() <= 1)
			return true;
		int i = 0, j = s.length() - 1;
		while (i <= j) {
			while (i < s.length() && !isAlphanumeric(s.charAt(i))) {
				i++;
			}
			while (j > 0 && !isAlphanumeric(s.charAt(j))) {
				j--;
			}
			if (j <= i) {
				return true;
			}
			if (transfer(s.charAt(i)) != transfer(s.charAt(j))) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	public boolean isAlphanumeric(char ch) {
		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');
	}

	public char transfer(char ch) {
		if (ch >= '0' && ch <= '9') {
			return ch;
		} else {
			return Character.toLowerCase(ch);
		}
	}
}

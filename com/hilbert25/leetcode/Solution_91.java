package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月21日 上午12:07:36 LeetCode com.hilbert25.leetcode
 *          Solution_91
 */
public class Solution_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String x = "fmn";
		x.toUpperCase();
		String y = x.replace('f', 'F');
		y = y + "wxy";
		System.out.println(y);
	}

	public int numDecodings(String s) {
		if (s.length() == 0 || s.charAt(0) == '0')
			return 0;
		int[] count = new int[s.length() + 1];

		if (s.length() == 1)
			return 1;
		count[0] = 1;
		count[1] = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				if (s.charAt(i - 1) == '1' || s.charAt(i - 1) == '2')
					count[i + 1] = count[i];
				else
					count[i + 1] = 0;
			} else
				count[i + 1] = Integer.valueOf(s.substring(i - 1, i + 1)) <= 26
						&& Integer.valueOf(s.substring(i - 1, i + 1)) >= 11 ? count[i - 1] + count[i] : count[i];
		}
		return count[s.length()];
	}

}

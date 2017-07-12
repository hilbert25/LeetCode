package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月7日 下午1:34:33 LeetCode com.hilbert25.leetcode Solution_10
 */
public class Solution_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		System.out.println(isMatch("abcdef", "a*e*f"));
	}

	public static boolean isMatch(String s, String p) {
		int sIndex = 0;
		int pIndex = 0;
		char currChar = ' ';
		while (sIndex >= 0 && pIndex >= 0) {
			switch (p.charAt(pIndex)) {
			case '*':
				pIndex++;
				break;
			case '.':
				if (pIndex == p.length() - 1) {
					if (sIndex == s.length() - 1)
						return true;
					else
						return false;
				}
				if (p.charAt(pIndex + 1) == '*') {
				} else {
					sIndex++;
					pIndex++;
				}
				break;
			default:
				char t = p.charAt(pIndex);
				if (pIndex < p.length() - 1) {
					if (p.charAt(pIndex + 1) == '*') {
						int i = pIndex;
						while (i < p.length() && p.charAt(i) == p.charAt(pIndex))
							i = i + 2;
						pIndex = i - 2;
						while (s.charAt(sIndex) == t)
							sIndex++;
					}
					if (p.charAt(pIndex + 1) == '.') {
						if (s.charAt(sIndex) == t) {
							sIndex++;
							pIndex += 2;
						}
					}
				} else {
					if (t == s.charAt(sIndex) && sIndex == s.length() - 1)
						return true;
					else
						return false;
				}
				break;
			}
		}
		return sIndex < 0 && pIndex < 0;
	}

}

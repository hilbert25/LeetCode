package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月3日 下午5:08:33 LeetCode com.hilbert25.leetcode Solution_28
 */
public class Solution_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abaabcac";
		String str2 = "aab";
		System.out.println(kmp(str1, str2));
		System.out.println(str1.indexOf(str2));

	}

	public static int[] next(String str) {
		int[] nextArr = new int[str.length()];
		nextArr[0] = 0;
		for (int i = 1; i < str.length(); i++) {
			nextArr[i] = 1;
			int n = i - 1;
			while (n >= 1) {
				if (str.substring(0, n).equals(str.substring(i - n, i))) {
					nextArr[i] = n + 1;
					break;
				}
				n--;
			}
		}
		return nextArr;
	}

	public static int kmp(String haystack, String needle) {
		if(needle.equals(haystack))
            return 0;
       if (needle.length() == 0||haystack.length()==0)
			return -1;
		int i = 0, j = 0;
		int[] nextArr = next(needle);
		while (j + i < haystack.length()) {
			if (haystack.charAt(i + j) == needle.charAt(i)) {
				i++;
			} else {
				if (i == 0) {
					j++;
				} else {
					i = nextArr[i] > 0 ? 0 : i - 1;
					j = j + i - (nextArr[i] - 1);
				}
			}
			if (i == needle.length())
				return j;
		}
		return -1;
	}
}


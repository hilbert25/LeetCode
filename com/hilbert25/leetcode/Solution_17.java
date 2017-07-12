package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月7日 上午12:36:44 LeetCode com.hilbert25.leetcode
 *          Solution_17
 */
public class Solution_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = letterCombinations("2");
		for (String s : list)
			System.out.println(s);
	}

	static String word[][] = { { "a", "b", "c", "" }, { "d", "e", "f", "" }, { "g", "h", "i", "" },
			{ "j", "k", "l", "" }, { "m", "n", "o", "" }, { "p", "q", "r", "s" }, { "t", "u", "v", "" },
			{ "w", "x", "y", "z" } };

	public static List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<String>();
		if (digits.equals(""))
			return ans;
		int[] iArr = new int[digits.length()];
		for (int i = 0; i < digits.length(); i++) {
			char c = digits.charAt(i);
			if (c == '1')
				return ans;
			iArr[i] = c - '2';
		}
		search(ans, "", iArr, 0);
		return ans;
	}

	public static void search(List<String> ans, String temp, int[] iArr, int cur) {
		if (cur == iArr.length) {
			ans.add(temp);
			return;
		}
		for (String s : word[iArr[cur]]) {
			if (s.equals(""))
				continue;
			else {
				temp += s;
				search(ans, temp, iArr, ++cur);
				temp = temp.substring(0, --cur);
			}
		}

	}
}

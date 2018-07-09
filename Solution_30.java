package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月11日 上午12:34:21 LeetCode com.hilbert25.leetcode
 *          Solution_30
 */
public class Solution_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findSubstring("abarfoothefoobarman", new String[] { "foo", "bar", "man" });
	}

	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<>();
		int begin = s.length() - 1;
		int end = s.length() - 1;
		for (int i = 0; i < words.length; i++) {
			int a = s.indexOf(words[i]);
			begin = begin > a ? a : begin;
			int b = s.indexOf(words[i], a + 1);
			if (b != -1)
				end = end > b ? b : end;
			else
				end = end > a + words[0].length() ? end : a + words[0].length();
		}
		list.add(begin);
		list.add(end);
		return list;
	}
}

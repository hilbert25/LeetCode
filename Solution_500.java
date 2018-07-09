package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月28日 下午3:34:18 LeetCode com.hilbert25.leetcode
 *          Solution_500
 */
public class Solution_500 {

	public static void main(String[] args) {
		String[] res = findWords(new String[] {});
		for (String s : res)
			System.out.println(s);
	}

	public static String[] findWords(String[] words) {
		int[] pos = new int[] { 1, 2, 2, 1, 0, 1, 1, 1, 0, 1, 1, 1, 2, 2, 0, 0, 0, 0, 1, 0, 0, 2, 0, 2, 0, 2 };
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			String str = words[i].toLowerCase();
			int line = pos[str.charAt(0) - 'a'];
			int index = 1;
			while (index < str.length() && pos[str.charAt(index) - 'a'] == line)
				index++;
			if (index == str.length())
				list.add(words[i]);
		}
		String[] res = new String[list.size()];
		return list.toArray(res);
	}
}

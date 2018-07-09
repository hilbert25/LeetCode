package com.hilbert25.leetcode;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月28日 下午4:24:43 LeetCode com.hilbert25.leetcode
 *          Solution_451
 */
public class Solution_451 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public String frequencySort(String s) {
		Map<Character, Integer> map = new TreeMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			// map.compute(s.charAt(i), (k, v) -> v == null ? 1 : v + 1);
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
		}
		StringBuilder sb = new StringBuilder();
		map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				.forEach(a -> collect(a, sb));

		return sb.toString();
	}

	private void collect(Map.Entry<Character, Integer> entry, StringBuilder sb) {
		int count = entry.getValue();
		Character ch = entry.getKey();
		while (count-- > 0)
			sb.append(ch);
	}
}

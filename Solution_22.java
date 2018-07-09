package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月12日 下午12:11:00 LeetCode com.hilbert25.leetcode
 *          Solution_22
 */
public class Solution_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		generateParenthesis(4);
	}

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		search("", n, n, list);
		return list;
	}

	public static void search(String add, int left, int right, List<String> list) {
		if (left < 0 || right < 0 || left > right)
			return;
		if (left == 0 && right == 0) {
			list.add(add);
			return;
		}
		search(add + "(", left - 1, right, list);
		search(add + ")", left, right - 1, list);
	}
}

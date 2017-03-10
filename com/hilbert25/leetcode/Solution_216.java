package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月10日 下午8:53:30 LeetCode com.hilbert25.leetcode
 *          Solution_216
 */
public class Solution_216 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<Integer> list = new ArrayList<Integer>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if (n < k * (k - 1) / 2)
			return result;
		result = search(k, n, 1, 0, list, result);
		return result;
	}

	public static List<List<Integer>> search(int k, int n, int cur, int sum, List<Integer> list,
			List<List<Integer>> result) {
		if (k == 0)
			return result;
		for (int i = cur; i <= 9; i++) {
			if (sum + i < n) {
				sum += i;
				list.add(i);
				result = search(k - 1, n, i + 1, sum, list, result);
				list.remove(list.size() - 1);
				sum -= i;
			} else if (sum + i == n && k == 1) {
				list.add(i);
				result.add(new ArrayList<Integer>(list));
				list.remove(list.size() - 1);
			} else
				break;
		}
		return result;
	}
}

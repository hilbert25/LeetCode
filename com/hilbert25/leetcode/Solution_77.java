package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月18日 下午10:29:22 LeetCode com.hilbert25.leetcode
 *          Solution_77
 */
public class Solution_77 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		List<Integer> temp = new ArrayList<Integer>();
		search(res, temp, 1, n, k);
		return res;
	}

	public void search(List<List<Integer>> res, List<Integer> temp, int cur, int n, int k) {
		if (k == 0) {
			List<Integer> list = new ArrayList<Integer>(temp);
			res.add(list);
			return;
		} else {
			for (int i = cur; i <= n; i++) {
				temp.add(i);
				k--;
				search(res, temp, i + 1, n, k);
				k++;
				temp.remove(temp.size() - 1);
			}
		}
	}
}

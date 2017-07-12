package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月12日 下午11:57:01 LeetCode com.hilbert25.leetcode
 *          Solution_118
 */
public class Solution_118 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param numRows
	 * @return
	 */
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> res = new ArrayList<List<Integer>>(numRows);
		if (numRows == 0)
			return res;
		List<Integer> temp = new ArrayList<Integer>(1);
		temp.add(1);
		res.add(temp);
		for (int i = 1; i < numRows; i++) {
			List<Integer> list = new ArrayList<Integer>(i + 1);
			list.add(1);
			for (int j = 1; j < i; j++) {
				list.add(res.get(i - 1).get(j) + res.get(i - 1).get(j - 1));
			}
			list.add(1);
			res.add(list);
		}
		return res;
	}
}

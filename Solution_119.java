package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月13日 上午12:07:02 LeetCode com.hilbert25.leetcode
 *          Solution_119
 */
public class Solution_119 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param rowIndex
	 * @return
	 */
	public List<Integer> getRow(int rowIndex) {
		List<Integer> res = new ArrayList<Integer>();
		if (rowIndex == 0)
			return res;
		Integer[] temp = new Integer[rowIndex + 1];
		Arrays.fill(temp, 1);
		for (int i = 1; i <= rowIndex; i++) {
			for (int j = i - 1; j > 0; j--) {
				temp[j] += temp[j - 1];
			}
		}
		res = Arrays.asList(temp);
		return res;
	}
}

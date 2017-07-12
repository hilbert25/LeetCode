package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午10:25:23 LeetCode com.hilbert25.leetcode
 *          Solution_52
 */
public class Solution_52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int totalNQueens(int n) {
		if (n <= 1) {
			return 1;
		}
		boolean[] col = new boolean[n];
		boolean[] left = new boolean[2 * n - 1];
		boolean[] right = new boolean[2 * n - 1];
		return search(0, col, left, right, 0, n);
	}

	public static int search(int count, boolean[] col, boolean[] left, boolean[] right, int cur, int n) {
		if (cur == n) {
			count++;
			return count;
		}
		for (int i = 0; i < n; i++) {
			if (!col[i] && !left[cur - i + n - 1] && !right[cur + i]) {
				col[i] = left[cur - i + n - 1] = right[cur + i] = true;
				cur++;
				count = search(count, col, left, right, cur, n);
				cur--;
				col[i] = left[cur - i + n - 1] = right[cur + i] = false;
			}
		}
		return count;
	}
}

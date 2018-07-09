package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午7:54:32 LeetCode com.hilbert25.leetcode
 *          Solution_51
 */
public class Solution_51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solveNQueens(4);
	}

	public static List<List<String>> solveNQueens(int n) {
		List<List<String>> res = new ArrayList<List<String>>();
		if (n == 0) {
			res.add(new ArrayList<String>());
			return res;
		}
		BitSet col = new BitSet(n);
		BitSet left = new BitSet(2 * n - 1);
		BitSet right = new BitSet(2 * n - 1);
		List<String> temp = new ArrayList<String>(n);
		search(res, temp, col, left, right, 0, n);
		return res;
	}

	public static void search(List<List<String>> res, List<String> temp, BitSet col, BitSet left, BitSet right, int cur,
			int n) {
		if (cur == n) {
			res.add(new ArrayList<>(temp));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (!col.get(i) && !left.get(cur - i + n - 1) && !right.get(cur + i)) {
				char[] cArr = new char[n];
				Arrays.fill(cArr, '.');
				cArr[i] = 'Q';
				temp.add(String.copyValueOf(cArr));
				col.set(i, true);
				left.set(cur - i + n - 1, true);
				right.set(cur + i, true);
				cur++;
				search(res, temp, col, left, right, cur, n);
				cur--;
				col.set(i, false);
				left.set(cur - i + n - 1, false);
				right.set(cur + i, false);
				temp.remove(cur);
			}
		}
	}
}

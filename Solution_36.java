package com.hilbert25.leetcode;

import java.util.BitSet;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 上午11:33:40 LeetCode com.hilbert25.leetcode
 *          Solution_36
 */
public class Solution_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValidSudoku(char[][] board) {
		BitSet set = new BitSet(9);
		for (int i = 0; i < 9; i++) {
			set.clear();
			int endm = 3 * (i / 3) + 3;
			int endn = 3 * (i % 3) + 3;
			for (int m = 3 * (i / 3); m < endm; m++) {
				for (int n = 3 * (i % 3); n < endn; n++) {
					if (board[m][n] != '.') {
						if (set.get(board[m][n] - '1'))
							return false;
						else
							set.set(board[m][n] - '1');
					}
				}
			}
			set.clear();
			for (int j = 0; j < 9; j++) {
				if (board[i][j] != '.') {
					if (set.get(board[i][j] - '1'))
						return false;
					else
						set.set(board[i][j] - '1');
				}
			}
			set.clear();
			for (int j = 0; j < 9; j++) {
				if (board[j][i] != '.') {
					if (set.get(board[j][i] - '1'))
						return false;
					else
						set.set(board[j][i] - '1');
				}
			}
		}
		return true;
	}
}

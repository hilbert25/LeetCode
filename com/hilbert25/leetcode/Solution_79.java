package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月19日 下午7:28:43 LeetCode com.hilbert25.leetcode
 *          Solution_79
 */
public class Solution_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][] { { 'C', 'A', 'A' }, { 'A', 'A', 'A' }, { 'B', 'C', 'D' } };
		String word = "AAB";
		System.out.println(exist(board, word));
	}

	public static boolean exist(char[][] board, String word) {
		if (word.length() > board.length * board[0].length)
			return false;
		int cur = 0;
		boolean[][] visited = new boolean[board.length][board[0].length];
		for (int i = 0; i < board.length; i++)
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0) && search(board, visited, cur, word, i, j)) {
					return true;
				}
			}
		return false;
	}

	public static boolean search(char[][] matrix, boolean[][] visited, int cur, String s, int i, int j) {
		if (cur == s.length() - 1)
			return true;
		visited[i][j] = true;
		cur++;
		if (i > 0 && matrix[i - 1][j] == s.charAt(cur) && !visited[i - 1][j]
				&& search(matrix, visited, cur, s, i - 1, j)) {// up
			return true;
		}
		if (i < matrix.length - 1 && matrix[i + 1][j] == s.charAt(cur) && !visited[i + 1][j]
				&& search(matrix, visited, cur, s, i + 1, j)) {// down
			return true;
		}
		if (j > 0 && matrix[i][j - 1] == s.charAt(cur) && !visited[i][j - 1]
				&& search(matrix, visited, cur, s, i, j - 1)) {// left
			return true;
		}
		if (j < matrix[0].length - 1 && matrix[i][j + 1] == s.charAt(cur) && !visited[i][j + 1]
				&& search(matrix, visited, cur, s, i, j + 1)) {// right
			return true;
		}
		cur--;
		visited[i][j] = false;
		return false;
	}
}

package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月19日 上午12:16:53 LeetCode com.hilbert25.leetcode
 *          Solution_130
 */
public class Solution_130 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * 
	 * @ClassName: Loc
	 * 
	 * @Description: TODO
	 * 
	 * @author: hilbert25
	 * 
	 * @date: 2017年5月19日 上午12:39:48
	 * 
	 * 
	 */
	public class Loc {
		int x;
		int y;

		public Loc(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

	/**
	 * @param board
	 */
	public void solve(char[][] board) {
		for (int i = 1; i < board.length - 1; i++) {
			for (int j = 1; j < board[0].length - 1; j++) {
				if (board[i][j] == 'O') {
					List<Loc> locationList = new ArrayList<>();
					boolean[][] visited = new boolean[board.length][board[0].length];
					if (dfs(locationList, board, visited, i, j, true)) {
						for (Loc loc : locationList) {
							board[loc.x][loc.y] = 'X';
						}
					}
				}
			}
		}
	}

	/**
	 * @param locationList
	 * @param board
	 * @param x
	 * @param y
	 * @return
	 */
	public boolean dfs(List<Loc> locationList, char[][] board, boolean[][] visited, int x, int y, boolean legal) {
		if (visited[x][y] == true || board[x][y] == 'X')
			return true;
		if (x == 0 || y == 0 || x == board.length - 1 || y == board[0].length - 1) {
			legal = false;
		} else {
			locationList.add(new Loc(x, y));
		}
		visited[x][y] = true;
		if (x > 0) {// up
			legal &= dfs(locationList, board, visited, x - 1, y, legal);
		}
		if (x < board.length - 1) {// down
			legal &= dfs(locationList, board, visited, x + 1, y, legal);
		}
		if (y > 0) {// left
			legal &= dfs(locationList, board, visited, x, y - 1, legal);
		}
		if (y < board[0].length - 1) {// right
			legal &= dfs(locationList, board, visited, x, y + 1, legal);
		}
		return legal;
	}
}

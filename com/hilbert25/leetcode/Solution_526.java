package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月9日 下午6:48:03 LeetCode com.hilbert25.leetcode
 *          Solution_526
 */
public class Solution_526 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countArrangement(3));
	}

	/**
	 * @param N
	 * @return
	 */
	public static int countArrangement(int N) {
		return arrangement(1, new boolean[N + 1], 0);
		//数组长N+1为了方便从1开始计算
		
	}

	/**
	 * @param cur
	 *            已经算了几个数
	 * @param visited
	 * @param count
	 */
	public static int arrangement(int cur, boolean[] visited, int count) {
		if (cur > visited.length - 1) {
			count++;//已经计算的超过了N个说明都计算过了，那么count+1
			return count;
		}
		for (int i = 1; i <= visited.length - 1; i++) {
			if (!visited[i] && (i % cur == 0 || cur % i == 0)) {
				visited[i] = true;
				count = arrangement(cur+1, visited, count);
				visited[i] = false;
			}
		}
		return count;
	}
}

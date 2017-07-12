package com.hilbert25.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月29日 下午3:06:15 LeetCode com.hilbert25.leetcode
 *          Solution_403
 */
public class Solution_403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canCross(new int[] { 0, 1, 3, 4, 5, 7, 9, 10, 12 }));

	}

	public static boolean canCross(int[] stones) {
		int n = stones.length;
		if (stones[1] != 1) {
			return false;
		}
		if (n == 2) {
			if (stones[1] == 1)
				return true;
			else
				return false;
		}
		int last = stones[n - 1];
		HashSet<Integer> hs = new HashSet();
		for (int i = 0; i < n; i++) {
			if (i > 3 && stones[i] > stones[i - 1] * 2) {
				return false;
			} // The two stones are too far away.
			hs.add(stones[i]);
		}
		return canReach(hs, last, 1, 1);
	}

	private static boolean canReach(HashSet<Integer> hs, int last, int pos, int jump) {
		if (pos + jump - 1 == last || pos + jump == last || pos + jump + 1 == last) {
			return true;
		}
		if (hs.contains(pos + jump + 1)) {
			if (canReach(hs, last, pos + jump + 1, jump + 1)) {
				return true;
			}
		}
		if (hs.contains(pos + jump)) {
			if (canReach(hs, last, pos + jump, jump)) {
				return true;
			}
		}
		if (jump > 1 && hs.contains(pos + jump - 1)) {
			if (canReach(hs, last, pos + jump - 1, jump - 1)) {
				return true;
			}
		}
		return false;
	}
}

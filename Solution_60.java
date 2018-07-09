package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月18日 上午12:09:57 LeetCode com.hilbert25.leetcode
 *          Solution_60
 */
public class Solution_60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPermutation(3, 2));
	}

	public static String getPermutation(int n, int k) {
		int[] total = { 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i <= n; i++)
			list.add(i);
		String res = "";
		while (n > 0) {
			int curTotal = total[n];
			int p = curTotal / n;
			int index = (int) Math.ceil((float) k / p);
			res += String.valueOf(list.get(index));
			list.remove(index);
			k -= (index - 1) * p;
			n--;
		}
		return res;
	}
}

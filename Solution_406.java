package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CountedCompleter;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月29日 上午11:20:57 LeetCode com.hilbert25.leetcode
 *          Solution_406
 */
public class Solution_406 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] people = new int[][] { { 7, 0 }, { 4, 4 }, { 7, 1 }, { 5, 0 }, { 6, 1 }, { 5, 2 } };
		reconstructQueue(people);
	}

	public static int[][] reconstructQueue(int[][] people) {
		if (people == null || people.length == 0 || people[0].length == 0)
			return new int[0][0];

		Arrays.sort(people, new Comparator<int[]>() {
			public int compare(int[] a, int[] b) {
				if (b[0] == a[0])
					return a[1] - b[1];
				return b[0] - a[0];
			}
		});

		int n = people.length;
		ArrayList<int[]> tmp = new ArrayList<>();
		for (int i = 0; i < n; i++)
			tmp.add(people[i][1], new int[] { people[i][0], people[i][1] });

		int[][] res = new int[people.length][2];
		int i = 0;
		for (int[] k : tmp) {
			res[i][0] = k[0];
			res[i][1] = k[1];
			i++;
		}

		return res;
	}
}

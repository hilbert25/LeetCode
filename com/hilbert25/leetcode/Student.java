package com.hilbert25.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月17日 下午9:10:44 LeetCode com.hilbert25.leetcode Student
 */
public class Student {
	public static class Stu implements Comparable<Stu> {
		int id;
		int math;
		int chinese;
		int english;
		int total;

		public Stu(int id, int math, int chinese, int english) {
			super();
			this.id = id;
			this.math = math;
			this.chinese = chinese;
			this.english = english;
			this.total = math + chinese + english;
		}

		@Override
		public int compareTo(Stu o) {
			// TODO Auto-generated method stub
			if (this.total > o.total)
				return -1;
			else if (this.total < o.total)
				return 1;
			else {
				if (this.chinese > o.chinese)
					return -1;
				else if (this.chinese < o.chinese)
					return 1;
				else {
					if (this.id < o.id)
						return 1;
					else
						return -1;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(insertStr("abcda", "12"));
	}

	public static String insertStr(String str, String subStr) {
		char[] cArr = str.toCharArray();
		int max = 0;
		for (int i = 1; i < cArr.length; i++) {
			if (cArr[i] - cArr[max] > 0)
				max = i;
		}
		String head = str.substring(0, max + 1);
		String tail = str.substring(max+1, str.length());
		return head + subStr + tail;
	}

	public static boolean par(int n) {
		String s = String.valueOf(n);
		char[] cArr = s.toCharArray();
		int left = 0;
		int right = 0;
		if (cArr.length % 2 == 1) {
			left = cArr.length / 2;
			right = left;
		} else {
			left = (cArr.length - 1) / 2;
			right = cArr.length / 2;
		}
		while (left >= 0) {
			if (cArr[left] != cArr[right])
				return false;
			else {
				left--;
				right++;
			}
		}
		return true;
	}

	public static int climb(int n) {
		if (n == 1)
			return 1;
		if (n == 2)
			return 2;
		if (n == 3)
			return 4;
		else
			return climb(n - 1) + climb(n - 2) + climb(n - 3);
	}

	//// 7 3 8 8 1 0 2 7 4 4 4 5 2 6 5
	public static void maxRoad(int[][] matrix, int n) {
		int[][] road = new int[n][n];
		road[0][0] = matrix[0][0];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < n; i++)
			for (int j = 0; j <= i; j++) {
				int t = Integer.MIN_VALUE;
				if (j <= i && j > 0)// left
					t = road[i - 1][j - 1];
				if (j < i && t < road[i - 1][j])// right
					t = road[i - 1][j];
				road[i][j] = matrix[i][j] + t;
				if (max < road[i][j])
					max = road[i][j];
			}
		for (int i = 0; i < n; i++) {
			System.out.println();
			for (int j = 0; j < 5; j++)
				if (road[i][j] != 0)
					System.out.printf("%4d", road[i][j]);
		}
	}

	public static void cal(String s) {
		char[] cArray = s.toCharArray();
		int[] num = new int[10];
		for (char c : cArray) {
			if (c >= '0' && c <= '9') {
				num[c - '0']++;
			}
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] != 0)
				System.out.println(i + ":" + num[i]);
		}

	}
}

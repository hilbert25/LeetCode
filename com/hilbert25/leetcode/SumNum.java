package com.hilbert25.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月16日 下午7:32:35 LeetCode com.hilbert25.leetcode SumNum
 */
public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = { 1, 2, 3, 4 };
		System.out.println(counNum(num));
	}

	public static int counNum(int[] num) {
		int count = 0;
		Arrays.sort(num);
		for (int i = num.length - 1; i >= 0; i--)
			for (int j = i - 1; j >= 0; j--) {
				if (binarySearch(num, 0, j - 1, num[i] - num[j]) != -1) {
					count++;
				}
			}
		return count;
	}

	public static int binarySearch(int[] num, int low, int high, int target) {
		if (high < low)
			return -1;
		else {
			int middle = (low + high) / 2;
			if (num[middle] < target) {
				return binarySearch(num, middle + 1, high, target);
			} else if (num[middle] > target) {
				return binarySearch(num, low, middle - 1, target);
			} else {
				return middle;
			}
		}
	}
}

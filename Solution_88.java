package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月2日 下午3:34:05 LeetCode com.hilbert25.leetcode Solution_88
 */
public class Solution_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		while (n > 0)
			nums1[m + n - 1] = (m == 0 || nums1[m - 1] < nums2[n - 1] ? nums2[--n] : nums1[--m]);
	}
}

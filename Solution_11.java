package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月20日 下午12:59:45 LeetCode com.hilbert25.leetcode
 *          Solution_11
 */
public class Solution_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxArea(int[] height) {
		int area = 0;
		int begin = 0, end = height.length - 1;
		while (begin < end) {
			int tempArea = (end - begin) * Math.min(height[begin], height[end]);
			area = Math.max(tempArea, area);
			if (height[begin] < height[end])
				begin++;
			else
				end--;
		}
		return area;
	}
}

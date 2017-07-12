package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月2日 下午4:24:32 LeetCode com.hilbert25.leetcode Solution_84
 */
public class Solution_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int largestRectangleArea(int[] heights) {
		int maxArea = 0;
		int height = heights[heights.length - 1];
		int[] minHeight = new int[heights.length];
		for (int i = heights.length - 1; i >= 0; i--) {
			height = Math.min(height, heights[i]);
			minHeight[i] = height;
		}
		return maxArea;
	}
}

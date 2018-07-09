package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年6月2日 下午6:51:31 LeetCode com.hilbert25.leetcode
 *          Solution_152
 */
public class Solution_152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	/**
	 * @param nums
	 * @return
	 */
	public int maxProduct(int[] nums) {
		int[] currentProduct = new int[nums.length + 1];
		int currentMinPositive = 1;
		int currentMaxNegative = 1;
		int max = nums[0];
		currentProduct[0] = 1;
		for (int i = 1; i < currentProduct.length; i++) {
			if (currentProduct[i - 1] != 0) {
				currentProduct[i] = nums[i - 1] * currentProduct[i - 1];
			} else {
				currentProduct[i] = nums[i - 1];
				currentMaxNegative = -1;
				currentMinPositive = 1;
			}
			if (currentProduct[i] > 0) {
				max = Math.max(max, currentProduct[i] / currentMinPositive);
				currentMinPositive = Math.min(currentMinPositive, currentProduct[i]);
			} else if (currentProduct[i] < 0) {
				max = Math.max(max, currentProduct[i] / currentMaxNegative);
				currentMaxNegative = Math.max(currentMaxNegative, currentProduct[i]);
			}
		}
		return max;
	}
}

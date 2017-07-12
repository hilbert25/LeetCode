package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月22日 上午12:27:11 LeetCode com.hilbert25.leetcode
 *          Solution_416
 */
public class Solution_416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(canPartition(new int[] { 19, 33, 38, 60, 81, 49, 13, 61, 50, 73, 60, 82, 73, 29, 65, 62, 53,
				29, 53, 86, 16, 83, 52, 67, 41, 53, 18, 48, 32, 35, 51, 72, 22, 22, 76, 97, 68, 88, 64, 19, 76, 66, 45,
				29, 95, 24, 95, 29, 95, 76, 65, 35, 24, 85, 95, 87, 64, 97, 75, 88, 88, 65, 43, 79, 6, 5, 70, 51, 73,
				87, 76, 68, 56, 57, 69, 77, 22, 27, 29, 12, 55, 58, 18, 30, 66, 53, 53, 81, 94, 76, 28, 41, 77, 17, 60,
				32, 62, 62, 88, 61 }));
	}

	public static boolean canPartition(int[] nums) {
		int bitset = 1;
		int sum = 0;
		for (int i : nums) {
			sum += i;
			bitset |= bitset << i;
		}
		return (sum & 1) == 0 && ((bitset >> (sum / 2 - 1)) & 1) == 1;
	}

}

package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月5日 下午10:50:23 LeetCode com.hilbert25.leetcode
 *          Solution_398
 */
public class Solution_398 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println(ran.nextInt(10));
	}

	int[] nums;

	public Solution_398(int[] nums) {
		this.nums = nums;
	}

//	public int pick(int target) {
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < nums.length; i++)
//			if (nums[i] == target)
//				list.add(i);
//		Random ran = new Random();
//		return list.get(ran.nextInt(list.size()));
//	}
	public int pick(int target) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < nums.length; i++)
			if (nums[i] == target)
				return i;
		Random ran = new Random();
		return list.get(ran.nextInt(list.size()));
	}
}

package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月7日 下午11:28:53 LeetCode com.hilbert25.leetcode
 *          Solution_401
 */
public class Solution_401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = readBinaryWatch(8);
		for (String s : l)
			System.out.println(s);
	}

//	public static List<String> readBinaryWatch(int num) {
//		int[] count = new int[60];
//		for (int i = 0; i < 60; i++)
//			count[i] = Integer.bitCount(i);
//		List<String> list = new ArrayList<String>();
//		if (num < 0)
//			return list;
//		for (int h = 0; h < 12; h++) {
//			for (int m = 0; m < 60; m++) {
//				if (count[h] + count[m] == num) {
//					list.add(String.format("%d:%02d", h, m));
//				}
//			}
//		}
//		return list;
//	}
	public static List<String> readBinaryWatch(int num) {
		List<String> time = new ArrayList<String>();
		int[] nums = new int[6];
		for (int i = 0; i <= num; i++) {
			List<String> hour = new ArrayList<String>();
			List<String> minute = new ArrayList<String>();
			if (i <= 4 && num - i <= 6) {
				hour = search(nums, i, 0, 11, hour);
				minute = search(nums, num - i, 0, 59, minute);
			}
			for (String h : hour) {
				for (String m : minute) {
					if (Integer.valueOf(m) < 10)
						time.add(h + ":0" + m);
					else
						time.add(h + ":" + m);
				}
			}
		}
		return time;
	}

	public static List<String> search(int nums[], int deep, int cur, int max, List<String> time) {
		// max=11 hour,max=59 minute
		if (deep == 0) {
			int val = 1;
			int result = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1) {
					result += val;
				}
				val = val << 1;
			}
			time.add(String.valueOf(result));
			return time;
		}
		for (int i = cur; i < nums.length; i++) {
			nums[i] = 1;
			deep--;
			time = search(nums, deep, i + 1, max, time);
			if (time.size() >= 1 && Integer.valueOf(time.get(time.size() - 1)) > max) {
				time.remove(time.size() - 1);
				deep++;
				nums[i] = 0;
				break;
			}
			deep++;
			nums[i] = 0;
		}
		return time;
	}
}

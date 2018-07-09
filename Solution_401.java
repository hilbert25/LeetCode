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
//			count[i] = Integer.bitCount(i);//计算二进制的i中有多少个1
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
	/**
	 * 计算num个灯可以表示多少种时刻
	 * @param num 灯的数量
	 * @return List<String>
	 */
	public static List<String> readBinaryWatch(int num) {
		List<String> time = new ArrayList<String>();//最终结果
		int[] nums = new int[6];//小时部分需要4个灯，分钟部分需要6个灯，取最大值
		for (int i = 0; i <= num; i++) {
			List<String> hour = new ArrayList<String>();
			List<String> minute = new ArrayList<String>();
			if (i <= 4 && num - i <= 6) {//如果小时部分灯的数量超过4或者分钟部分灯数超过6就剪枝
				hour = search(nums, i, 0, 11, hour);//二者分别进行回溯
				minute = search(nums, num - i, 0, 59, minute);
			}
			for (String h : hour) {//对两部分的结果进行整合
				for (String m : minute) {
					if (Integer.valueOf(m) < 10)//分钟部分如果小于10要补0
						time.add(h + ":0" + m);
					else
						time.add(h + ":" + m);
				}
			}
		}
		return time;
	}

	/**
	 * 回溯求解deep个灯可以表示多少种小时或者分钟
	 * @param nums 存储灯的数组
	 * @param deep 递归深度，表示还有几盏灯没计算
	 * @param cur  当前递归位置
	 * @param max  结果最大值，如果计算小时就是11分钟就是59
	 * @param time  存储结果的list
	 * @return
	 */
	public static List<String> search(int nums[], int deep, int cur, int max, List<String> time) {
		// max=11 hour,max=59 minute
		if (deep == 0) {//深度为0没有灯要计算就写入到time
			int val = 1;
			int result = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] == 1) {//灯亮着就把权值加到结果中
					result += val;
				}
				val = val << 1;//每次左移1位表示当前灯的权重，即1,2,4,8……
			}
			time.add(String.valueOf(result));
			return time;
		}
		for (int i = cur; i < nums.length; i++) {
			nums[i] = 1;//先把当前的灯对应的数组改为1
			deep--;//深度-1
			time = search(nums, deep, i + 1, max, time);//对下一位进行递归计算
			if (time.size() >= 1 && Integer.valueOf(time.get(time.size() - 1)) > max) {//如果上次计算的值比max大，那么没必要继续计算，就进行剪枝。
				time.remove(time.size() - 1);
				deep++;
				nums[i] = 0;
				break;
			}
			deep++;//回溯完毕恢复原来的环境
			nums[i] = 0;//同上
		}
		return time;
	}
}

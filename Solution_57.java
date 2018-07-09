package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hilbert25.leetcode.Solution_56.Interval;
import com.hilbert25.leetcode.Solution_56.IntervalsComparator;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月13日 下午11:07:34 LeetCode com.hilbert25.leetcode
 *          Solution_57
 */
public class Solution_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 5));
		list.add(new Interval(10, 11));
		list.add(new Interval(15, 2147483647));
		List<Interval> res = insert(list, new Interval(5, 7));
		for (Interval i : res)
			System.out.println(i.start + " " + i.end);
	}

	public static class Interval {
		int start;
		int end;

		Interval() {
			start = 0;
			end = 0;
		}

		Interval(int s, int e) {
			start = s;
			end = e;
		}
	}

	public static class IntervalsComparator implements Comparator<Interval> {

		@Override
		public int compare(Interval o1, Interval o2) {
			// TODO Auto-generated method stub
			return o1.start - o2.start == 0 ? o1.end - o2.end : o1.start - o2.start;
		}
	}

	public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
		List<Interval> res = new ArrayList<>();
		intervals.add(newInterval);
		Collections.sort(intervals, new IntervalsComparator());
		res.add(intervals.get(0));
		int l = intervals.size();
		for (int i = 1; i < l; i++) {
			if (intervals.get(i).start <= res.get(res.size() - 1).end) {
				res.get(res.size() - 1).end = Math.max(res.get(res.size() - 1).end, intervals.get(i).end);
			} else {
				res.add(intervals.get(i));
			}
		}
		return res;
	}
}

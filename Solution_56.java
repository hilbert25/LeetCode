package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.omg.CORBA.OMGVMCID;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月12日 下午4:55:13 LeetCode com.hilbert25.leetcode
 *          Solution_56
 */
public class Solution_56 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Interval> list = new ArrayList<>();
		list.add(new Interval(1, 3));
		list.add(new Interval(0, 6));
		list.add(new Interval(8, 10));
		list.add(new Interval(11, 13));
		List<Interval> res = merge(list);
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

	public static List<Interval> merge(List<Interval> intervals) {
		List<Interval> res = new ArrayList<>();
		if (intervals.size() == 0)
			return res;
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

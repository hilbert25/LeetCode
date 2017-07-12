package com.hilbert25.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月28日 下午3:51:31 LeetCode com.hilbert25.leetcode
 *          Solution_412
 */
public class Solution_412 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public List<String> fizzBuzz(int n) {
		List<String> res = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				res.add("FizzBuzz");
			} else if (i % 3 == 0) {
				res.add("Fizz");
			} else if (i % 5 == 0) {
				res.add("Buzz");
			} else {
				res.add(String.valueOf(i));
			}
		}
		return res;
	}
}

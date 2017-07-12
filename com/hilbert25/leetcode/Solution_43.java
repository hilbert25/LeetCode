package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月14日 下午1:03:30 LeetCode com.hilbert25.leetcode
 *          Solution_43
 */
public class Solution_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiply(String.valueOf(232), String.valueOf(452));
	}

	public static String multiply(String num1, String num2) {
		String res = "";
		int[] tempRes = new int[num1.length() + num2.length() - 1];
		int index = tempRes.length - 1;
		int carry = 0;
		for (int i = num2.length() - 1; i >= 0; i--) {
			int tempIndex=i;
			for (int j = num1.length() - 1; j >= 0; j--) {
				int t = (num1.charAt(j) - '0') * (num2.charAt(i) - '0') + carry;
				tempRes[index] = (tempRes[index]+t) % 10;
				carry = t / 10;
			}
		}
		return res;
	}

}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月26日 下午4:31:16 LeetCode com.hilbert25.leetcode
 *          Solution_537
 */
public class Solution_537 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.valueOf("-1"));
	}

	public class Complex {
		int real = 0;
		int img = 0;
		String str = "";

		public Complex(String str) {
			// TODO Auto-generated constructor stub
			this.str = str;
			real = Integer.valueOf(str.substring(0, str.indexOf("+")));
			img = Integer.valueOf(str.substring(str.indexOf("+") + 1, str.length() - 1));
		}

		public String multiplt(Complex com) {
			return String.valueOf(this.real * com.real - this.img * com.img) + "+"
					+ String.valueOf(this.real * com.img + this.img * com.real) + "i";
		}
	}

	public String complexNumberMultiply(String a, String b) {
		Complex comA = new Complex(a);
		Complex comB = new Complex(b);
		return comA.multiplt(comB);
	}
}

package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月28日 下午3:56:57 LeetCode com.hilbert25.leetcode
 *          Solution_344
 */
public class Solution_344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

	public String reverseString(String s) {
		char[] ch = s.toCharArray();
		int begin = 0, end = ch.length - 1;
		while (begin < end) {
			ch[begin] = (char) (ch[begin] ^ ch[end]);
			ch[end] = (char) (ch[begin] ^ ch[end]);
			ch[begin] = (char) (ch[begin] ^ ch[end]);
			begin++;
			end--;
		}
		return new String(ch);
	}
}

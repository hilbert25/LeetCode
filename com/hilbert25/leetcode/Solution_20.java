package com.hilbert25.leetcode;

import java.util.Stack;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月7日 上午10:08:58 LeetCode com.hilbert25.leetcode
 *          Solution_20
 */
public class Solution_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
		char[] cArr = s.toCharArray();
		Stack<Object> stack = new Stack<Object>();
		for (char ch : cArr) {
			switch (ch) {
			case '{':
				stack.push(ch);
				break;
			case '}':
				if (stack.isEmpty() || (char) stack.pop() != '{')
					return false;
				break;
			case '[':
				stack.push(ch);
				break;
			case ']':
				if (stack.isEmpty() || (char) stack.pop() != '[')
					return false;
				break;
			case '(':
				stack.push(ch);
				break;
			case ')':
				if (stack.isEmpty() || (char) stack.pop() != '(')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}
}

package com.hilbert25.leetcode;

import java.util.Random;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月5日 下午11:54:30 LeetCode com.hilbert25.leetcode
 *          Solution_382
 */
public class Solution_382 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ran = new Random();
		System.out.println(ran.nextInt(1));
	}

	ListNode head;
	Random ran;

	public Solution_382(ListNode head) {
		this.head = head;
		ran = new Random();
	}

	/** Returns a random node's value. */
	public int getRandom() {
		ListNode node = head;
		int current = 0;
		for (int i = 1; node != null; i++) {
			current = ran.nextInt(i) == 0 ? node.val : current;
			node=node.next;
		}
		return current;
	}
}

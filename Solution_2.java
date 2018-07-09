package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月19日 下午10:36:07 LeetCode com.hilbert25.leetcode
 *          Solution_2
 */
public class Solution_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	/**
	 * @param l1
	 * @param l2
	 * @return
	 */
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		int temp = l2.val + l1.val;
		l1 = l1.next;
		l2 = l2.next;
		ListNode res = new ListNode(temp % 10);
		int add = temp / 10;
		ListNode head = res;
		while (l1 != null && l2 != null) {
			temp = l1.val + l2.val + add;
			ListNode node = new ListNode(temp % 10);
			head.next = node;
			head = node;
			add = temp / 10;
			l1 = l1.next;
			l2 = l2.next;
		}
		while (l1 != null) {
			temp = l1.val + add;
			ListNode node = new ListNode(temp % 10);
			head.next = node;
			head = node;
			add = temp / 10;
			l1 = l1.next;
		}
		while (l2 != null) {
			temp = l2.val + add;
			ListNode node = new ListNode(temp % 10);
			head.next = node;
			head = node;
			add = temp / 10;
			l2 = l2.next;
		}
		if (add > 0) {
			ListNode node = new ListNode(add);
			head.next = node;
			head = node;
		}
		return res;
	}
}

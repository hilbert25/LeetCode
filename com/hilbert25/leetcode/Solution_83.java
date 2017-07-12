package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月18日 下午10:15:00 LeetCode com.hilbert25.leetcode
 *          Solution_83
 */
public class Solution_83 {

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

	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null)
			return head;
		ListNode a = head, b = head.next;
		while (b != null) {
			if (b.val == a.val)
				b = b.next;
			else {
				a.next = b;
				a = b;
				b = b.next;
			}
		}
		if (a.next != null)
			a.next = null;
		return head;
	}
}

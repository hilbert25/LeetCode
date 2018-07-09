package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年5月2日 下午1:46:32 LeetCode com.hilbert25.leetcode Solution_82
 */
public class Solution_82 {

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
		ListNode tempNode = new ListNode(0);
		tempNode.next = head;
		ListNode begin = tempNode;
		ListNode end = head;
		int curVal = end.val;
		while (end.next != null) {
			if (end.next.val == curVal) {
				while (end != null && end.val == curVal) {
					end = end.next;
				}
				begin.next = end;
				if (end != null)
					curVal = end.val;
				else
					return tempNode.next;
			} else {
				begin = end;
				end = end.next;
				curVal = end.val;
			}
		}
		return tempNode.next;
	}

}

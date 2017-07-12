package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月25日 下午11:58:21 LeetCode com.hilbert25.leetcode
 *          Solution_92
 */
public class Solution_92 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(3);
		ListNode node4 = new ListNode(4);
		ListNode node5 = new ListNode(5);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		reverseBetween(node1, 2, 4);
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode reverseBetween(ListNode head, int m, int n) {
		if (m >= n || head == null)
			return head;
		ListNode newHead = new ListNode(0);
		newHead.next = head;
		ListNode node = newHead;
		for (int i = 0; i < m - 1; i++) {
			node = node.next;
		}
		ListNode curHead = node;
		ListNode curTail = node.next;
		for (int i = m; i < n; i++) {
			ListNode curNode = curTail.next;
			curTail.next = curTail.next.next;
			curNode.next = curHead.next;
			curHead.next = curNode;
		}
		return newHead.next;
	}
}

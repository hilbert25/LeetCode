package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月3日 下午11:46:43 LeetCode com.hilbert25.leetcode
 *          Solution_61
 */
public class Solution_61 {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ListNode rotateRight(ListNode head, int k) {
        if(head==null)
            return null;
		ListNode node = head;
		ListNode tail = null;
		int n = 1;
		while (node.next != null) {
			node = node.next;
			n++;
		}
		tail = node;
		node = head;
		k = k % n;
		k = n - k;
		k--;
		while (k > 0) {
			node = node.next;
			k--;
		}
		if (node.next == null)
			return head;
		else {
			ListNode nextNode = node.next;
			tail.next = head;
			node.next = null;
			return nextNode;
		}
	}

}

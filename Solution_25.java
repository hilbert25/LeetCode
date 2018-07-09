package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年4月10日 下午10:33:55 LeetCode com.hilbert25.leetcode
 *          Solution_25
 */
public class Solution_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 3;
		ListNode[] nodeArr = new ListNode[count];
		for (int i = 0; i < count; i++)
			nodeArr[i] = new ListNode(i);
		for (int i = 0; i < count - 1; i++)
			nodeArr[i].next = nodeArr[i + 1];
		ListNode node = reverseKGroup(nodeArr[0], 3);
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}

	}

	public static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || head.next == null || k == 1)
			return head;
		ListNode res = new ListNode(-1);
		res.next = head;
		ListNode preTail = res;
		ListNode cur = head;
		ListNode curHead = head;
		ListNode curNext = head.next;
		ListNode curTail = head;
		ListNode test = head;
		while (test != null) {
			test = preTail.next;
			for (int i = 1; i < k; i++) {
				test = test.next;
				if (test == null)
					return res.next;
			}
			curHead = preTail.next;
			cur = curHead.next;
			curNext = cur.next;
			curTail = curHead;
			test = curHead;
			for (int i = 1; i < k; i++) {
				curTail.next = curNext;
				cur.next = curHead;
				preTail.next = cur;
				curHead = cur;
				cur = curNext;
				if (cur == null)
					return res.next;
				curNext = cur.next;
			}
			preTail = curTail;
		}
		return res.next;
	}
}

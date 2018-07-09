package com.hilbert25.leetcode;

/**
 * @author : hilbert25
 * @version 创建时间：2017年3月6日 下午3:38:36 LeetCode com.hilbert25.leetcode Solution_23
 */
public class Solution_23 {
	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode a_0 = new ListNode(1);
		ListNode b_0 = new ListNode(-2);
		ListNode c_0 = new ListNode(0);
		ListNode d_0 = new ListNode(2);
		ListNode[] lists = { a_0, b_0, c_0, d_0 };
		ListNode node = mergeKLists(lists);
		while (node != null) {
			System.out.println(node.val);
			node = node.next;
		}
	}

	/**链表合并
	 * @param lists
	 * @return
	 */
	public static ListNode mergeKLists(ListNode[] lists) {
		if (lists.length == 0)
			return null;
		if (lists.length == 1)
			return lists[0];
		ListNode head = new ListNode(0);
		ListNode resultList = head;
		int heapSize = 0;
		for (ListNode node : lists)
			if (node != null)
				heapSize++;
		lists = initHeap(lists, heapSize);
		while (heapSize > 0) {
			ListNode node = new ListNode(lists[0].val);
			head.next = node;
			head = head.next;
			if (lists[0].next == null) {
				lists[0] = lists[heapSize - 1];
				heapSize--;
				lists = minHeap(lists, 0, heapSize);
			} else {
				lists[0] = lists[0].next;
				lists = minHeap(lists, 0, heapSize);
				for (ListNode n : lists)
					System.out.print(n.val + ",");
				System.out.println();
			}
		}
		return resultList.next;
	}

	/** 初始化堆
	 * @param lists
	 * @param heapSize
	 * @return
	 */
	public static ListNode[] initHeap(ListNode[] lists, int heapSize) {
		for (int i = 0; i < lists.length; i++) {
			if (lists[i] == null) {
				for (int j = lists.length - 1; j > i; j--) {
					if (lists[j] != null) {
						lists[i] = lists[j];
						break;
					}
				}
			}
		}
		int l = (int) (Math.ceil(heapSize / 2) - 1);
		while (l >= 0) {
			lists = minHeap(lists, l, heapSize);
			l--;
		}
		return lists;
	}

	/**最小化堆
	 * @param lists
	 * @param l
	 * @param heapSize
	 * @return
	 */
	public static ListNode[] minHeap(ListNode[] lists, int l, int heapSize) {
		int min = 0;
		if (l * 2 + 1 > heapSize - 1) {
			return lists;
		} else if (l * 2 + 2 > heapSize - 1) {// only has right child
			min = l * 2 + 1;
		} else {// has left and right child
			if (lists[l * 2 + 2].val > lists[l * 2 + 1].val)
				min = l * 2 + 1;
			else
				min = l * 2 + 2;
		}
		if (lists[min].val < lists[l].val) {
			ListNode node = lists[min];
			lists[min] = lists[l];
			lists[l] = node;
			if (2 * min + 1 <= heapSize - 1)
				lists = minHeap(lists, min, heapSize);
		} else {
			return lists;
		}
		return lists;
	}
}

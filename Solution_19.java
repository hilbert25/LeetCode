
public class Soultion_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		ListNode node2 = new ListNode(2);
		head.next=node2;
		ListNode node = removeNthFromEnd(head, 1);
		System.out.println(node.val);
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode node1 = head, node2 = head;
		for (int i = 1; i <= n; i++) {
			node1 = node1.next;
			if (node1 == null)
				break;
		}
		if (node1 == null) {
			head = head.next;
			return head;
		}
		while (node1.next != null) {
			node1 = node1.next;
			node2 = node2.next;
		}
		node2.next = node2.next.next;
		return head;
	}
}

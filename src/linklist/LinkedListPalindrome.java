package linklist;

public class LinkedListPalindrome {

	public static void main(String[] args) {
		LinkListHelper ll = new LinkListHelper();

		Node head = null;
		head = ll.addNode(1, head);
		head = ll.addNode(2, head);
		head = ll.addNode(3, head);
		head = ll.addNode(4, head);
		head = ll.addNode(1, head);

		boolean result = isPalindrome(head);
		System.out.println(result);
	}

	private static boolean isPalindrome(Node head) {
		Node current = head;
		Node newHead = reverse(current);

		Node p1 = head;
		Node p2 = newHead;

		while (p1 != null) {
			if (p1.val != p2.val) {
				return false;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		return true;

	}

	private static Node reverse(Node head) {
		if (head == null) {
			return head;
		}
		Node prev = null;
		Node current = head;
		Node next;

		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		current = prev;
		return current;
	}

}

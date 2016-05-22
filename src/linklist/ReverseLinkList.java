package linklist;

public class ReverseLinkList extends LinkListHelper {

	public static void main(String[] args) {
		LinkListHelper ll = new LinkListHelper();
		Node head = null;
		head = ll.addNode(1, head);
		head = ll.addNode(2, head);
		head = ll.addNode(3, head);
		head = ll.addNode(2, head);
		head = ll.addNode(1, head);
	//	head = ll.addNode(6, head);
		ll.printList(head);
		System.out.println();

		head = reverseLinkList(head);
		ll.printList(head);
	}

	public static Node reverseLinkList(Node head) {
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
		head = prev;
		return head;

	}
}

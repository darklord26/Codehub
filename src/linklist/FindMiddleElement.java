package linklist;

public class FindMiddleElement extends LinkListHelper {

	public static void main(String[] args) {

		LinkListHelper ll = new LinkListHelper();

		Node head = null;
		head = ll.addNode(1, head);
		head = ll.addNode(2, head);
		head = ll.addNode(3, head);
		head = ll.addNode(4, head);
		head = ll.addNode(5, head);

		int result = middle(head);
		System.out.println(result);

	}

	public static int middle(Node head) {
		if (head == null || head.next == null) {
			return head.val;
		}
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.val;
	}

}

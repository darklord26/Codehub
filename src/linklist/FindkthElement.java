package linklist;

public class FindkthElement {

	/*
	 * Problem : Find kth element from the end We are given the head and k So
	 * first we will have to traverse once to see the end and also to set fast pointer one element after the kth elem
	 * Now traverse from fast to the end of list
	 * and move slow one step
	 * when fast reaches null, slow.val will be the answer
	 */

	public static void main(String[] args) {
		LinkListHelper ll = new LinkListHelper();

		Node head = null;
		head = ll.addNode(1, head);
		head = ll.addNode(2, head);
		head = ll.addNode(3, head);
		head = ll.addNode(4, head);
		head = ll.addNode(5, head);
		head = ll.addNode(6, head);
		int k = 4;

		int result = kthElement(head, k);
		System.out.println(result);
	}

	static int kthElement(Node head, int k) {
		if (head == null) {
			return head.val;
		}
		Node fast = head;
		Node slow = head;

		while (k > 1) {
			fast = fast.next;
			k--;
		}

		while (fast.next!= null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.val;

	}

}

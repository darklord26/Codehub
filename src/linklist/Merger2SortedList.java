package linklist;

public class Merger2SortedList extends LinkListHelper {

	public static void main(String[] args) {
		LinkListHelper ll = new LinkListHelper();

		Node head1 = null;
		head1 = ll.addNode(1, head1);
		head1 = ll.addNode(3, head1);
		head1 = ll.addNode(30, head1);
		head1 = ll.addNode(90, head1);
		head1 = ll.addNode(120, head1);
		head1 = ll.addNode(240, head1);
		head1 = ll.addNode(243, head1);
		head1 = ll.addNode(251, head1);
		head1 = ll.addNode(511, head1);
		Node head2 = null;
		head2 = ll.addNode(0, head2);
		head2 = ll.addNode(3, head2);
		head2 = ll.addNode(12, head2);
		head2 = ll.addNode(32, head2);
		head2 = ll.addNode(90, head2);
		head2 = ll.addNode(125, head2);
		head2 = ll.addNode(240, head2);
		head2 = ll.addNode(249, head2);
		head2 = ll.addNode(251, head2);
		head2 = ll.addNode(260, head2);

		Merger2SortedList mls = new Merger2SortedList();
		Node result = mls.mergeList(head1, head2);
		ll.printList(result);
	}

	public Node mergeList(Node l1, Node l2) {
		Node dummyHead = new Node();
		Node p = dummyHead;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				p.next = l1;
				l1 = l1.next;
			} else {
				dummyHead.next = l2;
				l2 = l2.next;
			}
			p = p.next;
		}
		if(l1 != null)
			p.next = l1;
		if(l2!=null){
			p.next = l2;
		}
		return dummyHead.next;
	}

}

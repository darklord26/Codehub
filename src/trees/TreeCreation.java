package trees;

public class TreeCreation {
	Node root;
	public Node addNode(int data, Node head) {
		Node tempHead = head;
		Node n = Node.newNode(data);
		if (head == null) {
			head = n;
			return head;
		}
		Node prev = null;
		while (head != null) {
			prev = head;
			if (head.data < data) {
				head = head.right;
			} else {
				head = head.left;
			}
		}
		if (prev.data < data) {
			prev.right = n;
		} else {
			prev.left = n;
		}
		return tempHead;
	}

	public void printTree(Node root) {
		if (root == null) {
			return;
		} else {
			printTree(root.left);
			System.out.print(" " + root.data);
			printTree(root.right);

		}
	}
}
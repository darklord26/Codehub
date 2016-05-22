package trees;

public class BST extends TreeCreation {
	Node root;

	public static void main(String[] args) {
		BST bt = new BST();
		Node root = null;
		root = bt.addNode(10, root);
		root = bt.addNode(25, root);
		root = bt.addNode(-10, root);
		root = bt.addNode(0, root);
		root = bt.addNode(-20, root);
		root = bt.addNode(15, root);
		root = bt.addNode(18, root);
		root = bt.addNode(35, root);

	}

	public boolean isBST(Node root) {

		boolean result = checkBST(root, null, null);
		System.out.println(result);
		if (result) {
			return true;
		}
		return false;

	}

	public static boolean checkBST(Node root, Integer min, Integer max) {
		if (root == null) {
			return true;
		}
		if (root.data <= min || root.data > max) {
			return false;
		}
		return checkBST(root.left, min, root.data) && checkBST(root.right, root.data, max);
	}

}

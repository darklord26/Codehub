package trees;

public class BST_Search extends TreeCreation {

	public static void main(String[] args) {
		TreeCreation bt = new TreeCreation();

		Node root = null;
		root = bt.addNode(10, root);
		root = bt.addNode(20, root);
		root = bt.addNode(-10, root);
		root = bt.addNode(15, root);
		root = bt.addNode(0, root);
		root = bt.addNode(21, root);
		root = bt.addNode(-1, root);
		// bt.printTree(root);

		BST_Search bstSearch = new BST_Search();
		Node result = bstSearch.search(root, 21);
		System.out.println(result.data);
	}

	private Node search(Node root, int key) {
		if (root == null) {
			return null;
		}
		if (root.data == key) {
			return root;
		}
		if (key > root.data) {
			Node res = search(root.right, key);
			return res;
		} else {
			Node res = search(root.left, key);
			return res;
		}
	}

}

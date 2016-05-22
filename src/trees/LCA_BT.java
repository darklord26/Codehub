package trees;

public class LCA_BT {

	public static void main(String[] args) {
		TreeCreation bt = new TreeCreation();
		Node root = null;
		root = bt.addNode(10, root);
		root = bt.addNode(20, root);
		root = bt.addNode(30, root);
		root = bt.addNode(15, root);
		root = bt.addNode(-10, root);
		root = bt.addNode(0, root);
		root = bt.addNode(5, root);
		root = bt.addNode(-5, root);
		root = bt.addNode(-15, root);
		root = bt.addNode(27, root);
		root = bt.addNode(35, root);
		//lca(root,10,20);

	}
	
	public static Node lca(Node root, Node n1, Node n2){
        if(root == null){
            return null;
        }
        if(root == n1 || root == n2){
            return root;
        }
        
        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if(left != null && right != null){
            return root;
        }
        return left != null ? left : right;
    }

}

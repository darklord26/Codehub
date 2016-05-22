package trees;

public class LCABST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public Node lowestCommonAncestor(Node root, int p, int q) {
	        if (root.data > Math.max(p, q)) {
	            return lowestCommonAncestor(root.left, p, q);
	        } else if (root.data < Math.min(p, q)) {
	            return lowestCommonAncestor(root.right, p, q);
	        } else {
	            return root;
	        }
	    }

}

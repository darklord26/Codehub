package trees;

public class Node {

	Node left;
	Node right;
	int data;

	 public static Node newNode(int data){
	        Node n = new Node();
	        n.left = null;
	        n.right = null;
	        n.data = data;
	        return n;
	    }
}

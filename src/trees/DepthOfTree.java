package trees;

public class DepthOfTree extends TreeCreation {
	Node root;
	public static void main(String[] args) {
		DepthOfTree bt = new DepthOfTree();

		Node root = null;
		root = bt.addNode(10, root);
		root = bt.addNode(25, root);
		root = bt.addNode(-10, root);
		root = bt.addNode(0, root);
		root = bt.addNode(-20, root);
		root = bt.addNode(15, root);
		root = bt.addNode(18, root);
		root = bt.addNode(35, root);
		
		int maxHeight = bt.maxDepth(root);
		int minHeight = bt.minDepth(root);
		
		System.out.println(maxHeight);
		System.out.println(minHeight);
		
	}
	
	public int maxDepth (Node root){
		if(root == null){
			System.out.println("The current root is:" + root);
			return 0;
		}
		int left = maxDepth(root.left);
		System.out.println("The current left is:" + left);
		int right = maxDepth(root.right);
		System.out.println("The current right is:" + right);
		
		return 1 + Math.max(left, right) ;		
	}
	
	public int minDepth (Node root){
		if(root == null){
			System.out.println("The current root is:" + root);
			return 0;
		}
		int left = minDepth(root.left);
		System.out.println("The current left is:" + left);
		int right = minDepth(root.right);
		System.out.println("The current right is:" + right);
		
		return 1 + Math.min(left, right) ;		
	}
	

}

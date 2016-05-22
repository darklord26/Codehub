package trees;

import java.util.ArrayList;
import java.util.List;

/*
 * Check if root is null
 * if not, traverse to left of root and right of root. On each level of traversal, reduce the sum by the current node's value
 * Check if we have reached the last level i.e. leaf node.
 * Here, check if the value of sum is equal to the leaf node value. If yes, return true
 * Use a list to track the route
 */
public class Root2LeafSum {

	public static void main(String[] args) {
		TreeCreation bt = new TreeCreation();

		Node head = null;
		head = bt.addNode(10, head);
        head = bt.addNode(15, head);
        head = bt.addNode(5, head);
        head = bt.addNode(7, head);
        head = bt.addNode(19, head);
        head = bt.addNode(20, head);
        head = bt.addNode(4, head);
        head = bt.addNode(3, head);
        bt.printTree(head);
		int sum = 19;
		List<Node> result = new ArrayList<>();
		boolean res = findPath(head, sum, result);
		if (res) {
			result.forEach(node -> System.out.print(node.data + " "));
		}
		else{
            System.out.println("No path for sum " + sum); 
        }
	}

	static boolean findPath(Node root, int sum, List<Node> path) {
		if(root == null){
			return false;
		}		
		if(findPath(root.left,sum-root.data,path)){	
			path.add(root);
			// return true;
		}
		if(findPath(root.right,sum-root.data,path)){
			path.add(root);
			// return true;
		}
				
		if(root.left == null && root.right == null){
			if(root.data == sum){
				return true;
			}
			else{
				return false;
			}
		}
		return false;
	}

}

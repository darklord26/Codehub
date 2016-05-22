package trees;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Use one queue with delimiter. Add a delimiter null after every level.
 * As soon as you encounter a null print a new line and add null at end of queue
 */

public class Level_By_Level {

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
		levelByLevelOneQueueUsingDelimiter(root);
	}

	static void levelByLevelOneQueueUsingDelimiter(Node root) {
		if (root == null) {
			return;
		}
		  Queue<Node> q = new LinkedList<Node>();
	        q.offer(root);
	        q.offer(null);
	        while (!q.isEmpty()) {
	            root = q.poll();
	            if (root != null) {
	                System.out.print(root.data + " ");
	                if (root.left != null) {
	                    q.offer(root.left);
	                }
	                if (root.right != null) {
	                    q.offer(root.right);
	                }
	            } else {
	                if (!q.isEmpty()) {
	                    System.out.println();
	                    q.offer(null);
	                }
	            }
	        }
	}

}

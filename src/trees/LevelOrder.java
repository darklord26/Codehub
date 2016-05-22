package trees;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Add root to queue
 * Now poll the queue and check if the root has left and right
 * If yes, then add left or right to the queue and print the polled element
 * Continue iteratively and return the root
 */
public class LevelOrder extends TreeCreation{

	public static void main(String[] args) {
		LevelOrder loi = new LevelOrder();
        TreeCreation bt = new TreeCreation();
        Node head = null;
        head = bt.addNode(10, head);
        head = bt.addNode(15, head);
        head = bt.addNode(5, head);
        head = bt.addNode(7, head);
        head = bt.addNode(19, head);
        head = bt.addNode(20, head);
        head = bt.addNode(-1, head);
        loi.levelOrder(head);
	}
	
	static void levelOrder(Node root){
		if(root == null){
			System.out.println("Please enter a valid tree!");
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()){
			root = q.poll();
			System.out.print(root.data + " ");
			if(root.left != null){
				q.add(root.left);
			}
			if(root.right != null){
				q.add(root.right);
			}
		}
		
	}

}

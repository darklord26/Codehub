package trees;

import java.util.Stack;

/*
 * Use two stack. Put root in stack1.
 * While stack1 is not empty take items from stack1 and put its child left,right in stack2.
 * Then once stack1 is empty pop from stack2 and put its child right,
 * left into stack1.
 */
public class TreeTraversalInSpiralOrder {

	public static void main(String[] args) {
		TreeCreation bt = new TreeCreation();
		Node root = null;
		root = bt.addNode(10, root);
		root = bt.addNode(30, root);
		root = bt.addNode(25, root);
		root = bt.addNode(35, root);
		root = bt.addNode(-10, root);
		root = bt.addNode(0, root);
		root = bt.addNode(-20, root);
		root = bt.addNode(-15, root);
		root = bt.addNode(45, root);

		TreeTraversalInSpiralOrder tt = new TreeTraversalInSpiralOrder();
		System.out.println("Two stack method");
		tt.spiralWithTwoStack(root);
	}

	public void spiralWithTwoStack(Node root) {
		if (root == null) {
			return;
		}
		Stack<Node> s1 = new Stack<>();
		Stack<Node> s2 = new Stack<>();
		s1.push(root);
		while (!s1.isEmpty() || !s2.isEmpty()) {
			
			while (!s1.isEmpty()) {
				root = s1.pop();
				System.out.print(root.data + " ");
				
				if (root.left != null) {
					s2.push(root.left);
				}
				if (root.right != null) {
					s2.push(root.right);
				}
			}
			while (!s2.isEmpty()) {
				root = s2.pop();
				System.out.print(root.data + " ");
				if (root.right != null) {
					s1.push(root.right);
				}
				if (root.left != null) {
					s1.push(root.left);
				}
			}
		}

	}
}

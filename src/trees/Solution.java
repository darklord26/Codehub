package trees;

import java.io.BufferedReader;
import java.io.FileReader;

class TNode {
	int data;
	TNode left, right;

	public TNode(int i) {
		data = i;
		left = right = null;
	}
}

public class Solution {

	TNode root;

	public void add(int data) {
		root = addhelp(root, data);
	}

	public TNode addhelp(TNode TNode, int data) {
		if (TNode == null) {
			TNode = new TNode(data);
			return TNode;
		} else if (TNode.data > data) {
			TNode.left = addhelp(TNode.left, data);
		} else {
			TNode.right = addhelp(TNode.right, data);
		}
		return TNode;
	}

	public static int diameter(TNode r) {
		if (r == null) {
			return 0;
		}

		int leftheight = getHeight(r.left);
		int rightheight = getHeight(r.right);

		int lDiam = diameter(r.left);
		int rDiam = diameter(r.right);

		return getMax(leftheight + rightheight + 1, lDiam, rDiam);

	}

	public static int getMax(int x, int y, int z) {
		return Math.max(x, Math.max(y, z));
	}

	public static int getHeight(TNode rt) {
		if (rt == null) {
			return 0;
		}

		return 1 + Math.max(getHeight(rt.left), getHeight(rt.right));
	}
	
	public void inOr(TNode r){
		if(r != null){
			inOr(r.left);
			System.out.println(r.data);
			inOr(r.right);
		}
	}

	public static void main(String args[]) throws Exception {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Solution tree = new Solution();
		String s;
		BufferedReader br = new BufferedReader(new FileReader("/Users/harikeshkalyanpur/Desktop/input002.txt"));

		while ((s = br.readLine()) != null) {
			if (s.charAt(0)=='T') {
				continue;
			}
			else{
				s=s.trim();
				int num = Integer.parseInt(s);
				tree.add(num);
			}
		}
		tree.inOr(tree.root);
		System.out.println(diameter(tree.root));

	}

}

package linklist;

public class Node {
	int val;
    Node next;
    Node before;
    Node child;
    Object obj;
    
    public static Node newNode(int data, Object... obj){
        Node n = new Node();
        n.val = data;
        n.next = null;
        n.before = null;
        if(obj.length > 0)
        {    
            n.obj = obj[0];
        }
        return n;
    }
}

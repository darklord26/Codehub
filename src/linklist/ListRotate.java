package linklist;

public class ListRotate {

	public static void main(String[] args) {
		ListNode my = new ListNode(1);
		my.next = new ListNode(2);
		my.next.next = new ListNode(3);
		my.next.next.next = new ListNode(4);
		my.next.next.next.next = new ListNode(5);//so the  is 1,2,3,4,5
		my.Print();//print out the  should be in order
		my = rotate(my, 2);//let's rotate by 2, thus we expect 3,4,5,1,2
		my.Print();//let's verify it!
		my = rotate(my, 1);//let's rotate by 2, thus we expect 5,1,2,3,4
		my.Print();//let's verify it!

	}
	
	static ListNode rotate (ListNode head, int k){
		if(head == null){
			return head;
		}
		ListNode current = head;
		ListNode newHead;
		while(k>1){
			current = current.next;
			k--;
		}
		newHead = current.next;
		current.next = null;
		current = newHead;
		while(current.next!=null){
			current = current.next;
		}
		current.next = head;
		return newHead;
	}

}

class ListNode
{
	ListNode next;
	int value;
	public ListNode(int k)
	{
		value = k;
	}
	//we also define a print method to print ListNode in order
	public void Print()
	{
		ListNode current = this;
		while(current!=null)
		{
			System.out.print(current.value+"->");
			//gosh I forget to update current index
			current = current.next;
		}
		System.out.print("NULL\n");
	}
}

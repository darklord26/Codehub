package linklist;

//p =  2->4->3
//q =  5->6->4

public class AddTwoNumbers {

	public ListNode addTwoNumbers(ListNode n1, ListNode n2) {
		ListNode dummyHead = new ListNode(0);
		ListNode p = n1;
		ListNode q = n2;
		ListNode current = dummyHead;
		int carry = 0;

		while (p != null || q != null) {
			int x = (p != null) ? p.value : 0;
			int y = (q != null) ? q.value : 0;
			
			int digit = x + y + carry;
			carry = digit/10;
			current.next = new ListNode(digit%10);
			current = current.next;
			
			if(p!=null){
				p = p.next;
			}
			if(q!=null){
				q = q.next;
			}
		}
		
		if(carry>0){
			current.next = new ListNode(carry);
		}
		return dummyHead.next;
	}

}

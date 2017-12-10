package LinkedList;

public class RemoveNodeGreaterThanX {
	public ListNode removeNode(ListNode a, int x){
		ListNode dummy = new ListNode(0);
		dummy.next = a;
		a = dummy;
		while(dummy.next != null){
			if(dummy.next.val > x){
				dummy.next = dummy.next.next;
			}
			if(dummy.next != null && dummy.next.val <= x)
				dummy  = dummy.next;
		}
		return a.next;
	}
}

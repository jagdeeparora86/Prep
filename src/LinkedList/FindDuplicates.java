package LinkedList;

public class FindDuplicates {
	public ListNode findDuplicates (ListNode a){
		ListNode checker = a;
		while(checker != null){
			ListNode current = checker;
			while(current != null && current.next != null){
				while(current.next.val == checker.val){
					ListNode temp = current.next.next;
					current.next.next = null;  
					current.next = temp;
				}
				current = current.next;
			}
			checker = checker.next;
		}
		return a;
	}
}

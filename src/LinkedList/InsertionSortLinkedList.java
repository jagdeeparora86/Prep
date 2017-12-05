package LinkedList;

public class InsertionSortLinkedList {
	
	ListNode result = null;
	public ListNode insertSort(ListNode a){
		if(a == null){
			return null;
		}
		if(a.next == null){
			return a;
		}
		
		while(a != null){
			ListNode nextNode = a.next;
			sortIt(a);
			a = nextNode;
		}
		return result;
	}
	
	private void sortIt(ListNode newNode){
		if(result == null || result.val >= newNode.val){
			newNode.next = result;
			result = newNode;
		}else {
			ListNode current = result;
			while(current.next != null && current.val < newNode.val){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
}

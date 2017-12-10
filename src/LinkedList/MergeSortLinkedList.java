package LinkedList;

public class MergeSortLinkedList {
	ListNode result = null;
	
	public ListNode sortList(ListNode a){
		return mergeSort(a);
	}
	
	public ListNode mergeSort(ListNode a) {
		if(a == null  || a.next == null){
			return a;
		}
		
		ListNode middle = middle(a);
		ListNode nextToMiddle = middle.next;
		middle.next = null;
		
		ListNode left = mergeSort(a);
		ListNode right = mergeSort(nextToMiddle);
		
		return merge(left, right);
	}
	
	private ListNode merge(ListNode left, ListNode right){
		ListNode temp = new ListNode(-1);
		ListNode finalList = temp;
		while(left != null && right != null) {
			 if(left.val <= right.val){
				 temp.next = left;
				 left = left.next;
			 } else if(right.val < left.val) {
				 temp.next = right;
				 right = right.next;
			 }
			 temp = temp.next;
		}
		temp.next = (left == null)? right : left;
		finalList = finalList.next;
		return finalList;
	}
	
	public ListNode middle(ListNode node){
		if(node == null) {
			return null;
		}
		
		ListNode slower = node;
		ListNode faster = node.next;
		
		while(faster != null && faster.next != null){
			slower = slower.next;
			faster = faster.next.next;
		}
		return slower;
	}
}

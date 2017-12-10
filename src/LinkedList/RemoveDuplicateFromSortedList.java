package LinkedList;

// class ListNode {
//     public int val;
//     public ListNode next;
//     ListNode(int x) { val = x; next = null; }
//     ListNode(){};
//     ListNode(int x, ListNode nextNode){val = x; next = nextNode; }
//
// }
     
     
public class RemoveDuplicateFromSortedList {
	public ListNode deleteDuplicates(ListNode a) {
		if(a == null || a.next == null){
			return a;		}
		
		ListNode tracker = a;
		while(tracker != null && tracker.next !=null){
			if(tracker.val == tracker.next.val){
				tracker.next = tracker.next.next;
			}
			else{
				tracker = tracker.next;
			}
		}
		return a;
	}
}

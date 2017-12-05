package LinkedList;

public class IsPalindrome {
	
    public int lPalin(ListNode A) {
      ListNode slow = A;
      ListNode fast = A;
      
      while(fast.next !=null && fast != null){
    	  slow = slow.next;
    	  fast = fast.next.next;
      }
      ListNode secondReversed = reverse(slow);
      fast = A;
      while(secondReversed != null){
    	  if(secondReversed.val != fast.val){
    		  return 0;
    	  }
    	  secondReversed = secondReversed.next;
      }
      return 1;
      
    }
    
    private ListNode reverse(ListNode slow){
    	if(slow == null){
    		return null;
    	}
    	if(slow.next == null) {
    		return slow;
    	}
    	ListNode previous = null;
    	ListNode current = slow;
    	while(current!=null){
    		ListNode next = current.next;
    		current.next = previous;
    		previous = current;
    		current = next;
    	}
    	return previous;
       }
  
}

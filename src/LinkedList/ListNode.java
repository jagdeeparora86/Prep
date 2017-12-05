package LinkedList;

public class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
    ListNode(){};
    ListNode(int x, ListNode nextNode){val = x; next = nextNode; }
}

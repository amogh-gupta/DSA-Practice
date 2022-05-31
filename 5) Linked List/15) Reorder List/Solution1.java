// QUESTION URL : - https://leetcode.com/problems/reorder-list/

// Approach 1 - Slower

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution1 {
    public void reorderList(ListNode head) {
        ListNode start=head, end, nbr, prev;
        while(start.next!=null && start.next.next!=null){
            end = start;
            prev = null;
            while(end.next!=null){
                prev = end;
                end = end.next;
            }
            nbr = start.next;
            start.next = end;
            end.next = nbr;
            start = nbr;
            prev.next = null;
        }
    }
}
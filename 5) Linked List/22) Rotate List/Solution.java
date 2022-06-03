// QUESTION URL : - https://leetcode.com/problems/rotate-list/
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null, curr = head;
        while(curr!= null){
            nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = curr.next;
        }
        return prev;
    }
    public int size(ListNode head){
        int i = 0;
        while(head!= null){
            head = head.next;
            i++;
        }
        return i;
    }
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null){
            return head;
        }
        int size = size(head);
        k = k%size;
        if(k == 0){
            return head;
        }
        ListNode prev, slow, fast;
        slow = fast = head;
        for(int i = 0; i<k; i++){
            fast = fast.next;
        }
        while(fast.next!= null){
            slow = slow.next;
            fast = fast.next;
        }
        prev = slow;
        slow = slow.next;
        prev.next = null;
        fast.next = head;
        return slow;
    }
}
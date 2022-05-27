// QUESTION URL : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class Solution {
    public class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = head, cur = head.next, present;
        while(cur!=null){
            if(pre.val != cur.val){
                pre.next = cur;
                pre = cur;
                cur = cur.next;
            }
            else{
                present = cur;  // This line is Optional
                cur = cur.next;
                present.next = null; // This line is Optional
            }
        }
        pre.next = null;
        return head;
    }
}
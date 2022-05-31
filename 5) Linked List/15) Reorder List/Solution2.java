// QUESTION URL : - https://leetcode.com/problems/reorder-list/

// Approach 2 - Faster

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution2 {
    public ListNode middleNode(ListNode head) {
        ListNode slow, fast;
        slow = fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head, nbr;
        while(curr!=null){
            nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        head = prev;
        return head;
    }
    public void reorderList(ListNode head) {
        ListNode ptr1 = head, ptr2 = middleNode(head), end = ptr2, ptr3 = head;
        ptr2 = ptr2.next;
        end.next = null;
        ptr2 = reverseList(ptr2);
        while(ptr1!=null || ptr2!= null){
            if(ptr3 != head){
                ptr3.next = ptr1;
                ptr1 = ptr1.next;
                ptr3 = ptr3.next;
            }
            else{
                ptr1 = ptr1.next;
            }
            if(ptr2!=null){
                ptr3.next = ptr2;
                ptr2 = ptr2.next;
                ptr3 = ptr3.next;
            }
        }
    }
}
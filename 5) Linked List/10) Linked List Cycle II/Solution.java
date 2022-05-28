// QUESTION URL : - https://leetcode.com/problems/linked-list-cycle-ii/
public class Solution {
    class ListNode {
            int val;
            ListNode next;
            ListNode(int x) {
                val = x;
                next = null;
            }
        }
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return head;
        }
        if(head.next == null){
            return null;
        }
        ListNode curr, slow, fast;//, meetingNode;// = null;
        curr = slow = fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return null;
        
        while(slow != curr){
            slow = slow.next;
            curr = curr.next;
        }
        return curr;
    }
}
// QUESTION URL : - https://leetcode.com/problems/palindrome-linked-list/

// Definition for singly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
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
   
   public boolean isPalindrome(ListNode head) {
       ListNode mid = middleNode(head), head1 = head, head2;
       head2 = reverseList(mid.next);
       mid.next = null;
       while(head1!=null && head2!= null){
           if(head1.val==head2.val){
               head1 = head1.next;
               head2 = head2.next;
           }
           else{
               return false;
           }
       }
       return true;
      
   }
}
// QUESTION URL : - https://leetcode.com/problems/odd-even-linked-list/
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
       public ListNode oddEvenList(ListNode head) {
           if(head == null || head.next == null || head.next.next == null){
               return head;
           }
           int i = 0;
           ListNode even = new ListNode();
           ListNode odd = new ListNode();
           ListNode ptr, ptr1, ptr2;
           ptr1 = even;
           ptr2 = odd;
           ptr = head;
           while(ptr!=null){
               if(i%2 == 0){
                   ptr2.next = ptr;
                   ptr2 = ptr2.next;
               }
               else{
                   ptr1.next = ptr;
                   ptr1 = ptr1.next;
               }
               i++;
               ptr = ptr.next;
           }
           ptr1.next = null;
           ptr2.next = even.next;
           return odd.next;
           
       }
   }
// QUESTION URL : - https://practice.geeksforgeeks.org/problems/remove-loop-in-linked-list/1#
class Node
{
    int data;
    Node next;
}

class Solution
{
    //Function to remove a loop in the linked list.
    public static void removeLoop(Node head){
        // code here
        // remove the loop without losing any nodes
        if(head == null || head.next == null){
            return;
        }
        Node slow, fast, curr, prev = null;
        curr = slow = fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return;
        
        while(slow!= curr){
            prev = slow;
            slow = slow.next;
            curr = curr.next;
        }
        prev.next = null;
        return;
    }
}
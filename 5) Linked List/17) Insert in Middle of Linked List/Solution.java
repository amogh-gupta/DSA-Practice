// QUESTION URL : - https://practice.geeksforgeeks.org/problems/insert-in-middle-of-linked-list/1#

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Solution {
    
    public Node insertInMid(Node head, int data){
        //Insert code here, return the head of modified linked list
        Node node = new Node(data), slow, fast;
        if(head == null){
            head = node;
            return head;
        }
        slow = fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        node.next = slow.next;
        slow.next = node;
        return head;
    }
}
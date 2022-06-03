// QUESTION URL : -  https://practice.geeksforgeeks.org/problems/segregate-even-and-odd-nodes-in-a-linked-list5035/1
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}


class Solution{
    Node divide(int N, Node head){
        Node even = new Node(0);
        Node odd = new Node(0);
        Node ptr, ptr1, ptr2;
        ptr1 = even;
        ptr2 = odd;
        ptr = head;
        while(ptr!= null){
            if(ptr.data % 2 == 0){
                ptr1.next = ptr;
                ptr1 = ptr1.next;
            }
            else{
                ptr2.next = ptr;
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
        }
        ptr2.next = null;
        ptr1.next = null;
        ptr1.next = odd.next;
        return(even.next);
    }
}
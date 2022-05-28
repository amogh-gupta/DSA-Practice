// QUESTION URL : - https://practice.geeksforgeeks.org/problems/find-length-of-loop/1

//Function should return the length of the loop in LL.

class Solution2 {
    class Node
    {
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
//Function to find the length of a loop in the linked list.
    static int countNodesinLoop(Node head)
    {
        //Add your code here.
        int index = 0;
        if(head == null || head.next == null){
            return index;
        }
        Node slow, fast;
        slow = fast = head;
        boolean flag = false;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                flag = true;
                break;
            }
        }
        if(!flag) return index;
        
        // while(slow!= curr){
        //     slow = slow.next;
        //     curr = curr.next;
        // }

        while(true){
            slow = slow.next;
            index++;
            // if(slow == curr){
            if(slow == fast){
                return index;
            }
        }
    }
}
// Question URL : - https://practice.geeksforgeeks.org/problems/circular-linked-list/1
public class GFG {
    public class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
 
    boolean isCircular(Node head)
    {
    	// Your code here	
    	if(head == null){
    	    return true;
    	}
    	Node slow, fast;
    	slow = fast = head;
    	while(fast != null && fast.next!= null){
    	    slow = slow.next;
        	fast = fast.next.next;
        	if(fast == slow){
        	    return true;
        	}
    	}
    	return false;
	}    
}

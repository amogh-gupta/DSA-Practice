// QUESTION URL : - https://leetcode.com/problems/delete-node-in-a-linked-list
public class Solution {
    public void deleteNode(ListNode node) {
        while(node.next!=null){
            node.val = node.next.val;
            if(node.next.next!=null){
                node = node.next;
            }
            else{
                node.next = null;
            }
        }
    }
}

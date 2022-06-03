// QUESTION URL : - https://nados.io/question/unfold-of-linkedlist?zen=true
import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverse(ListNode head){
        ListNode prev = null, curr = head, nbr;
        while(curr.next!=null){
            nbr = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nbr;
        }
        curr.next = prev;
        return curr;
    }

    public static void unfold(ListNode head) {
        int i = 0;
        ListNode d1 = new ListNode(0);
        ListNode d2 = new ListNode(0);
        ListNode ptr = head, ptr1 = d1, ptr2 = d2;

        if(head == null || head.next == null || head.next.next == null){
            return;
        }

        while(ptr != null){
            if(i%2 == 0){
                ptr1.next = ptr;
                ptr1 = ptr1.next;
            }
            else{
                ptr2.next = ptr;
                ptr2 = ptr2.next;
            }
            ptr = ptr.next;
            i++;
        }
        ptr2.next = null;

        d2 = reverse(d2.next);

        ptr1.next = d2;
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
        scn.close();
    }
}
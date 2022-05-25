// Question URL : https://leetcode.com/problems/design-linked-list/submissions/
public class DoublyLinkedList {
    public static class Node{
        int data;
        Node next;
        Node prev;
    }
    Node head, tail;
    int size;
    
    public DoublyLinkedList() {
        this.head = this.tail = null;
        this.size = 0;
    }
    
    public int get(int index) {
        if(index<0 || index>this.size-1){
            return -1;
        }
        else{
            Node node = this.head;
            for(int i = 0; i<index; i++){
                node = node.next;
            }
            return node.data;
        }
    }
    
    public void addAtHead(int val) {
        Node node = new Node();
        node.data = val;
        if(this.size == 0){
            this.head = this.tail = node;
        }
        else{
            node.next =  this.head;
            this.head.prev = node;
            this.head = node;
        }
            this.size++;
    }
    
    public void addAtTail(int val) {
        Node node = new Node();
        node.data = val;
        
        if(this.size == 0){
            this.head = this.tail = node;
        }
        else{
            this.tail.next = node;
            node.prev = this.tail;
            this.tail = node;
        }
        this.size++;
    }
    
    public void addAtIndex(int index, int val) {
        if(index<0 || index>this.size){
            return;
        }
        if(index == 0){
            this.addAtHead(val);
        }
        else if(index == this.size){
            this.addAtTail(val);
        }
        else{
            Node node = new Node();
            node.data = val;
            
            Node pre = null, cur = head;
            
            for(int i = 0; i<index; i++){
                pre = cur;
                cur = cur.next;
            }    
            
            pre.next = node;
            node.prev = pre;
            
            node.next = cur;
            cur.prev = node;
            
            this.size++;
            
        }
        
    }
    
    public void deleteAtIndex(int index) {
        if(index<0 || index>this.size-1 || this.size == 0){
            return;
        }
        else if(index == 0){
            if(this.size == 0){
                return;
            }
            else if(this.size == 1){
                this.head = this.tail = null;
                this.size = 0;
            }
            else{
                this.head = this.head.next;
                this.head.prev = null;
                this.size--;
            }
            
        }
        else if(index == this.size - 1){
            if(this.size == 0){
                return;
            }
            else if(this.size == 1){
                this.head = this.tail = null;
                this.size = 0;
            }
            else{
                this.tail = this.tail.prev;
                this.tail.next = null;    
                this.size--;
            }
        }
        else{
            Node pre, nxt, cur = this.head;
            
            for(int i = 0; i<index; i++){
                cur = cur.next;
            }
            pre = cur.prev;
            nxt = cur.next;
            
            pre.next = nxt;
            nxt.prev = pre;
            
            cur.next = cur.prev = null;
            
            this.size--;
        }
        
    }    
}

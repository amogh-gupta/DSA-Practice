// Question URL : https://nados.io/content/linked-lists-for-beginners
public class LinkedListOperations {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        int size(){
            return this.size;
        }

        void addLast(int val){ // Adding node to the last in the link list
            Node node = new Node();
            node.data = val;

            if(this.size == 0){
                this.head = node;
                this.tail = node;
            }
            else{
                this.tail.next = node;
                this.tail = node;
            }
            this.size++;
        }

        void addFirst(int val){
            Node node = new Node();
            node.data = val;

            if(this.size == 0){
                this.head = node;
                this.tail = node;
            }
            else{
                node.next = this.head;
                this.head = node;
            }
            this.size++;
        }

        void addAt(int idx, int val){
            
            if (idx < 0 || idx > size) {
                System.out.println("Invalid arguments");
            }
            else if(idx == 0){
                addFirst(val);
            }
            else if(idx == this.size-1){
                addLast(val);
            }
            else{
                Node present = this.head, node = new Node();
                node.data = val;

                for(int i = 0; i < idx-1; i++){
                    present = present.next;
                }
                node.next = present.next;
                present.next = node;
            }
            this.size++;
        }

        void removeLast(){
            Node node = head;
            if(this.size == 0){
                System.out.println("List is empty");
            }
            if(this.size == 1){
                System.out.println("Removed data is:- " + head.data);
                this.head = null;
                this.tail= null;
                this.size--;    
                return;
            }
            while(node.next != this.tail){
                node = node.next;
            }
            System.out.println("Removed data is:- " + tail.data);
            this.tail = node;
            this.tail.next = null;
            this.size--;
        }

        void removeFirst(){
            if(this.size == 0){
                System.out.println("List is empty");
            }
            else{
                System.out.println("Removed data is:- " + head.data);
                this.head = this.head.next;
            }   
            this.size--;
        }

        void removeAt(int idx){
            if(this.size == 0){
                System.out.println("List is empty");
                return;
            }
            if(idx < 0 || idx >= this.size){
                System.out.println("Index out of range");
                return;
            }

            
            if(idx == 0){
                // System.out.println("Removed data at " + i + " is:- " + head.data);
                // this.head = node.next;
                // this.size--;

                removeFirst();
                return;
            }
            
            if(idx == size-1){
                // System.out.println("Removed data at " + i + " is:- " + node.data);
                // this.tail = pre;
                // this.tail.next = null;

                removeLast();
                return;
            }
            
            int i = 0;
            Node node = head;
            Node pre = head;
            
            while(node != null){
                if(i == idx){
                    System.out.println("Removed data at " + i + " is:- " + node.data);
                    pre.next = node.next;
                    this.size--; 
                    return;
                }
                pre = node;
                node = node.next;
                i++;
            }
        }

        public int getFirst() {
            if (size == 0) {
              System.out.println("List is empty");
              return -1;
            } 
            else {
              return head.data;
            }
        }
      
        

        void displayLinkedList(){
            Node node = this.head;
            System.out.print("LinkList is :- ");
            while(node != null){
                System.out.print(node.data+" ");
                node = node.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.addFirst(10);
        l1.addFirst(0);
        
        l1.addLast(30);
        l1.addLast(40);
        l1.addLast(50);
        
        l1.addAt(2, 20);
        l1.addAt(3, 25);

        l1.removeLast();

        l1.removeFirst();

        l1.removeAt(2);

        System.out.println(l1.getFirst());
        
        System.out.println("Size :- " + l1.size);

        l1.displayLinkedList();
    }    
}

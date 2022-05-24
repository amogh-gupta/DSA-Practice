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

        System.out.println("Size :- " + l1.size);

        l1.displayLinkedList();
    }    
}

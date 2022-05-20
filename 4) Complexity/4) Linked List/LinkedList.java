public class LinkedList{
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedListOperations {
        Node head;
        Node tail;
        int size;

        void addLinkList(int val){
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

        int size(){
            return this.size;
        }

        void displayLinkedList(){
            Node node = this.head;
            // for(int i = 0; i<this.size; i++){
            while(node != null){
                System.out.println(node.data);
                node = node.next;
            }
        }
    }
    public static void main(String[] args) {
        LinkedListOperations l1 = new LinkedListOperations();
        l1.addLinkList(10);
        l1.addLinkList(20);
        l1.addLinkList(30);
        l1.addLinkList(40);
        l1.addLinkList(50);

        System.out.println(l1.size);

        l1.displayLinkedList();
    }
}
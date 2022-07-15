// Question URL : https://nados.io/question/size-of-generic-tree
import java.util.ArrayList;
import java.util.Stack;

public class Main {
    static class Node{
        int data;
        ArrayList<Node> children;

        Node(int data){
            this.data = data;
            children = new ArrayList<>();
        }
    }
    
    public static Node construct(Integer []arr) {
        Stack<Node> st = new Stack<>();

        Node root = new Node(arr[0]);
        st.push(root);

        int idx = 1;
        while(idx < arr.length){
            Integer val = arr[idx];

            if(val == null){
                st.pop();
            }
            else{
                Node node = new Node(val);
                Node par = st.peek();
                par.children.add(node);
                st.push(node);
            }
            idx++;
        }
        return root;
    }

    public static void display(Node node) {
        System.out.print(node.data + " -> ");
        for(Node t : node.children){
            System.out.print(t.data + " ");
        }
        System.out.println(".");
        
        for(Node t : node.children){
            display(t);
        }
    }

    public static int size(Node node) {
        int i = 0;
        
        for(Node t : node.children){
            i += size(t);
        }

        return i+1;
    }

    public static void main(String[] args){
        Integer []arr = {10, 20, 50, null, 60, null, null, 30, 70, 90, null, 100, null, 110, null, null, null, 40, 80, null, null, null};
        Node root = construct(arr);
        display(root);
        System.out.println(size(root));
    }
}


import java.util.*;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        System.out.println(st.size() + " : " + st);
        
        st.push(10);
        System.out.println(st.size() + " : " + st);
        
        st.push(20);
        System.out.println(st.size() + " : " + st);
        
        st.push(30);
        System.out.println(st.size() + " : " + st);
        
        st.push(40);
        
        for(int ele : st){
            System.out.print(ele + " -> ");
        }
        System.out.println();

        System.out.println(st);

        System.out.println(st.pop() + " : " + st);

        System.out.println(st.peek() + " : " + st);
    }   
}

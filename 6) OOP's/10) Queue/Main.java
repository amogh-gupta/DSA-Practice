import java.util.*;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> st = new ArrayDeque<>();
        
        System.out.println(st.size() + " : " + st);
        
        st.add(10);
        System.out.println(st.size() + " : " + st);
        
        st.add(20);
        System.out.println(st.size() + " : " + st);
        
        st.add(30);
        System.out.println(st.size() + " : " + st);
        
        st.add(40);
        
        for(int ele : st){
            System.out.print(ele + " -> ");
        }
        System.out.println();

        System.out.println(st);

        System.out.println(st.remove() + " : " + st);

        System.out.println(st.peek() + " : " + st);
    }   
         
}

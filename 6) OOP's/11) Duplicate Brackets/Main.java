// Question URL: - https://nados.io/question/duplicate-brackets
import java.util.*;

public class Main{

   public static boolean checkBracket(String input){
      Stack<Character> st = new Stack<Character>();

      for(int i = 0; i<input.length(); i++){
         char ch = input.charAt(i);
         
         if(ch == ' '){
            continue;
         }
         else if(ch == ')'){
            if(st.peek() == '('){
               return true;
            }
            else{
               while(st.peek() != '('){
                  st.pop();
               }
               st.pop();
            }
         }
         else{
            st.push(ch);            
         }
      }
      return false;

   }


   public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      String inp = scn.nextLine();
      System.out.println(checkBracket(inp));
      scn.close();
   }
}

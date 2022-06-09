// Question URL: - https://nados.io/question/balanced-brackets
import java.util.*;

public class Main{

   public static boolean checkBracket(String input){
      Stack<Character> st = new Stack<Character>();

      for(int i = 0; i<input.length(); i++){
         char ch = input.charAt(i);
         
         if(ch == ' '){
            continue;
         }
         else{
            if(ch == '(' || ch == '['  || ch == '{'){
               st.push(ch);
            }         
            else if(ch == '}'  || ch == ')'  || ch == ']' ){
               if(st.size() == 0){
                  return false;
               }
               if(ch == ')'){
                  if(st.peek() == '('){
                     st.pop();
                  }
                  else{
                     return false;
                  }
                  
               }
               else if(ch == '}'){
                  if(st.peek() == '{'){
                     st.pop();
                  }
                  else{
                     return false;
                  }
               }
               else{
                  if(st.peek() == '['){
                     st.pop();
                  }
                  else{
                     return false;
                  }
               }
            }
         else{
               continue;
            }
         }
      }
      if(st.size() == 0){
         return true;
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

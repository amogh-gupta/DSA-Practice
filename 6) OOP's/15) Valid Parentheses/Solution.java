// Question URL: - https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;

class Solution {
    public boolean isValid(String input) {
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
}
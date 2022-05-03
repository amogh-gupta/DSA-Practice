// Question URL: https://nados.io/question/print-permutations
import java.io.*;
import java.util.*;

public class PrintPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printPermutations(str, "");
        scn.close();
    }

    public static void printPermutations(String str, String asf) {
        if(str.length()==0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            // String val = str.substring(0,i) + str.substring(i+1);
            
            // OR

            StringBuilder sb = new StringBuilder(str);
            sb.deleteCharAt(i);
            String val = sb.toString();

            printPermutations(val, asf+ch);
        }
        
    }

}
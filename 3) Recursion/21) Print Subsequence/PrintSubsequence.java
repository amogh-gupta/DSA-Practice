// Question URL : https://nados.io/question/print-subsequence
import java.io.*;
import java.util.*;

public class PrintSubsequence {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        printSS(str, "");
        scn.close();
    }

    public static void printSS(String str, String ans) {
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        String r = str.substring(1, str.length());
        String l = str.substring(0, 1);
        printSS(r, ans+l);
        printSS(r, ans);
    }

}
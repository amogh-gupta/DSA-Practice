// Question URL: https://nados.io/question/print-encodings
import java.io.*;
import java.util.*;

public class PrintEncodings {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printEncodings(s,"");
        scn.close();
    }

    public static void printEncodings(String str, String ssf) {
        if(str.length()==1 && str.charAt(0) != '0'){
            char ch = str.charAt(0);
            int number = Integer.parseInt(String.valueOf(ch));
            char c = (char)(number+96);
            ssf+= c;
            System.out.println(ssf);
            return;
        }
        if(str.length()==0){
            System.out.println(ssf);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }
        String s1 = str.substring(0,1);
        String s2 = str.substring(0,2);
        int number1 = Integer.parseInt(s1);
        int number2 = Integer.parseInt(s2);

        if(number1>0 && number1<27){
            char c = (char)(number1+96);
            printEncodings(str.substring(1), ssf+c);
        }
        if(number2>0 && number2<27){
            char c = (char)(number2+96);
            printEncodings(str.substring(2), ssf+c);
        }
    }

}
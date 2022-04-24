// Question URL: https://nados.io/question/print-zigzag
import java.io.*;
import java.util.*;

public class PrintZigzag {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pzz(n);
        scn.close();
    }

    public static void pzz(int n){
        if(n==0){
            return ;
        }
        else{
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");
            pzz(n-1);
            System.out.print(n+" ");
        }
    }

}
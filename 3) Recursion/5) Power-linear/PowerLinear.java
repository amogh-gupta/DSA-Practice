import java.io.*;
import java.util.*;

public class PowerLinear {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int e = scn.nextInt();
        int val = power(n,e);
        System.out.println(val);
        scn.close();
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        return x*power(x,n-1);
    }

}
// Question URL: https://nados.io/question/power-logarithmic
import java.io.*;
import java.util.*;

public class Powerlogarithmic {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        int ans = power(x, n);
        System.out.println(ans);
        scn.close();
    }

    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        else{
            if(n%2==0){
                int val = power(x, n/2);
                return val*val;
            }
            else{
                int val = power(x, n/2);
                return val*val*x;
            }
        }
    }

}
// Question URL : https://nados.io/question/pattern-13
import java.util.Scanner;

public class Pattern13 {
    public static int factorial(int num) {
        if(num == 0 || num == 1){
            return 1;
        }
        int fac = 1;
        for(int i = 2; i<=num; i++){
            fac *= i;
        }
        
        return fac;
    }

    public static int ncr(int n, int r) {
        int fac1 = factorial(n);
        int fac2 = factorial(r);
        int fac3 = factorial(n-r);
        
        return fac1/(fac2*fac3);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int val;
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            for(int j = 0; j<=i; j++){
                val = ncr(i, j);
                System.out.print(val+"\t");
            }
            System.out.println();
        }
        scn.close();
    }
}
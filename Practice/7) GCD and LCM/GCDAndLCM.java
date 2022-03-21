// Question URL: https://nados.io/question/rotate-a-number
// Tips: num1 X num2 = LCM X GCD
// Use Euclidean algorithm

import java.util.Scanner;
import java.lang.Math;
public class GCDAndLCM {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int num1 = n1, num2 = n2, rem = n1;
        while(rem!=0){
            rem = num2%num1;
            num2 = num1;
            num1 = rem;
        }
        int GCD = num2;
        int LCM = (n1*n2)/GCD;
        System.out.println("GCD -> " + GCD);
        System.out.println("LCM -> " + LCM);
    }
}
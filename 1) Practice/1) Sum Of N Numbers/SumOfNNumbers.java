// Hack - Sum of N number - "(n X (n+1))/2"

import java.util.Scanner;
public class SumOfNNumbers{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scn.nextInt();
        long sum = (num*(num+1))/2;
        System.out.println("Num of " + num + "number is : " + sum);
    }
}
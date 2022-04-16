// Question URL : https://leetcode.com/problems/sqrtx/submissions/ 
import java.util.Scanner;
public class SquareRoot {
    public static int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int left = 2, right = x/2, mid;
        while(left<=right){
            mid = left + ((right-left)/2);
            long num = (long)mid*mid; // type casting used to convert integer value into long
            if(num>x){
                right = mid - 1;
            }
            else if(num<x){
                left = mid + 1;
            }
            else{
                return mid;
            }
        }    
        return right;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int val = mySqrt(num);
        System.out.println(val);
    }
}

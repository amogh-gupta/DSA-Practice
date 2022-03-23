import java.util.Scanner;
import java.lang.Math;
public class SumOfTwoArrays {
    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static int[] input(Scanner scn, int len) {
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        return (arr);
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len1 = scn.nextInt();
        int[] arr1 = input(scn, len1);
        
        int len2 = scn.nextInt();
        int[] arr2 = input(scn, len2);
        int carry = 0, sum, n1 = len1-1, n2 = len2-1;
        int n3 = Math.max(n1, n2);
        int len3 = n3+1;
        int[] ret = new int[n3+1];
        while(n1>=0 || n2>=0){
            int val1 = n1<0 ? 0 : arr1[n1];
            int val2 = n2<0 ? 0 : arr2[n2];
            sum = val1+val2+carry;
            int digit = sum%10;
            carry = sum/10;
            ret[n3] = digit;
            n1--;
            n2--;
            n3--;
        }
        if (carry!=0){
            int [] newRet = new int[len3+1];
            newRet[0] = carry;
            for(int i = 1; i<=len3; i++){
                newRet[i] = ret[i-1];
            }
            display(newRet);
        }
        else{
            display(ret);
        }
    }
}

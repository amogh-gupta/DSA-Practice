import java.util.Scanner;
import java.lang.Math;

public class DifferenceOfTwoArrays {
    public static void display(int[] arr, int start){
        for(int i = start; i<arr.length; i++){
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
    public static int[] borrowing(int n, int[] arr) {
        if(n>0)
        {   
            if(arr[n-1]>0){
                arr[n-1] -= 1;
                arr[n] += 10;
                return(arr);
            }
            else{
                arr = borrowing(n-1, arr);
                arr = borrowing(n, arr);
                return(arr);
            }
        }        
        else{
            return(arr);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len1 = scn.nextInt();
        int[] arr1 = input(scn, len1);
        
        int len2 = scn.nextInt();
        int[] arr2 = input(scn, len2);
        int borrow = 0, sub, n1 = len1-1, n2 = len2-1;
        int n3 = n2;
        int len3 = len2;
        int[] ret = new int[len3];
        while(n1>=0 || n2>=0){
            int val1 = n1<0 ? 0 : arr1[n1];
            int val2 = n2<0 ? 0 : arr2[n2];
            if(val2<val1){
                arr2 = borrowing(n2, arr2);
                }
            ret[n3] = arr2[n2] - val1;
            n1--;
            n2--;
            n3--;
        }
        int start = 0;
        if(ret[0] == 0){
            start = 1;
        }
        display(ret, start);        
    }
}

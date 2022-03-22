import java.io.*;
import java.util.*;

public class SumOfTwoArrays {
    public static void reverse(int[] arr) {
        int s = 0, e = arr.length - 1, temp;
        while(s!=e){
            temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
        // return arr;
    }
    public static int[] addArr(int[] a, int[] b, int len) {
        for(int i = 0; i<len; i++){
            a[i] += b[i];
        }
        return(a);
    }
    
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int num1, num2;
        num1 = scn.nextInt();
        int a[] = new int[num1];
        for(int i = 0; i<num1; i++){
            a[i] = scn.nextInt();
        }
        num2 = scn.nextInt();
        int b[] = new int[num2];
        for(int i = 0; i<num2; i++){
            b[i] = scn.nextInt();
        }
        reverse(a);
        reverse(b);
        int [] result;
        if(num1>num2){
            result = addArr(a,b,num2);
        }
        else{
            result = addArr(b,a,num1);
        }
        reverse(result);
        for(int i:result){
            System.out.println(i);
        }
    }
}

import java.io.*;
import java.util.*;

public class Main {

    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here
        int l1 = a.length, l2 = b.length;
        int l3 = l1+l2, ptr, ptr1, ptr2, ele1, ele2;
        int[] arr = new int[l3];
        ptr = ptr1 = ptr2 = 0;
        while(ptr<l3){
            ele1 = (ptr1>=l1) ? Integer.MAX_VALUE : a[ptr1];
            ele2 = (ptr2>=l2) ? Integer.MAX_VALUE : b[ptr2];
            // if(ptr1>=l1){
            //     ele1 = Integer.MAX_VALUE;
            // }
            // else{
            //     ele1 = a[ptr1];
            // }

            // if(ptr2>=l2){
            //     ele2 = Integer.MAX_VALUE;
            // }
            // else{
            //     ele2 = b[ptr2];
            // }
            
            if(ele1<ele2){
                arr[ptr] = ele1;
                ptr1++;
            }
            else{
                arr[ptr] = ele2;
                ptr2++;
            }
            ptr++;
        }
        
        return arr;
    }

  public static void print(int[] arr){
    for(int i = 0 ; i < arr.length; i++){
      System.out.println(arr[i]);
    }
  }
  public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    for(int i = 0 ; i < n; i++){
      a[i] = scn.nextInt();
    }
    int m = scn.nextInt();
    int[] b = new int[m];
    for(int i = 0 ; i < m; i++){
      b[i] = scn.nextInt();
    }
    int[] mergedArray = mergeTwoSortedArrays(a,b);
    print(mergedArray);
  }

}
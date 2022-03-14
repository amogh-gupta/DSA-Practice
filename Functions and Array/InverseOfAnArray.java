import java.io.*;
import java.util.*;
public class InverseOfAnArray {
    public static void display(int[] a){
        int len = a.length, temp;
        int[] ret = new int[len];
        for(int i = 0; i<len; i++){
          //   temp = a[i];
            ret[a[i]] = i;
        }
        for(int i = 0; i<len; i++){
            System.out.println(ret[i]);
        }
     }
  
    public static void main(String[] args){
  
      int n = 5;//Integer.parseInt(br.readLine());
      int[] a = {4,0,2,3,1};//new int[n];
    //   for(int i = 0; i < n; i++){
    //      a[i] = Integer.parseInt(br.readLine());
    //   }
  
    //   int[] inv = inverse(a);
      display(a);
   }  
  }
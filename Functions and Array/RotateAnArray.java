// public class RotateAnArray {
import java.io.*;
import java.util.*;

public class RotateAnArray{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){
    int temp, val;
    if(k<0){
      val = k*(-1);
    }
    else{
      val = k;
    }
    for(int times = 0; times<val; times++){
      if(k>=0){
      temp = a[a.length-1];
      for(int i=a.length-1; i>=1;i--){
        a[i]=a[i-1];
      }
      a[0] = temp;
    }
    else{
      temp = a[0];
      for(int i=0; i<a.length-1;i++){
        a[i]=a[i+1];
      }
      a[a.length-1] = temp;
    }
    }
    // display(a);
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
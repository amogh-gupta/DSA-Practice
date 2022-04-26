// Question URL: https://nados.io/question/max-of-an-array
import java.io.*;
import java.util.*;

public class MaxOfAnArray {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        int maxNum = maxOfArray(ar, indx-1);
        System.out.println(maxNum);
        scn.close();
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx==0){
            return arr[0];
        }
        int m = maxOfArray(arr, idx-1);
        if(arr[idx]>m){
            return arr[idx];
        }
        return m;
    }

}

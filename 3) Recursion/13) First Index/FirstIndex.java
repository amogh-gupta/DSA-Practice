// Question URL: https://nados.io/question/first-index
import java.io.*;
import java.util.*;

public class FirstIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        int v = scn.nextInt();
        int retIndex = firstIndex(ar, 0, v);
        System.out.println(retIndex);
        scn.close();
    }

    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        int ans = firstIndex(arr, idx+1, x);
        return ans;
    }

}
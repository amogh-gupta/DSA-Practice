import java.io.*;
import java.util.*;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        int v = scn.nextInt();
        int retIndex = lastIndex(ar, indx-1, v);
        System.out.println(retIndex);
        scn.close();
    }

    public static int lastIndex(int[] arr, int idx, int x){
        if(idx == -1){
            return -1;
        }
        if(arr[idx] == x){
            return idx;
        }
        int ans = lastIndex(arr, idx-1, x);
        return ans;
    }

}

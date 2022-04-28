// Question URL: https://nados.io/question/all-indices-of-array
import java.io.*;
import java.util.*;

public class AllIndicesOfArray {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());
        int[] iarr = allIndices(arr, x, 0, 0);

        if(iarr.length == 0){
            System.out.println("NO OUTPUT");
            return;
        }

        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }

    public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
        if(idx == arr.length){
            int[] ar = new int[fsf];
            return ar;
        }

        if(arr[idx] == x){
            fsf++;
        }
        int[] retAr = allIndices(arr, x, idx+1, fsf);
        if(arr[idx] == x){
            fsf--;
            retAr[fsf] = idx;
        }
        return retAr;
    }

}
// Question URL: https://nados.io/question/display-array
import java.io.*;
import java.util.*;

public class DisplayArrayWay1 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        displayArr(ar, 0);
        scn.close();
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == arr.length){
            return;
        }
        System.out.println(arr[idx]);
        displayArr(arr, idx+1);
    }

}
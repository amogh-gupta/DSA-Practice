// Question URL: https://nados.io/question/display-array
import java.io.*;
import java.util.*;

public class DisplayArrayWay2 {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        displayArr(ar, indx-1);
        scn.close();
    }

    public static void displayArr(int[] arr, int idx){
        if(idx == -1){
            return;
        }
        displayArr(arr, idx-1);
        System.out.println(arr[idx]);
    }

}
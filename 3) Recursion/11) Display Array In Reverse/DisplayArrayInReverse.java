// Question URL: https://nados.io/question/display-array-in-reverse
import java.io.*;
import java.util.*;

public class DisplayArrayInReverse {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int indx = scn.nextInt();
        int[] ar = new int[indx];
        for(int i = 0; i<indx; i++){
            ar[i] = scn.nextInt();
        }
        displayArrReverse(ar, indx-1);
        scn.close();
    }

    public static void displayArrReverse(int[] arr, int idx) {
        if(idx == -1){
            return;
        }
        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);
    }

}
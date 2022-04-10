import java.io.*;
import java.util.*;

public class TheStateOfWakanda2{
    public static int[][] inputArr(int r, Scanner scn){
        int[][] arr = new int[r][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<r; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr, int r) {
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r-i; j++ ){
                System.out.println(arr[j][j+i]);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int[][] arr = inputArr(r,scn);
        display(arr, r);
    }

}
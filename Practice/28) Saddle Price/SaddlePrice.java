import java.io.*;
import java.util.*;

public class SaddlePrice{
    public static int[][] inputArr(int r, Scanner scn){
        int[][] arr = new int[r][r];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<r; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static int check(int val, int[][] arr, int r, int c) {
        int len = arr.length, flag = 0;
        for(int i = 0; i<len; i++){
            if(val>arr[r][i]){
                return(0);
            }
        }
        for(int j = 0; j<len; j++){
            if(val<arr[j][c]){
                return 0;
            }
        }
        return 1;
    }

    public static void display(int[][] arr, int r) {
        int val = 0, flag = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r; j++){
                val = check(arr[i][j], arr, i, j);
                if (val == 1){
                    flag++;
                    System.out.println(arr[i][j]);
                    return;
                }
            }
        }
        if(flag == 0){
            System.out.println("Invalid input");
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int[][] arr = inputArr(r,scn);
        display(arr, r);
    }

}
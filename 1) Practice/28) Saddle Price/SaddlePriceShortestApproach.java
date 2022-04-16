import java.io.*;
import java.util.*;

public class SaddlePriceShortestApproach{
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
        int val = 0, flag, min, c;
        for(int i = 0; i < r; i++){
            flag = 0;
            c = 0;
            min = arr[i][c];
            for(int j = 1; j < r; j++){
                if(arr[i][j]<min){
                    min = arr[i][j];
                    c = j;
                }
            }
            for(int k = 0; k<r; k++){
                if(arr[k][c]>min){
                    flag++;
                    break;
                }
            }
            if(flag == 0){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int[][] arr = inputArr(r,scn);
        display(arr, r);
    }

}
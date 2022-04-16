import java.io.*;
import java.util.*;

public class TheStateOfWakanda1{
    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void display(int[][] arr, int r, int c) {
        int count = 0;
        for(int i = 0; i < c; i++){
            if(count%2 == 0){
                for(int j = 0; j<r; j++){
                    System.out.println(arr[j][i]);
                }
            }
            else{
                for(int j = r-1; j>=0; j--){
                    System.out.println(arr[j][i]);
                }
            }
            count++;
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r,c,scn);
        display(arr, r, c);
    }

}
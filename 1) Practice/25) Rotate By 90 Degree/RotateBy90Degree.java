// Question URL : https://nados.io/question/rotate-by-90-degree
import java.io.*;
import java.util.*;

public class RotateBy90Degree {

    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
    public static void transpose(int[][] arr, int r) {
        int row=0, col=0, temp;
        for(int i = 0; i<r; i++){
            for(int j = col; j<r; j++){
                temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
            col++;
        }
        reverse(arr, r);
    }

    public static void reverse(int[][] arr, int r) {
        int temp;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<r/2; j++){
                temp = arr[i][j];
                arr[i][j] = arr[i][r-j-1];
                arr[i][r-j-1] = temp;
            }
        }
        display(arr);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int[][] arr = inputArr(r,r,scn);
        transpose(arr, r);
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}

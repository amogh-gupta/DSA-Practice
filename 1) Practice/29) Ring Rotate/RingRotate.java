// Question URL : https://nados.io/question/ring-rotate
import java.io.*;
import java.util.*;

public class RingRotate {

    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void ringRotate(int[][] arr, int s, int rotation) {
        
    }

    public static int[] fill1d(int[][] arr, int r, int c, int s) {
        int[] a = new int[20];
        int c = 0;
        for(int i = s-1; i<c-s+1; i++){
            a[c] = arr[s-1][i];
            c++;
        }
        for(int i = s; i<c-s+1; i++){
            a[c] = arr[i][s-1];
            c++;
        }
        for(int i = c-s; i>=s-1; i--){
            a[c] = arr[c-s+1][i];
            c++;
        }
        for(int i = c-s-1; i>=s; i--){
            a[c] = arr[i][s-1][i];
            c++;
        }
    }

    public static void rotate(int[] arr, int rotation) {
        int len = arr.length;
        if (rotation<0){
            rotation += len;
        }
        ArrayRotation(arr, len-rotation, len-1);
        ArrayRotation(arr, 0, len-rotation-1);
        ArrayRotation(arr, 0, len-1);
    }

    public static void fill2d(int[][] arr, int s, int[] ar) {
        
    }

    public static void ArrayRotation(int[] a, int start, int end){
        while(start < end){//} && start!=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r,c,scn);
        int s = scn.nextInt();
        int rotation = scn.nextInt();
        ringRotate(arr, s, rotation);
        transpose(arr, r);
    }

}

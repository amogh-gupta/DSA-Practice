// Question URL : https://nados.io/question/matrix-multiplication
import java.util.Scanner;
public class MatrixMultiplication {
    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }
      
    public static int[][] multi(int[][] arr1, int[][] arr2, int r, int c, int n) {
        int[][] res = new int[r][c];
        int val;
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                val = 0;
                for(int a = 0; a<n; a++){
                    val+= arr1[i][a]*arr2[a][j];
                }
                res[i][j] = val;
            }
        }
        return res;
    }

    public static void display(int[][] arr, int r, int c){
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr1 = inputArr(n1, m1, scn);
        
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] arr2 = inputArr(n2, m2, scn);
        
        if(m1 != n2){
            System.out.println("Invalid input");
        }
        else{
            int[][] result = multi(arr1, arr2, n1, m2, n2);
            display(result, n1, m2);
        }
    }
}
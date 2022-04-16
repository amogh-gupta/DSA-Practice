// Question URL : https://nados.io/question/2d-arrays-demo 
import java.util.Scanner;
public class 2dArrayInput {

    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
          for(int j = 0; j<c; j++){
            arr[i][j] = scn.nextInt();
          }
        }
        return arr;
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
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r, c, scn);
        display(arr, r, c);
       }
      }
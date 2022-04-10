// Question URL : https://nados.io/question/spiral-display
import java.io.*;
import java.util.Scanner;

public class SpiralDisplay {
    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void spiralDisplay(int[][] arr, int r, int c) {
        int sr=0, er=r-1, sc=0, ec=c-1, count = 0;

        while(count<r*c){
            for(int row = sr; row<=er && count<r*c; row++){
                System.out.println(arr[row][sc]);
                count++;
            }
            for(int col = sc+1; col<=ec && count<r*c; col++){
                System.out.println(arr[er][col]);
                count++;
            }
            for(int row = er-1; row>=sr && count<r*c; row--){
                System.out.println(arr[row][ec]);
                count++;
            }
            for(int col = ec-1; col>=sc+1 && count<r*c; col--){
                System.out.println(arr[sr][col]);
                count++;
            }
        
            sr++;
            sc++;
            er--;
            ec--;
        }
        

    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r,c,scn);
        spiralDisplay(arr, r, c);
    }

}
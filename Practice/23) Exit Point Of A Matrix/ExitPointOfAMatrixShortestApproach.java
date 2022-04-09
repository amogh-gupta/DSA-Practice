// Better and Short Approach
// Question URL : https://nados.io/question/exit-point-of-a-matrix
import java.io.*;
import java.util.*;

public class ExitPointOfAMatrixShortestApproach {

    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void logic(int[][] arr, int r, int c) {
        int dir = 0;
        int a = 0, b = 0, flag = 0;
        while(a>=0 && a<r && b>=0 && b<c){
            dir += arr[a][b];
            dir %= 4;
            if(dir == 0){
                b++;
            }

            else if(dir == 1){
                a++;
            }

            else if(dir == 2){
                b--;
            }

            else if(dir == 3){
                a--;
            }
        }
        if(dir == 0){
            b--;
        }
        else if(dir == 1){
            a--;
        }
        else if(dir == 2){
            b++;
        }
        else{
            a++;
        }

        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r,c,scn);
        logic(arr, r, c);


    }

}

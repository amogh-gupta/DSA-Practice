// Better and Short Approach
// Question URL : https://nados.io/question/exit-point-of-a-matrix
import java.io.*;
import java.util.*;

public class ExitPointOfAMatrixAlternative {

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
        while(true){
            dir += arr[a][b];
            dir %= 4;
            if(dir == 0){
                if(b<r){
                    b++;
                }
                else{
                    flag = 1;
                }
            }

            if(dir == 1){
                if(a<c){
                    a++;
                }
                else{
                    flag = 1;
                }
            }

            if(dir == 2){
                if(b>0){
                    b--;
                }
                else{
                    flag = 1;
                }
            }

            if(dir == 3){
                if(a>0){
                    a--;
                }
                else{
                    flag = 1;
                }
            }
            if(flag == 1){
                break;
            }
        }
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = inputArr(r,c,scn);
        logic(arr, r-1, c-1);


    }

}

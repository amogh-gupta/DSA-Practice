// Question URL: https://leetcode.com/problems/reshape-the-matrix/
import java.io.*;
import java.util.*;

public class ReshapeTheMatrixAlternative {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        int mTotal = m*n;
        if(r*c != mTotal){
            return mat;
        }
        else{
            int[][] ans = new int[r][c];
            int a = 0, b = 0;
            for(int i = 0; i<m; i++){
                for(int j = 0; j<n; j++){
                    if(b == c){
                        a++;
                        b = 0;
                    }
                    ans[a][b] = mat[i][j];
                    b++;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) throws Exception {
        int[][] arr = {{1,2},{3,4}}; 
        int[][] ans = matrixReshape(arr, 1, 4);
        System.out.println(Arrays.deepToString(ans));
    }
}

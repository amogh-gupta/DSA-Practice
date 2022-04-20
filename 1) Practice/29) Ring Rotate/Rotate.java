// Question URL : https://nados.io/question/ring-rotate
import java.util.*;

public class Rotate {

    public static int[][] inputArr(int r, int c, Scanner scn){
        int[][] arr = new int[r][c];
        for(int i = 0; i<r; i++){
            for(int j = 0; j<c; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        return arr;
    }

    public static void ringRotate(int[][] arr, int r, int c, int s, int rotation) {
        Integer[] singleArr = fill1d(arr, r, c, s);
        rotate(singleArr, rotation);
        fill2d(arr, r, c, s, singleArr);
        display(arr);
    }

    public static Integer[] fill1d(int[][] arr, int r, int c, int s) {
        ArrayList<Integer> list = new ArrayList<>();
        int rmin = s-1, rmax = r-s, cmin = s-1, cmax = c-s;
        for(int i = rmin; i<=rmax; i++){
            list.add(arr[i][cmin]);
        }
        for(int i = cmin+1; i<=cmax; i++){
            list.add(arr[rmax][i]);
        }
        for(int i = rmax-1; i>=rmin; i--){
            list.add(arr[i][cmax]);
        }
        for(int i = cmax-1; i>cmin; i--){
            list.add(arr[rmin][i]);
        }
        // int[] ar = new int[list.size()];
        // for(int i = 0; i<list.size(); i++){
        //     ar[i] = list.get(i);
        // }

        // return ar;

        // OR
        int n = list.size();
        return list.toArray(new Integer[n]);
    }

    public static void rotate(Integer[] arr, int rotation) {
        int len = arr.length;
        rotation %= len; 
        if (rotation<0){
            rotation += len;
        }
        ArrayReverse(arr, len-rotation, len-1);
        ArrayReverse(arr, 0, len-rotation-1);
        ArrayReverse(arr, 0, len-1);

        
    }

    public static void fill2d(int[][] arr, int r, int c, int s, Integer[] ar) {
        int rmin = s-1, rmax = r-s, cmin = s-1, cmax = c-s, count = 0;
        for(int i = rmin; i<=rmax; i++){
            arr[i][cmin] = ar[count];
            count++;
        }
        for(int i = cmin+1; i<=cmax; i++){
            arr[rmax][i] = ar[count];
            count++;
        }
        for(int i = rmax-1; i>=rmin; i--){
            arr[i][cmax] = ar[count];
            count++;
        }
        for(int i = cmax-1; i>cmin; i--){
            arr[rmin][i] = ar[count];
            count++;
        }
    }

    public static void ArrayReverse(Integer[] a, int start, int end){
        while(start < end){
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
        
        ringRotate(arr, r, c, s, rotation);
    }

}

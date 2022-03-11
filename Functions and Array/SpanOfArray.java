import java.util.*;

public class SpanOfArray {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int min = arr[0], max = arr[0];
        for(int var: arr){
            if (var>max){
                max = var;
            }
            if(var<min){
                min = var;
            }
        }
        System.out.println(max-min);
    }  
}

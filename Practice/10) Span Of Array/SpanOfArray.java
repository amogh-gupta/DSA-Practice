import java.util.Scanner;
public class SpanOfArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr = new int[len];
        int min = 0, max = 0;
        for(int i = 0; i<len; i++){
            arr[i] = scn.nextInt();
            if (i==0){
                min = arr[i];
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
            if (arr[i]>max){
                max = arr[i];
            }
        } 
        System.out.println(max-min);
    }
}

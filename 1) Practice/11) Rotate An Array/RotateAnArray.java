import java.util.Scanner;
public class RotateAnArray {
    public static void ArrayRotation(int[] a, int start, int end){
        while(start < end){//} && start!=end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr = new int[len];
        for(int i = 0; i<len; i++){
            arr[i] = scn.nextInt();
        }
        int rotation = scn.nextInt();
        if (rotation<0){
            rotation += len;
        }
        ArrayRotation(arr, len-rotation, len-1);
        ArrayRotation(arr, 0, len-rotation-1);
        ArrayRotation(arr, 0, len-1);
        display(arr);
    }
}

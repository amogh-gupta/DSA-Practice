// Question URL : https://nados.io/question/first-index-and-last-index
import java.util.Scanner;
public class FirstIndexAndLastIndex {
    public static int findFirstIndex(int[] arr, int end, int srch) {
        int start = 0, mid, flag =0;
        while(start<=end){
            mid = (start+end)/2;
            if (srch==arr[mid]){
                flag++;
            }
            if (srch<=arr[mid]){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        if(flag==0){
            return -1;
        }
        return (start);        
    }
    public static int findLastIndex(int[] arr, int end, int srch) {
        int start = 0, mid, flag = 0;
        while(start<=end){
            mid = (start+end)/2;
            if (srch==arr[mid]){
                flag++;
            }
            if (srch>=arr[mid]){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        if(flag==0){
            return -1;
        }
        return (end);        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scn.nextInt();
        }
        int search = scn.nextInt();
        int firstIndex = findFirstIndex(arr, num-1, search);
        int lastIndex = findLastIndex(arr, num-1, search);
        System.out.println(firstIndex + "\n" + lastIndex);
    }
}

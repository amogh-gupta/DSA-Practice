// Question URL : https://nados.io/question/subarray-problem
import java.util.Scanner;
public class BrokenEconomyAlternative {
    public static int binarySearch(int arr[], int end, int srch) {
        int start = 0, mid;
        while(start<=end){
            mid = (start+end)/2;
            if (srch<arr[mid]){
                end = mid-1;
            }
            else if(srch>arr[mid]){
                start = mid+1;
            }
            else{
                System.out.println(arr[mid] +"\n"+arr[mid]);
                return mid;
            }
        }
        System.out.println(arr[start] +"\n"+arr[end]);
        return (-1);        
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scn.nextInt();
        }
        int search = scn.nextInt();
        int indx = binarySearch(arr, num-1, search);
        System.out.println(indx);        
    }
}
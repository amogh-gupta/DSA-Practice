// Question URL : https://nados.io/question/subarray-problem
import java.util.Scanner;
public class SubArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scn.nextInt();
        }
        for (int start = 0; start<num; start++){
            for(int end = start; end<num; end++){
                for(int l = start; l<=end; l++){
                    System.out.print(arr[l]+"\t");
                }
                System.out.println();
            }
        }
    }
}
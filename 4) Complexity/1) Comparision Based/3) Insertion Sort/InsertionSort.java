import java.util.Scanner;
public class InsertionSort {
    public static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int[] sortArray(int[] nums) {
        int n = nums.length-1;
        for(int i = 1; i<=n; i++){
            for(int j = i; j>0; j--){
                if(nums[j]<nums[j-1]){
                    swap(nums, j, j-1);
                }
                else{
                    break;
                }
            }
        }       
        return nums;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int[] arr = {5,2,3,1};
        int[] ans = sortArray(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
        scn.close();
    }
}

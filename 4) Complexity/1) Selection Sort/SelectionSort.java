// Question URL: https://leetcode.com/problems/sort-an-array/submissions/
import java.util.Scanner;
class SelectionSort {
    public static int[] sortArray(int[] nums) {
        for(int i = 0; i<nums.length-1; i++){
            int minIdx = i;
            for(int j = i+1; j<nums.length; j++){
                if(nums[minIdx]>nums[j]){
                    minIdx=j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
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
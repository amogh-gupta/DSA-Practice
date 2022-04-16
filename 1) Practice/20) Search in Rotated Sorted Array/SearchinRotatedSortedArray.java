// Question URL : https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchinRotatedSortedArray {
    public static int binarySearch(int[] nums, int target){
        if(nums == null || nums.length == 0)
            return -1;

        int left = 0, right = nums.length;
        while(left < right){
            // Prevent (left + right) overflow
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){ return mid; }
            else if(nums[mid] < target) { left = mid + 1; }
            else { right = mid; }
        }

        // Post-processing:
        // End Condition: left == right
        if(left != nums.length && nums[left] == target) return left;
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,8,9,0,1,2,3};
        int val = binarySearch(arr, 3);
        System.out.println(val);
    }
}



// int binarySearch(int[] nums, int target){
//     if(nums == null || nums.length == 0)
//       return -1;
  
//     int left = 0, right = nums.length;
//     while(left < right){
//       // Prevent (left + right) overflow
//       int mid = left + (right - left) / 2;
//       if(nums[mid] == target){ return mid; }
//       else if(nums[mid] < target) { left = mid + 1; }
//       else { right = mid; }
//     }
  
//     // Post-processing:
//     // End Condition: left == right
//     if(left != nums.length && nums[left] == target) return left;
//     return -1;
//   }
// Question URL: https://leetcode.com/problems/sort-an-array/submissions/
class Solution {
    public static int[] mergeSort(int[] arr, int lo, int hi) {
        //write your code here
        if(lo == hi){
            return new int[] {arr[lo]};
        }

        int mid = (lo+hi)/2;
        int[] a = mergeSort(arr, lo, mid);
        int[] b = mergeSort(arr, mid + 1, hi);
        int[] res = mergeTwoSortedArrays(a, b);
        return res;
    }
    public static int[] mergeTwoSortedArrays(int[] a, int[] b){
        //write your code here
        int l1 = a.length, l2 = b.length;
        int l3 = l1+l2, ptr, ptr1, ptr2, ele1, ele2;
        int[] arr = new int[l3];
        ptr = ptr1 = ptr2 = 0;
        while(ptr<l3){
          ele1 = (ptr1>=l1) ? Integer.MAX_VALUE : a[ptr1];
          ele2 = (ptr2>=l2) ? Integer.MAX_VALUE : b[ptr2];
          if(ele1<ele2){
            arr[ptr] = ele1;
            ptr1++;
          }
          else{
            arr[ptr] = ele2;
            ptr2++;
          }
          ptr++;
        }

        return arr;
    }
    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    
    }
}
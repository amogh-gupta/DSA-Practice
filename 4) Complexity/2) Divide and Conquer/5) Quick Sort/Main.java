public class Main {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int getPivotIndex(int[] arr, int low, int high, int pivot) {
        int i, j, len = high;
        i = j = low;
        while(j<=len){
            if(arr[j]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return i-1;
    }
    public static void QuickSort(int[] arr, int low, int high){
        if(high<low){
            return;
        }
        if(low == high){
            return;
        }
        int mid = (low+high)/2;
        swap(arr, high, mid); 
        int pivot = arr[high];
        int pivIdx = getPivotIndex(arr, low, high, pivot);
        // System.out.println(pivot + " " + pivIdx);
        QuickSort(arr, low, pivIdx-1);
        QuickSort(arr, pivIdx+1, high);
    }
    public static void main(String[] args) {
        int[] ar = {7, 4, 9, 1, 8, -2, 3};
        // int piv = 3;
        QuickSort(ar, 0, ar.length -1);
        for(int i : ar){
            System.out.print(i + " ");
        }
    }
}

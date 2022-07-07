public class Main {
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void PartitionAnArray(int[] arr, int pivot) {
        int i, j, len = arr.length;
        i = j = 0;
        while(j<len){
            if(arr[j]<=pivot){
                swap(arr, i, j);
                i++;
                j++;
            }
            else{
                j++;
            }
        }
    }
    public static void main(String[] args) {
        int[] ar = {7, 4, 9, 1, 8, -2, 3};
        int piv = 3;
        PartitionAnArray(ar, piv);
        for(int i : ar){
            System.out.print(i + " ");
        }
    }
}

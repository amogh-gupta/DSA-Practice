import java.util.Scanner;

public class FindingElementInAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int findValue = scn.nextInt();
        int ind = -1;
        for(int j = 0; j<n; j++){
            if (arr[j] == findValue){
                ind = j;
            }
        }
        System.out.println(ind);
    }
}
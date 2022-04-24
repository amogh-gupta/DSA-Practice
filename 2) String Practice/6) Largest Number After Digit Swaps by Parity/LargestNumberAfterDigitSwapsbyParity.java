// Question URL : https://leetcode.com/problems/largest-number-after-digit-swaps-by-parity/submissions/
import java.util.Scanner;

public class LargestNumberAfterDigitSwapsbyParity {

    public static int largestInteger(int num) {
        StringBuilder sb = new StringBuilder(num+"");
        for(int i = 0; i<sb.length(); i++){
            char ch1 = sb.charAt(i);
            int maxIdx = i;
            if(isEven(ch1)){
                maxIdx = findNextMaximumEven(sb,i);
            }
            else{
                maxIdx = findNextMaximumOdd(sb,i);
            }
            if(maxIdx != i){
                char ch2 = sb.charAt(maxIdx);
                sb.setCharAt(i, ch2);
                sb.setCharAt(maxIdx, ch1);
            }
        }
        return Integer.parseInt(sb.toString());
    }
    
    public static boolean isEven(char ch){
        int val = Integer.parseInt(String.valueOf(ch));
        if(val%2==0){
            return true;
        }
        return false;
    }
    
    public static int findNextMaximumEven(StringBuilder sb, int indx){
        int maxInd = indx;
        for(int i = indx; i<sb.length(); i++){
            if(sb.charAt(i)%2==0 && sb.charAt(maxInd)<sb.charAt(i)){
                maxInd = i;
            }
        }
        return maxInd;
    }
    
    public static int findNextMaximumOdd(StringBuilder sb, int indx){
        int maxInd = indx;
        for(int i = indx; i<sb.length(); i++){
            if(sb.charAt(i)%2!=0 && sb.charAt(maxInd)<sb.charAt(i)){
                maxInd = i;
            }
        }
        return maxInd;
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num = scn.nextInt();
		System.out.println(largestInteger(num));
        scn.close();
	}
}
// Question URL : https://leetcode.com/problems/minimize-result-by-adding-parentheses-to-expression/
import java.util.Scanner;

public class MinimizeResultbyAddingParenthesestoExpression {
    public static String minimizeResult(String expression) {
        String[] arr = initialSplit(expression);
        
        String[][] arr1 = leftPart(arr[0]);
        String[][] arr2 = rightPart(arr[1]);
        int m = 99999999;
        int[] ex = new int[2];
        for(int i = 0; i<arr1.length; i++){
            int[] ret = checkMinimum(arr1[i], arr2);
            if(ret[0]<m){
                m = ret[0];
                ex[0] = i;
                ex[1] = ret[1];
            }
        }
        String returnString = "";
        int in1 = ex[0], in2 = ex[1];
        if(arr1[in1][0]!="1"){
            returnString += arr1[in1][0] + "(" + arr1[in1][1];
        }
        else{
            returnString += "(" + arr1[in1][1];
        }
        if(arr2[in2][1]!="1"){
            returnString += "+" + arr2[in2][0] + ")" + arr2[in2][1];
        }
        else{
            returnString += "+" + arr2[in2][0] + ")";
        }
        
        return returnString;
    }   
    public static void display(String[][] ar) {
        System.out.print("[ ");
        for(int i = 0; i<ar.length; i++){
            System.out.print("[");
            for(int j = 0; j<ar[i].length; j++){
                System.out.print(ar[i][j]+",");
            }
            System.out.print("], ");
        }
        System.out.print(" ]");
    }
    public static String[] initialSplit(String exp) {
        String[] str = exp.split("\\+");
        return str;
    } 
    public static String[][] leftPart(String str) {
        String[][] arr = new String[str.length()][2];
        for(int i = 0; i<str.length(); i++){
            if(i==0){
                arr[i][0] = "1";
                arr[i][1] = str;
            }
            else{
                arr[i][0] = str.substring(0, i);
                arr[i][1] = str.substring(i,str.length());
            }
        }
        return arr;
    }
    public static String[][] rightPart(String str) {
        String[][] arr = new String[str.length()][2];
        for(int i = 0; i<str.length(); i++){
            if(i==str.length()-1){
                arr[i][1] = "1";
                arr[i][0] = str;
            }
            else{
                arr[i][0] = str.substring(0, i+1);
                arr[i][1] = str.substring(i+1,str.length());
            }
        }
        return arr;
    }
    public static int[] checkMinimum(String[] ar1, String[][] ar2) {
        int min = Integer.parseInt(ar1[0]) * (Integer.parseInt(ar1[1])+Integer.parseInt(ar2[0][0])) * Integer.parseInt(ar2[0][1]);
        int a = 0;
        for(int i = 0; i<ar2.length; i++){
            int calMin = Integer.parseInt(ar1[0]) * (Integer.parseInt(ar1[1])+Integer.parseInt(ar2[i][0])) * Integer.parseInt(ar2[i][1]);
            if(min>calMin){
                min = calMin;
                a = i;
            }
        }
        int[] r = {min, a};
        return r;
    }

    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String val = scn.next();
		System.out.println(minimizeResult(val));
        scn.close();
	}
}

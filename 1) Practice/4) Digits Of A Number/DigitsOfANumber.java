// Question URL: https://nados.io/question/digits-of-a-number 
import java.util.Scanner;
import java.lang.Math;
public class DigitsOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int temp = num, len = 1, ten = 1; 
        while(temp>9){
            temp /= 10;
            len++;
            ten *= 10;
        }        

        while(ten!=0){
            long digit = num/ten;
            num %= ten;
            ten /= 10;
            System.out.println(digit);
        }
    }    
}

// Question URL: https://nados.io/question/inverse-of-a-number
import java.util.Scanner;
import java.lang.Math;
public class InverseOfANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int ret = 0, i = 1;
        while(num>0){
            int digit = num%10;
            int ten = (int)Math.pow(10,digit-1);
            ret += i*ten;
            i++;
            num /= 10;
        }

        System.out.println(ret);
    }
}

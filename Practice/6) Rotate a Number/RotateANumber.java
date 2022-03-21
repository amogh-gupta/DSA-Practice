// Question URL: https://nados.io/question/rotate-a-number
import java.util.Scanner;
import java.lang.Math;
public class RotateANumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k = scn.nextInt(), temp = num, len = 1;
        while(temp>9){
            temp /= 10;
            len++;
        }
        if(k>len ||k<(len*(-1))){
            k /= len;
        }
        if (k<0){
            k += len;
        }
        int p2 = num%(int)(Math.pow(10,k));
        int p1 = num/(int)(Math.pow(10,k));
        int ret = p2*(int)(Math.pow(10,len-k)) + p1;
        System.out.println(ret);
    }
}

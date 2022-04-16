// Question URL: https://nados.io/question/prime-factorisation-of-a-number
// Technique: Factor will always be smaller than square-root 
import java.util.Scanner;
public class PrimeFactorisation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i = 2; i*i<= num; i++){
            while(num%i == 0){
                System.out.print(i + " ");
                num /= i;
            }
        }
        if(num != 1){
            System.out.print(num);

        }
    }    
}

// Question URL : https://nados.io/question/pattern-11
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(), n = 1;
        for(int i = 1; i<=num; i++){
            for(int j = 0; j<i; j++){
                System.out.print(n + "\t");
                n++;
            }
            System.out.println();
        }        
    }
}

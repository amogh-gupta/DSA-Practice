// Question URL : https://nados.io/question/pattern-12
import java.util.Scanner;
public class Pattern11 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt(), first = 0, second = 1, temp;
        for(int i = 1; i<=num; i++){
            for(int j = 0; j<i; j++){
                System.out.print(first + "\t");
                temp = first + second;
                first = second;
                second = temp;
            }
            System.out.println();
        }        
    }
}

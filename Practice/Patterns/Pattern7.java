// Question URL : https://nados.io/question/pattern-7
import java.util.Scanner;
public class Pattern7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = 0;
        for(int i = 0; i<num; i++){
            for(int d = 0; d<space; d++){
                System.out.print(" \t");
            }
            System.out.println("*\t");
            space++;
        }
    }
}

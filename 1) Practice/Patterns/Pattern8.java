// Question URL : https://nados.io/question/pattern-8
import java.util.Scanner;
public class Pattern8 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        // Approach 1
        for(int i = 0; i<num; i++){
            for(int j = 0; j<num; j++){
                if(i+j == num-1){
                    System.out.print("*\t");                    
                }
                else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }

        // Alternative approach
        // int space = num-1;
        // for(int i = 0; i<num; i++){
        //     for(int d = 0; d<space; d++){
        //         System.out.print(" \t");
        //     }
        //     System.out.println("*\t");
        //     space--;
        // }
    }
}

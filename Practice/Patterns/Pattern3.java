// Question URL : https://nados.io/question/pattern-3
import java.util.Scanner;
public class Pattern3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        for(int i = 0; i<num; i++){
            int space = num-i-1;
            for(int j = 0; j<num; j++){
                if(space>0){
                    System.out.print(" \t");
                }
                else{
                    System.out.print("*\t");
                }
                space--;
            }
            System.out.println();
        }        
    }
}

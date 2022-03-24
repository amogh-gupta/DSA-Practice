// Question URL : https://nados.io/question/pattern-6
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = 1, star = num/2 + 1;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<star; j++){
                System.out.print("*\t");
            }
            for(int d = 0; d<space; d++){
                System.out.print(" \t");
            }
            for(int k = 0; k<star; k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<num/2){
                space += 2;
                star--;
            }        
            else{
                space -= 2;
                star++;
            }
        }
    }
}

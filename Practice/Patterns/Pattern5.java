// Question URL : https://nados.io/question/pattern-5
import java.util.Scanner;
public class Pattern5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = num/2, star = 1;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<space; j++){
                System.out.print(" \t");
            }
            for(int k = 0; k<star; k++){
                System.out.print("*\t");
            }
            System.out.println();
            if(i<num/2){
                space--;
                star += 2;
            }        
            else{
                space++;
                star -= 2;
            }
        }
    }
}

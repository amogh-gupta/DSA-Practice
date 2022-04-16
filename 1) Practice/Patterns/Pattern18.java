// Question URL : https://nados.io/question/pattern-18
import java.util.Scanner;
public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = 0, star = num;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<space; j++){
                System.out.print("\t");
            }
            for(int k = 0; k<star; k++){
                if(i<num/2 && i!=0){
                    if(k==0 || k==star-1)
                        System.out.print("*\t");
                    else
                        System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
            if(i<num/2){
                space++;
                star -= 2;
            }        
            else{
                space--;
                star += 2;
            }
        }
    }
}

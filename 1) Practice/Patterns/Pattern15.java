// Question URL : https://nados.io/question/pattern-15
import java.util.Scanner;
public class Pattern15 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = num/2, star = 1, n = 1;
        for(int i = 0; i<num; i++){
            for(int j = 0; j<space; j++){
                System.out.print("\t");
            }
            int temp = n;
            for(int k = 0; k<star; k++){
                System.out.print(temp + "\t");
                if(k<star/2)
                    temp++;
                else
                    temp--;
            }
            System.out.println();
            if(i<num/2){
                space--;
                star += 2;
                n++;
            }        
            else{
                space++;
                star -= 2;
                n--;
            }
        }
    }
}

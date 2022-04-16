// Question URL : https://nados.io/question/pattern-16
import java.util.Scanner;
public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int space = (num*2)-3, temp;
        for(int i = 0; i<num; i++){
            temp = 1;
            for(int number = 0; number<=i; number++){
                System.out.print(temp + "\t");
                temp++;
            }
            for(int j = 0; j<space; j++){
                System.out.print("\t");
            }
            temp--;
            for(int number = 0; number<=i; number++){
                if(temp!=num)
                System.out.print(temp + "\t");
                temp--;
            }
            System.out.println();
            space -= 2;
        }
    }
}

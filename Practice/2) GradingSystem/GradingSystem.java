import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter value of a : ");
        int a = scn.nextInt();
        System.out.println("Enter value of b : ");
        int b = scn.nextInt();
        System.out.println("Enter value of c : ");
        int c = scn.nextInt();

        // Logic
        if(a>b && a>c){ // if false means either a falls in b/w b and c or a is smaller than b and c
            System.out.println("Greatest Number is: " + a);
        }
        else if(b>c){ // if false means c is greatest among all
            System.out.println("Greatest Number is: " + b);
        }
        else{
            System.out.println("Greatest Number is: " + c);
        }
    }
    
}

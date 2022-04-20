// Question URL : https://nados.io/question/pattern-13
import java.util.Scanner;

public class Pattern13BestApproach {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int nc0;
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            nc0 = 1;
            for(int j = 0; j<=i; j++){
                System.out.print(nc0+"\t");
                int x = (nc0*(i-j))/(j+1);
                // int x = nc0*((i-j)/(j+1)); // this will not work as it concidered devison first and on 
                // dividing 1/2 it will take it as 0 not as 0.5 because of int
                nc0 = x;

            }
            System.out.println();
        }
        scn.close();
    }
}

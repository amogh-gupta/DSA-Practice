// Pattern 10 Nados
//		*	
//	*		*	
//*				*	
//	*		*	
//		*	

import java.util.Scanner;

public class Pattern10{
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int row=5;// = scn.nextInt();
        int nspace=row/2, nstar=1;
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=nspace; j++){
                System.out.print("\t");
            }
            for(int k = 1; k<=nstar; k++){
            	if(k==1 || k==nstar) {
            		System.out.print("*\t");
                }
            	else {
            		System.out.print("\t");
            	}
            }
            System.out.println();
            if(i<=row/2){
                 nspace--;
                 nstar += 2;
             }
             else{
                 nspace++;
                 nstar -= 2;
             }
        }
    }
}
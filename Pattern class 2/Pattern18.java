// Pattern 18 nados n=7
//*	*	*	*	*	*	*	
//	*				*	
//		*		*	
//			*	
//		*	*	*	
//	*	*	*	*	*	
//*	*	*	*	*	*	*	
import java.util.Scanner;

public class Pattern18 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
	    int row = scn.nextInt();
	    int nspace = 0, nstar = row;
	    for(int i = 1; i<=row; i++){
	        for(int j =1; j<=nspace; j++){
	            System.err.print("\t");
	        }
	        for(int k =1; k<=nstar; k++){
	            // System.err.print("*\t");
	            if(i<(row+1)/2){
	                if(i==1){
	                System.err.print("*\t");
	                }
	                else{
	                    if(k==1 || k==nstar){
	                        System.err.print("*\t");
	                    }else{
	                        System.err.print("\t");
	                    }
	                }
	            }
	            else{
	                System.err.print("*\t");
	            }
	        }
	        if(i<(row+1)/2){
	            nstar -=2;
	            nspace++;
	        }
	        else{
	            nstar +=2;
	            nspace--;
	        }
	        System.out.println();
	    }

	 }
	}
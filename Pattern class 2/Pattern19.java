// Pattern 19 Nados N=5
//*	*	*		*	
//		*		*	
//*	*	*	*	*	
//*		*			
//*		*	*	*	

import java.util.Scanner;

public class Pattern19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int row=7;// = scn.nextInt();
        for(int i=1; i<=row; i++) {
        	for(int j=1; j<=row; j++) {
        		if(i==1) {
        			if(j>(row+1)/2 && j<row) {
        				System.out.print("\t");
        			}
        			else {
        				System.out.print("*\t");
        			}
        		}
        		else if(i>1 && i<(row+1)/2) {
        			if(j==(row+1)/2 || j==row) {
        				System.out.print("*\t");
        			}
        			else {
        				System.out.print("\t");
        			}
        		}
        		else if(i==(row+1)/2) {
        			System.out.print("*\t");
        		}
        		else if(i>(row+1)/2 && i<row) {
        			if(j==(row+1)/2 || j==1) {
        				System.out.print("*\t");
        			}
        			else {
        				System.out.print("\t");
        			}
        		}
        		else {
        			if(j<(row+1)/2 && j>1) {
        				System.out.print("\t");
        			}
        			else {
        				System.out.print("*\t");
        			}
        		}
        	}
        	System.out.println();
        }
	}

}

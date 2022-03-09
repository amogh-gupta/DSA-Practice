// Pattern 15 Nados n = 5
//		1	
//	2	3	2	
//3	4	5	4	3	
//	2	3	2	
//		1	

import java.util.Scanner;

public class Pattern15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
        int row = 5;//scn.nextInt();
        int nspace = row/2, nnum = 1, number = 1;
        for(int i = 1; i<=row; i++){
        	for(int j = 1; j<=nspace; j++) {
        		System.out.print("\t");
        	}
        	int temp = number;
        	for(int k=1; k<=nnum; k++) {
        		if (k<=nnum/2) {
        			System.out.print(temp+"\t");
        			temp++;
        		}
        		else {
        			System.out.print(temp+"\t");
        			temp--;
        		}
        	}
        	if(i<=row/2){
        		nspace--;
        		nnum+=2;
        		number++;
        	}
        	else {
        		nspace++;
        		nnum-=2;
        		number--;
        	}
        	System.out.println();
        }
    }
}
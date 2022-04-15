import java.io.*;
import java.util.*;

public class PrintAllPalindromicSubstrings {

	public static void check(String str) {
		int len = str.length(), flag = 0;
		for(int i = 0; i<len/2; i++){
			if(str.charAt(i) != str.charAt(len-i-1)){
				flag++;
			}
		}
		if(flag==0){
			System.out.println(str);
		}
	}

	public static void solution(String str){
		int len = str.length();
		String s;
		for(int i = 0; i<len; i++){
			for(int j = i; j<len; j++){
				// s = str.substring(i,j+1);
				check(str.substring(i,j+1));
			}
		}
		
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}

}

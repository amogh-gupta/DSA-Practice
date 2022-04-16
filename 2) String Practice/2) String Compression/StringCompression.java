import java.io.*;
import java.util.*;

public class StringCompression {

	public static String compression1(String str){
			
		if (str.length()>0){
			String s = "";
			s += str.charAt(0);
			int i = 1, len = str.length();
			while(i<len){
				if(str.charAt(i) == s.charAt(s.length()-1)){
					i++;
				}
				else{
					s += str.charAt(i);
					i++;
				}
			}
			return s;
		}
		
		return null;
	}

	public static String compression2(String str){
		if (str.length()>0){
		String s = "";
		s += str.charAt(0);
		int i = 1, len = str.length(), count = 1;
		while(i<len){
			if(str.charAt(i) == s.charAt(s.length()-1)){
				i++;
				count++;
			}
			else{
				if(count>1){
					s+= count;
					count = 1;
				}
				s += str.charAt(i);
				i++;
			}
		}
		if(i == len && count>1){
			s+= count;
		}
		return s;
	}
			
		return null;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}

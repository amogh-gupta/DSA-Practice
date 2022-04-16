// Question-url : https://nados.io/question/string-with-difference-of-every-two-consecutive-characters
import java.io.*;
import java.util.*;

public class StringWithDifferenceOfEveryTwoConsecutiveCharacters {

	public static String solution(String str){
		if(str.length()>0){
			StringBuilder sb = new StringBuilder("");
			sb.append(str.charAt(0));
			for(int i = 1; i<str.length(); i++){
				char c1 = str.charAt(i-1), c2 = str.charAt(i);
				sb.append(c2-c1);
				sb.append(str.charAt(i));
			}
			return sb.toString();
		}

		return null;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}

}
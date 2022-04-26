// Question-url : https://nados.io/question/toggle-case
import java.io.*;
import java.util.*;

public class ToggleCase {

	public static String toggleCase(String str) {
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i<sb.length(); i++){
			char c = sb.charAt(i);
			if(c>='a' && c<='z'){
				sb.setCharAt(i, (char)(c - 'a' + 'A'));
			}
			else if(c>='A' && c<='Z'){
				sb.setCharAt(i, (char)(c - 'A' + 'a'));
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
		scn.close();
	}

}
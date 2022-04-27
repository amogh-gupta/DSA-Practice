// Question URL: https://nados.io/question/get-subsequence
import java.io.*;
import java.util.*;

public class GetSubsequenceain {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        ArrayList<String> ans = gss(str);
        System.out.println(ans);
        scn.close();
    }
    
    public static ArrayList<String> gss(String str) {
        if(str.length() == 0){
            ArrayList<String> ret = new ArrayList<String>();
            ret.add("");
            return ret;
        }
        String s = str.substring(1);
        char ch = str.charAt(0);
        ArrayList<String> retAns = new ArrayList<String>();
        ArrayList<String> ret = gss(s);

        for(String val : ret){
            retAns.add(val);
        }
        
        for(String val : ret){
            retAns.add(ch+val);
        }

        return retAns;
    }

}
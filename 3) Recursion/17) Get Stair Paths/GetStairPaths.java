import java.io.*;
import java.util.*;

public class GetStairPaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int val = scn.nextInt();
        ArrayList<String> ret = getStairPaths(val);
        System.out.println(ret);
        scn.close();
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n==0){
            ArrayList<String> retAr = new ArrayList<String>();
            retAr.add("");
            return retAr;
        }
        ArrayList<String> retArr = new ArrayList<String>();
        if(n>=1){
            ArrayList<String> retAr = getStairPaths(n-1);
            for(String val: retAr){
                retArr.add(1+val);
            }
        }
        if(n>=2){
            ArrayList<String> retAr = getStairPaths(n-2);
            for(String val: retAr){
                retArr.add(2+val);
            }
        }
        if(n>=3){
            ArrayList<String> retAr = getStairPaths(n-3);
            for(String val: retAr){
                retArr.add(3+val);
            }
        }
        return retArr;
    }

}
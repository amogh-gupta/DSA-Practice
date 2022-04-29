// Question URL: https://nados.io/question/get-maze-paths
import java.io.*;
import java.util.*;

public class GetMazePaths {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int dr = scn.nextInt();
        int dc = scn.nextInt();
        ArrayList<String> path = getMazePaths(0, 0, dr-1, dc-1);
        System.out.println(path);
        scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sr>dr || sc>dc){
            ArrayList<String> base = new ArrayList<String>();
            return base;
        }

        if(sr==dr && sc==dc){
            ArrayList<String> base = new ArrayList<String>();
            base.add("");
            return base;
        }

        ArrayList<String> fPath = new ArrayList<String>();
        ArrayList<String> hPath = getMazePaths(sr, sc+1, dr, dc);
        ArrayList<String> vPath = getMazePaths(sr+1, sc, dr, dc);

        for(String val : hPath){
            fPath.add("h"+val);
        }

        for(String val : vPath){
            fPath.add("v"+val);
        }
        
        
        
        return fPath;
    }

}
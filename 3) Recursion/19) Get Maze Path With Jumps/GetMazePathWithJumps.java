// Question URL: https://nados.io/question/get-maze-path-with-jumps
import java.io.*;
import java.util.*;

public class GetMazePathWithJumps {

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

        for(int i = 1; i<= dc-sc; i++){
            ArrayList<String> hPath = getMazePaths(sr, sc+i, dr, dc);

            for(String val : hPath){
                fPath.add("h"+i+val);
            }
        }
        
        for(int i = 1; i<= dr-sr; i++){
            ArrayList<String> vPath = getMazePaths(sr+i, sc, dr, dc);

            for(String val : vPath){
                fPath.add("v"+i+val);
            }
        }

        for(int i = 1; i<= dr-sr && i<= dc-sc; i++){
            ArrayList<String> dPath = getMazePaths(sr+i, sc+i, dr, dc);

            for(String val : dPath){
                fPath.add("d"+i+val);
            }
        }
        
        return fPath;
    }

}
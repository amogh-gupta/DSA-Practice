// Question URL: https://nados.io/question/print-maze-paths
import java.io.*;
import java.util.*;

public class PrintMazePaths {

    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int dr = scn.nextInt();
    int dc = scn.nextInt();
    printMazePaths(0, 0, dr-1, dc-1, "");
    scn.close();
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr>dr || sc>dc){
            return;
        }
        if(sr==dr && sc==dc){
            System.out.println(psf);
            return;
        }
        if(sc+1 <= dc){
            printMazePaths(sr, sc+1, dr, dc, psf+"h");
        }
        if(sr+1 <= dr){
            printMazePaths(sr+1, sc, dr, dc, psf+"v");
        }
        
    }

}
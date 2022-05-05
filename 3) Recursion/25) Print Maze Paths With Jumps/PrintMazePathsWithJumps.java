// Question URL: https://nados.io/question/print-maze-paths-with-jumps
import java.io.*;
import java.util.*;

public class PrintMazePathsWithJumps {

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
        for(int i = 1; i<=dc-sc; i++){
           printMazePaths(sr, sc+i, dr, dc, psf+"h"+i);
		}

        for(int i = 1; i<=dr-sr; i++){
           printMazePaths(sr+i, sc, dr, dc, psf+"v"+i);
		}

        for(int i = 1; i<=dr-sr && i<=dc-sc; i++){
           printMazePaths(sr+i, sc+i, dr, dc, psf+"d"+i);
		}

    }

}
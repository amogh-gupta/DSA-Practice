import java.io.*;
import java.util.*;

public class TowerOfHanoi {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int slab = scn.nextInt();
        int src = scn.nextInt();
        int dest = scn.nextInt();
        int helpr = scn.nextInt();
        toh(slab, src, dest, helpr);
        scn.close();
    }

    public static void toh(int n, int t1id, int t2id, int t3id){
        if(n==0){
            return;
        }
        toh(n-1, t1id, t3id, t2id);
        System.out.println(n+"["+t1id+" -> "+t2id+"]");
        toh(n-1, t3id, t2id, t1id);
        
    }

}
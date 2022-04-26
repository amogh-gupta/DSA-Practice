// Question URL: https://nados.io/question/any-base-to-any-base
import java.util.*;
  
  public class AnyBaseToAnyBase{
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int d = getValueIndecimal(n, sourceBase);
     int dn = getValueInBase(d, destBase);
     System.out.println(dn);
     scn.close();
   }   

   public static int getValueInBase(int n, int b){
       int temp, ret = 0, base = 1;
       while(n>0){
           temp = n%b;
           ret = (temp*base) + ret;
           base *=10;
           n /= b;
       }
       return ret;
   }
   public static int getValueIndecimal(int n, int b){
      int ret = 0, temp, base = 1;
      while(n>0){
         temp = n%10;
         ret = (temp*base) + ret;
         base *= b;
         n /= 10;
      }
      return ret;
   }
  }
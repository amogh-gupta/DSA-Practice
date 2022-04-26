// Question URL: https://nados.io/question/decimal-to-any-base
import java.util.*;
  
  public class DecimalToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int dn = getValueInBase(n, b);
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
  }
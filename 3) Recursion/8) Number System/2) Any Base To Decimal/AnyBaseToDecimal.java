// Question URL: https://nados.io/question/any-base-to-decimal
import java.util.*;
  
  public class AnyBaseToDecimal{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
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
import java.util.*;
  
  public class AnyBaseAddition{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
  
      int d = getSum(b, n1, n2);
      System.out.println(d);
      scn.close();
   }
  
   public static int getSum(int b, int n1, int n2){
       int temp1, temp2, mul = 1, ret = 0, carry = 0, val;
       while(n1>0 || n2>0){
           temp1 = n1>0 ? n1%10 : 0;
           temp2 = n2>0 ? n2%10 : 0;
           val = temp1 + temp2 + carry;
           carry = val/b;
           val %= b;
           ret += (val*mul);
           mul *= 10;
           n1/=10;
           n2/=10;
       }
       ret = ret + carry*mul;
       return ret;
   }
  }
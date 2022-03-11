// import java.util.Scanner;

public class FunctionsIntro{
    public static void add1(int n1, int n2) {
        int ans = n1+n2;
        System.out.println(ans);
    }
    public static int add2(int n1, int n2) {
        int ans = n1+n2;
        return ans;
    }
    public static void main(String[] args) {
        add1(10,15);
        System.out.println(add2(12,13));
    }
}
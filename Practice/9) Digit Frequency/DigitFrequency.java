import java.util.Scanner;
public class DigitFrequency {
    public static int digitFrequency(int num1, int num2){
        int freq = 0;
        while(num1>0){
            if (num1%10 == num2){
                freq++;
            }
            num1 /= 10;
        }
        return freq;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int frequency = digitFrequency(n1, n2);
        System.out.println(frequency);
    }
}

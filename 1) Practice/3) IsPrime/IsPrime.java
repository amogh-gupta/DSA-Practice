import java.util.Scanner;
public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = scn.nextInt();
        boolean flag = true;

        for(int i = 2; i*i<num; i++){ // Refer video @ 23 02-2022 - 02:50:00
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        if (flag == true){
            System.out.println("Number is Prime");
        }
        else{
            System.out.println("Number is Not Prime");
        }
    }
}

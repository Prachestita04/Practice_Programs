package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $13ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an armstrong number or not");
        int num = sc.nextInt();
        int temp = num;
        int count =0;
        int result = 0,arm =num;
        while (num>0){
            num = num/10;
            count++;
        }
        while (temp!=0){
            int rem;
            int mul = 1;
            rem = temp%10;
            for (int j = 1;j<=count;j++){
                mul = mul*rem;
            }
            result = result + mul;
            temp = temp/10;
        }
        if(result == arm){
            System.out.println("Given number is an armstrong number");
        }
        else {
            System.out.println("Given number is not an armstrong number");
        }
    }
}

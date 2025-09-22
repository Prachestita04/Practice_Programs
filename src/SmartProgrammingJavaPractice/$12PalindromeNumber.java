package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $12PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        int rev = 0;
       while (num!=0){
            rev = rev *10+num%10;
            num = num/10;
        }
        if (rev==temp){
            System.out.println("Given number is a palindrome number");
        }
        else {
            System.out.println("Given number is not a palindrome number");
        }
    }
}


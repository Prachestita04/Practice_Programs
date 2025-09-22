package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $19SwappingOfTwoNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;

//         num1 = num1+num2;
//         num2 = num1 - num2;
//         num1 = num1 -num2;

//        num1 = num1*num2;
//        num2 = num1/num2;
//        num1 = num1/num2;

//        num1 = num1 ^ num2;
//        num2 = num1 ^num2;
//        num1 = num1 ^ num2;

        num2 = num1+num2-(num1 = num2);
        System.out.println("After swapping 1st no is "+num1+" and 2nd no is "+num2);
    }
}

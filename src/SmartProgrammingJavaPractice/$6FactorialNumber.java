package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $6FactorialNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find its factorial : ");
        int num = sc.nextInt();
        int fact = 1;
//        int result=0;
        if (num < 0) {
            System.out.println("Invalid input give only positive number");
        } else if (num == 0 || num == 1) {
            System.out.println("Factorial of " + num + " is 1");
        } else {
//            for (int i =num;i>=1;i--){
//                fact = fact * i;
//            }
            int i = num;
            while (i >= 1) {
                fact = fact * i;
                i--;
            }
            System.out.println("Factorial of " + num + " is " + fact);
        }

    }
}

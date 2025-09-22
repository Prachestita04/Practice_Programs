package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $5FactorialRecursionProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to find its factorial: ");
        int num = sc.nextInt();
        int result = fact(num);
        System.out.println("Factorial of " + num + " is " + result);
    }

    private static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}

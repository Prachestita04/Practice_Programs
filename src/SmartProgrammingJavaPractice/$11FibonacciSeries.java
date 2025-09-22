package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $11FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter place number upto which yo can see the series: ");
        int place = sc.nextInt();
        int num1 = 0, num2 = 1;
        if (place == 1) {
            System.out.println(num1);
        } else if (place == 2) {
            System.out.print(num1 + " " + num2 + " ");
        } else if (place > 2) {
            System.out.print(num1 + " " + num2 + " ");
            for (int i = 2; i < place; i++) {
                System.out.print(num1 + num2 + " ");
                num2 = num1 + num2;
                num1 = num2 - num1;
            }
        } else {
            System.out.println("Invalid input and Place value is starting from 1");
        }
    }
}

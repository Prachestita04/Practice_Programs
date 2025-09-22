package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $17CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();
        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulo Division");
        System.out.println("6. Exit Program");
        System.out.println("Enter your choice and give numbers from 1 to 6");
        String ch = sc.next();
        switch (ch){
            case "1":
                System.out.println("Addition is: "+(num1 + num2));
                break;
            case "2":
                System.out.println("Subtraction is: "+(num1 - num2));
                break;
            case "3":
                System.out.println("Multiplication is: "+(num1 * num2));
                break;
            case "4":
                System.out.println("Division is: "+(num1 / num2));
                break;
            case "5":
                System.out.println("Modulo division is: "+(num1 % num2));
                break;
            case "6":
                System.out.println("Exit program");
                System.exit(0);
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}

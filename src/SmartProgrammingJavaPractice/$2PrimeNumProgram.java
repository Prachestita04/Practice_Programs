package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $2PrimeNumProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check prime: ");
        int num = sc.nextInt();
        int count = 0;

        if (num < 0) {
            System.out.println("Invalid input give a positive number to check");
        } else if (num == 0 || num == 1) {
            System.out.println(num + " is neither a prime number nor composite number");
        } else {
            for (int i = 2; i <= (num / 2); i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is a composite number");
            }
        }


    }

}

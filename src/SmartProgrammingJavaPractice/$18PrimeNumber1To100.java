package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $18PrimeNumber1To100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 100 are:");
        for (int i = 1;i<=100;i++){
            if (checkPrime(i)){
                System.out.print(i +" ");
            }
        }
    }
    private static boolean checkPrime(int n){
        if (n==1){
            return false;
        }
        for (int i = 2;i<=(n/2);i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}

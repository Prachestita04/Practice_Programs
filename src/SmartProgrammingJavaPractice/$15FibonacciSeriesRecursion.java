package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $15FibonacciSeriesRecursion {
   static int num1 = 0, num2=1,num3;
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value upto which place you want to see series");
        int place = sc.nextInt();
        if (place==0){
            System.out.println("Invalid");
        }else if(place==1) {
            System.out.println(num1);
        }
        else if (place>1){
        System.out.print(num1+" "+num2);
        fibonacciSeries(place);
        }
        else {
            System.out.println("Invalid give positive number");
        }
    }
    private static void fibonacciSeries(int p){
       if(p>2) {
             num3 = num1 + num2;
            System.out.print(" "+num3);
            num1 = num2;
            num2 = num3;
            fibonacciSeries(p - 1);
        }
    }
}

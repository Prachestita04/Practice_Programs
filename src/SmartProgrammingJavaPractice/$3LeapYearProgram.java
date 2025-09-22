package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $3LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one year to check if is it a leap year or not: ");
        int year = sc.nextInt();
        if(year > 0){
            if((year % 400 ==0)||(year %4==0 && year %100 !=0)){
                System.out.println(year+" is a leap year");
            }
            else {
                System.out.println(year + " is not a leap year");
            }
        }
        else {
            System.out.println("Invalid input");
        }
    }
}

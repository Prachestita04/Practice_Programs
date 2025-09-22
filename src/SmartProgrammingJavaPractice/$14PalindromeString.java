package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $14PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");
        String str = sc.next();
        String tempStr = str;
        String rev = "";
        for (int i = str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        if(rev.equals(tempStr)){
            System.out.println("Given string is a palindrome string");
        }
        else {
            System.out.println("Not a palindrome string");
        }

    }
}

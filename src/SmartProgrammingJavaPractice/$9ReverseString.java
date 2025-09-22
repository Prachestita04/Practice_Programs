package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $9ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.next();
        int len = str.length();
//        for (int i =len-1;i>=0;i--){
//            System.out.print(str.charAt(i));
//        }

//        char[] ch = str.toCharArray();
//        for (int i = ch.length-1;i>=0;i--){
//            System.out.print(ch[i]);
//        }

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());


    }
}

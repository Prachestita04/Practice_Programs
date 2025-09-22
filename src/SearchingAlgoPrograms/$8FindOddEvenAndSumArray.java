package SearchingAlgoPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class $8FindOddEvenAndSumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        ArrayList<Integer> al1 = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();
        for (int i =0;i< arr.length;i++){
            if(arr[i]%2==0){
                al1.add(arr[i]);
            }else {
                al2.add(arr[i]);
            }
        }
        int total1 = 0, total2 = 0;
        System.out.println("Even numbers in array are: ");
        for (int no:al1){
            total1 = total1 + no;
            System.out.println(no);
        }
        System.out.println("Sum of even numbers are:"+total1);
        System.out.println("Even Array size is: "+al1.size());

        System.out.println("Odd numbers in array are: ");
        for (int no:al2){
            total2 = total2+no;
            System.out.println(no);
        }
        System.out.println("Sum of odd numbers is: "+total2);
        System.out.println("Odd Array size is : "+al2.size());
    }
}

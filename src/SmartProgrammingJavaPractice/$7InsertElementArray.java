package SmartProgrammingJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class $7InsertElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter element to be inserted: ");
        int element = sc.nextInt();
        int pos = 2;
        for (int j = args.length-1;j>=pos-1;j--){
            arr[j] = arr[j-1];
        }
        arr[pos-1]=element;
        System.out.println("New array is: ");
        for (int i = 0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}

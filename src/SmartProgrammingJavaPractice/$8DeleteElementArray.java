package SmartProgrammingJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class $8DeleteElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Enter one element you want to delete from this array ");
        int delElement = sc.nextInt();
        int count =0;
        for (int i=0;i< arr.length;i++){
            if(delElement==arr[i]){
                for (int j = i;j<arr.length-1;j++){
                    arr[j]=arr[j+1];
                }
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element deleted successfully");
            System.out.println("New array is:");
            for (int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
        }

    }
}

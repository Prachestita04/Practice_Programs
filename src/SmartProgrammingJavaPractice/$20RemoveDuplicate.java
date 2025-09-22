package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $20RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        int[] temp = new int[arr.length];
        int j=0;
        for (int i =0;i< arr.length-1;i++){
            if (arr[i]!=arr[i+1]){
                arr[j] = arr[i];
                j++;
            }
        }
        arr[j]=arr[arr.length-1];
        System.out.println("New array is:");
        for (int i=0;i<j+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

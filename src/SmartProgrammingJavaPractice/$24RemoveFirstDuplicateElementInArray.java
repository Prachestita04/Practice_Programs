package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $24RemoveFirstDuplicateElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int j=0;
        for (int i=0;i< arr.length-1;i++){
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
//                break;
            }
            else {

            }
        }
        arr[j]=arr[arr.length-1];
        for (int i=0;i<j+1;i++){
            System.out.println(arr[i]);
        }
    }
}

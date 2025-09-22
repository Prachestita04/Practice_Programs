package SearchingAlgoPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class $4KthLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int temp, k;
        System.out.println("Give kth position:");
        k = sc.nextInt();
        for (int i =0;i<arr.length;i++){
            for (int j=i+1;j< arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(k+"th largest element is "+arr[i]);
                break;
            }
        }

    }
}

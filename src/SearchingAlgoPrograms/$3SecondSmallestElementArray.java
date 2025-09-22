package SearchingAlgoPrograms;

import java.util.Scanner;

public class $3SecondSmallestElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int temp;
//        for (int i =0;i<arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if(arr[i]>arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//            if (i==1){
//                break;
//            }
//        }
//        System.out.println("Second smallest element is "+arr[1]);

        int smallest = Integer.MAX_VALUE;
        int second_smallest = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                second_smallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < second_smallest && arr[i] != smallest) {
                second_smallest = arr[i];
            }
        }
        if (second_smallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element in array");
        } else {
            System.out.println("Second smallest element in array is : " + second_smallest);
        }
    }
}

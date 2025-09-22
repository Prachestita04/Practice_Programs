package SearchingAlgoPrograms;

import java.util.Scanner;

public class $2SecondLargestElementArray {
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
//                if(arr[i]<arr[j]){
//                    temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            } else if (arr[i] > second_largest && arr[i] != largest) {
                second_largest = arr[i];
            }
        }
        if (second_largest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element in array");
        } else {
            System.out.println("Second largest element in array is : " + second_largest);
        }
    }
}

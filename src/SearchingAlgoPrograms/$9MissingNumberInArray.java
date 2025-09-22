package SearchingAlgoPrograms;

import java.util.Scanner;

public class $9MissingNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        int exp_element = arr.length+1;
//        int total_sum = (exp_element*(exp_element+1))/2;
//        int sum =0;
//        for (int i=0;i< arr.length;i++){
//            sum = sum+arr[i];
//        }
//        System.out.println("Missing element in array is: "+(total_sum - sum));
//below code only work for starting from 1,2,3,5,6 = missing 4
//        int xor1 = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            xor1 = xor1 ^ arr[i];
//        }
//
//        int xor2 = 1;
//        for (int i = 2; i <= (arr.length + 1); i++) {
//            xor2 = xor2 ^ i;
//        }
//        System.out.println("Missing element in array is: " + (xor1 ^ xor2));

        int large = arr[0], small = arr[0], sum = 0, sumArr = 0;
        boolean flag = false;
        for (int t = 0; t < arr.length; t++) {
            int checkElement = arr[t];
            for (int c = t + 1; c < arr.length; c++) {
                if (checkElement == arr[c]) {
                    flag = true;
                    break;
                }
            }
        }
        if (flag) {
            System.out.println("Give distinct elements in your array");
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (small > arr[i]) {
                    small = arr[i];
                }
                if (large < arr[i]) {
                    large = arr[i];
                }
            }
            for (int j = small; j <= large; j++) {
                sum = sum + j;
            }
            for (int k = 0; k < arr.length; k++) {
                sumArr = sumArr + arr[k];
            }
            int miss = sum - sumArr;
            System.out.println("The missing element in an array is:" + miss);
        }
    }
}

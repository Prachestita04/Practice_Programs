package SearchingAlgoPrograms;

import java.util.Scanner;

public class $1MaxAndMinElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }

        int max  = arr[0], min = arr[0];
        for (int i= 1;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if (arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element in array is : "+max);
        System.out.println("Minimum element in an array is: "+min);
    }
}

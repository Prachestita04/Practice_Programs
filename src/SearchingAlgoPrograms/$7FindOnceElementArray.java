package SearchingAlgoPrograms;

import java.util.Scanner;

public class $7FindOnceElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int res = arr[0];
        for (int i=1;i< arr.length;i++){
              res = res ^ arr[i];
        }
        System.out.println("Element that appear once is "+res);
    }
}

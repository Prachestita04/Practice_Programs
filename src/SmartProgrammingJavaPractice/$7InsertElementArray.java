package SmartProgrammingJavaPractice;

import java.util.Scanner;

public class $7InsertElementArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total size of array (e.g. - size = 5 , array size = 6  )");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int maxSize = size-1;
        System.out.println("Enter elements of array:");
        for (int i=0;i<maxSize;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to be inserted: ");
        int element = sc.nextInt();
        //insert according to index (starts from 0)
//        int idx = 2;
//        for (int j = maxSize; j> idx; j--){
//            arr[j] = arr[j-1];
//        }
//        arr[idx]=element;

        //insert according to position(starts from 1)
        int pos = 2;
        for (int j = maxSize; j>=pos; j--){
            arr[j] = arr[j-1];
        }
        arr[pos-1]=element;
        System.out.println("New array is: ");
        for (int i = 0;i<=maxSize;i++){
            System.out.println(arr[i]);
        }
    }
}

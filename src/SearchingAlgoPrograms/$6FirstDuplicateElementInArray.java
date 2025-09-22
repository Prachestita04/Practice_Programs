package SearchingAlgoPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class $6FirstDuplicateElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
//        System.out.println("Duplicate element is ");
//        int temp =0;
//        for (int i=0;i< arr.length-1;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[i]==arr[j] && i!=j){
//                    System.out.println(arr[i]);
//                    temp++;
//                    break;
//                }
//            }
//
//               if(temp>0){
//                   break;
//               }
//        }

        HashSet<Integer> hs = new HashSet<>();
        int temp = -1;
        for (int i= arr.length-1;i>=0;i--){
            if (hs.contains(arr[i])){
                temp=i;
            }else {
                hs.add(arr[i]);
            }
        }
        if (temp!=-1){
            System.out.println("First duplicate element is: "+arr[temp]);
        }else {
            System.out.println("first duplicate element not found");
        }
    }
}

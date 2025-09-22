package SmartProgrammingJavaPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class $23FindFirstDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("First duplicate element is ");
//        int temp =0;
//        for (int i=0;i< arr.length-1;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if (arr[i]==arr[j] && i!=j){
//                    System.out.println(arr[i]);
//                    temp++;
//                    break;
//                }
//            }
//            if (temp>0){
//                break;
//            }
//        }

        Set<Integer> hs = new HashSet<>();
        int temp=-1;
        for (int i= arr.length-1;i>=0;i--){
            if (hs.contains(arr[i])){
                temp = i;
            }
            else {
                hs.add(arr[i]);
            }
        }
        if (temp!=-1){
            System.out.println("First duplicate element is: "+arr[temp]);
        }
        else {
            System.out.println("No duplicate element present in array ");
        }
    }
}

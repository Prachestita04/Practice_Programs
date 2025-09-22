package SmartProgrammingJavaPractice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class $21DuplicateRemove {
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
        for (int i=0;i< arr.length-1;i++){    //{1,2,3,1}
            if(arr[i]!=arr[i+1]){
                arr[j]=arr[i];
                j++;
            }
        }
        arr[j] =arr[arr.length-1];
        System.out.println("New array is:");
        for (int i=0;i<j+1 ;i++){
            System.out.println(arr[i]);
        }

//        Set<Integer> hs = new HashSet<>();
//        for (int i=0;i< arr.length;i++){
//            hs.add(arr[i]);
//        }
//        System.out.println("New array is:");
//        for (int no:hs){
//            System.out.print(no+" ");
//        }
    }
}

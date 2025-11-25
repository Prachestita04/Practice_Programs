package SmartProgrammingJavaPractice;

import java.util.Arrays;
import java.util.Scanner;

public class $26SelectionSort {
    public static void main(String[] args) {
        System.out.println("Enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i=0;i<a.length;i++){
            a[i]=sc.nextInt();

        }
        for (int i=0;i<a.length-1;i++){
           int smallest = i;
           for (int j=i+1;j<a.length;j++){
               if(a[smallest]>a[j]){
                   smallest = j;
               }
           }
           int temp = a[smallest];
           a[smallest] = a[i];
           a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }

}

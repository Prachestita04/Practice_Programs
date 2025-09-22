package SmartProgrammingJavaPractice;

import java.util.*;

public class $22FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array elements:");
        for (int i=0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
//        System.out.println("Duplicate element: ");
//        for (int i=0;i< arr.length-1;i++){
//             for (int j=i+1;j< arr.length;j++){
//                 if (arr[i]==arr[j] && i!=j){
//                     System.out.println(arr[j]);
//                 }
//             }
//        }
//        Set<Integer> hs =new HashSet<>();
//        for (int no:arr){
//            if(!hs.add(no)){
//                System.out.println(no);
//            }
//        }

        Map<Integer,Integer> hm = new HashMap<>();
        for (int no:arr){
            Integer count = hm.get(no);
            if(count == null){
                hm.put(no,1);
            }
            else {
                count = count+1;
                hm.put(no,count);
            }
        }
        System.out.println("Duplicate elements: ");
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for (Map.Entry<Integer,Integer> me:es){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}

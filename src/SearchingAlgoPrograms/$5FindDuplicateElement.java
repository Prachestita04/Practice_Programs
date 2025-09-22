package SearchingAlgoPrograms;

import java.util.*;

public class $5FindDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //bruteforce method - right till two duplicate values
//        System.out.println("Duplicate element ");
//        for (int i=0;i< arr.length;i++){
//            for (int j=i+1;j< arr.length;j++){
//                if(arr[i]==arr[j] && i!=j){
//                    System.out.println(arr[j]);
//                }
//            }
//        }

        //using set interface - right till two duplicate values
//        System.out.println("Duplicate elements are: ");
//        Set<Integer> s = new HashSet<>();
//        for (int n:arr){
//            if (!s.add(n)){
//                System.out.println(n);
//            }
//        }

        //Using hashtable

        Map<Integer,Integer> hm = new HashMap<>();
        for (int n:arr){
            Integer count = hm.get(n);
            if(count==null){
                hm.put(n,1);
            }
            else {
                count = count+1;
                hm.put(n,count);
            }
        }
        System.out.println("Duplicate elements: ");
        Set<Map.Entry<Integer,Integer>> es = hm.entrySet();
        for (Map.Entry<Integer,Integer> me : es){
            if(me.getValue()>1){
                System.out.println(me.getKey());
            }
        }
    }
}

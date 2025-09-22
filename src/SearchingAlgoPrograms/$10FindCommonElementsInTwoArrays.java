package SearchingAlgoPrograms;

import java.util.HashSet;

public class $10FindCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] a1= {3,2,5,6,1};
        int[] a2={2,9,7,9,4,8};
        System.out.println("Duplicate elements are: ");
//        for (int i = 0;i<a1.length;i++){
//            for (int j=0;j<a2.length;j++){
//                if (a1[i]==a2[j]){
//                    System.out.println(a1[i]);
//                }
//            }
//        }

//        HashSet<Integer> hs=new HashSet<>();
//        for (int i = 0;i<a1.length;i++){
//            for (int j=0;j<a2.length;j++){
//                if (a1[i]==a2[j]){
//                    hs.add(a1[i]);
//                    break;
//                }
//            }
//        }
//        for (int n:hs){
//            System.out.println(n);
//        }

//        HashSet<Integer> hs = new HashSet<>();
//        for (int n:a1){
//            hs.add(n);
//        }
//        for (int n:a2){
//            boolean b = hs.add(n);
//            if(!b){
//                System.out.println(+n+" ");
//            }
//        }

        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int n:a1){
            hs1.add(n);
        }
        for (int n:a2){
            hs2.add(n);
        }
        for (int n:hs2){
            boolean b = hs1.add(n);
            if (!b){
                System.out.println(n);
            }
        }
    }
}

package SearchingAlgoPrograms;

import java.util.HashSet;

public class $12LongestConsecutiveSequenceInArray {
    public static void main(String[] args) {
        int[] a = {3,9,1,10,4,20,2};
        HashSet<Integer> hs = new HashSet<>();
        for (int i=0;i<a.length;i++){
            hs.add(a[i]);
        }
        int long_length = 0;
        for (int i=0;i<a.length;i++){
            if(!hs.contains(a[i]-1)){
                int no = a[i];

                while (hs.contains(no)){
                    no++;
                }
                if(long_length<no - a[i]){
                    long_length = no - a[i];
                }
            }

        }
        System.out.println("Length of longest consecutive sequence in array is: "+long_length);
    }
}

package SearchingAlgoPrograms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Demo {
    public static void main(String[] args) {
        int[] a = {3, 9, 1, 10, 4, 20, 2};
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        int cons_length = 0;
        int temp_size = 0;
        ArrayList al = new ArrayList();
        for (int i = 0; i < a.length; i++) {
            if (hs.contains(a[i] - 1)) {
                continue;
            } else {
                int no = a[i];
                while (hs.contains(no)) {
                    al.add(no);
                    no++;
                }
                if (cons_length < al.size()) {
                    cons_length = al.size();
                }
                al.clear();
            }
        }
        System.out.println(cons_length);
    }
}

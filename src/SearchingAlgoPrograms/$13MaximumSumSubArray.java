package SearchingAlgoPrograms;

public class $13MaximumSumSubArray {
    public static void main(String[] args) {
        int[] a = {4,-2,-3,4,-1,-2,1,5,-3};
        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;

        int si = 0, start = 0, end =0;
        for (int i=0;i<a.length;i++){
            max_ending_here = max_ending_here + a[i];
            if(max_so_far<max_ending_here){
                max_so_far = max_ending_here;
                start  = si;
                end = i;
            }
            if (max_ending_here < 0){
                max_ending_here = 0;
                si = i + 1;
            }
        }
        System.out.println(max_so_far);
        System.out.println("Starting index position is : "+start+" and ending index position is: "+end);
    }
}

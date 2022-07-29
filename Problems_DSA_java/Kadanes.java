public class Kadanes {
    public static void main(String ar[]){
        //largest sum contiguous subarray
        int[] arr={-2, -3, 4, -1, -2, 1, 5, -3};
        int max_so_far=Integer.MIN_VALUE;
        int max_ending_here=0;
        for(int i=0;i<arr.length;i++){
            max_ending_here+=arr[i];
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
            if(max_ending_here<0)
            max_ending_here=0;
        }
        System.out.println(max_so_far);

    }
    
}

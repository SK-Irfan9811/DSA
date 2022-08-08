import java.util.*;
public class Platform {
    public static void main(String ar[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr={900,915,1030,1045};
        int[] depar={930,1100,1145,1300};
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],1);
        }
        for(int i=0;i<depar.length;i++){
            hm.put(depar[i],-1);
        }
        TreeMap<Integer,Integer> tm=new TreeMap<>(hm);
        System.out.println(tm);
        int preSum=0;
        int max=Integer.MIN_VALUE;
        for(Integer i:tm.values()){
            preSum+=i;
            //System.out.println(preSum);
            if(preSum>max)
                max=preSum;
        }
        System.out.println(max);
        //for()

    }
    
}

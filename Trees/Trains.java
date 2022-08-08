import java.util.*;
public class Trains {
    public static void main(String ar[]){
        HashMap<Integer,String> hm=new HashMap<>();
        int[] arr={900,915,1030,1045};
        int[] depar={930,1100,1145,1300};
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],"A");
        }
        for(int i=0;i<depar.length;i++){
            hm.put(depar[i],"A");
        }
        System.out.println(hm);
        

    }
    
}

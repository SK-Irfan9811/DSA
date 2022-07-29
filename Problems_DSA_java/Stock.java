import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class Stock {
    public static void main(String ar[]){
        Integer[] arr={4,3,1,2};
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(arr));
        int m=Collections.max(a);
        
        try{
            int k=0;
        while(a.indexOf(m)==0){
            k++;
            a.remove(0);
            m=Collections.max(a);
        }
        System.out.println(k);
    
    int buy=0;
    for(int i=0;i<a.indexOf(m);i++){
        buy+=a.get(i);
    }
    System.out.println(a.get(a.indexOf(m))-buy);
    } 

catch(Exception e){
    System.out.println("Profit is"+0);
}
}
}

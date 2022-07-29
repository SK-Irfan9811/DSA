import java.util.*;
public class Order{
    public static void main(String ar[]){
    int[] arr={0,-1,12,-9,10,-3,7};
    ArrayList<Integer> ans=new ArrayList<>();
    for(int i=0;i<arr.length;i++){
        if(arr[i]>=0)
            ans.add(arr[i]);           
    }
    for(int i=0;i<arr.length;i++){
        if(arr[i]<0)
            ans.add(arr[i]);           
    }
    System.out.println(ans);

    }
    
}

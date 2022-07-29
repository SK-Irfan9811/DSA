import java.util.*;
public class Set {
    public static void main(String ar[]){
        int arr[]={1,2,3,4,5,1,2,3,4,5};
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(ans.contains(arr[i])==false){
                ans.add(arr[i]);
            }

        }
        System.out.println(ans);

    }
    
}

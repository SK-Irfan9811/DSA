import java.util.*;
public class slidingWindow {
    public static void main(String ar[]){
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> ans=new ArrayList<>();
        int[] arr={4,3,8,9,0,1,4,5};
        int N=3;
        int low=0;
        while(low+N<=arr.length){
            for(int i=low;i<low+N;i++){
                a.add(arr[i]);
            }
            ans.add(Collections.max(a));
            a.clear();
            low++;
            //System.out.println();
        }
        System.out.println(ans);
        

    }
    
}

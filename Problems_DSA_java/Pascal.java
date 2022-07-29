import java.util.*;
public class Pascal {
    public static void main(String[] ar){
        int N=5;
        List<ArrayList<Integer>> ans=new ArrayList<>();
        ArrayList<Integer> res=new ArrayList<>();
        for(int i=0;i<N;i++){
            for(int j=i;j<i+1;j++){
                res.add(0);
                
            }
            ans.add(new ArrayList<>(res));
        }
        System.out.println(ans);


    }
    
}

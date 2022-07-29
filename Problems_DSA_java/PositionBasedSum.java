import java.util.ArrayList;

public class PositionBasedSum {
    public static void main(String ar[]){
        int[] input1={1,51,436,7860,41236};
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<input1.length;i++){
           int N=input1[i];
           int idx=i;
           while(idx>0){
            N=N/10;
            idx--;
           }
           arr.add(N);  
        }
        int sum=0;
        for(int i=0;i<arr.size();i++)
            sum+=arr.get(i);
        System.out.println(sum);
    }
    
}

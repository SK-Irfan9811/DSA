import java.util.ArrayList;
public class SumArray1 {
    public static void main(String ar[]){
        int [] arr={2,7,9,6,4};
        int sum=0;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            a.add(arr[i]);
            sum+=arr[i];
            if(sum%2==0){
                sum-=arr[i];
                a.remove(a.size()-1);
               
            }
            if(a.size()>1){
                System.out.println(a);
            }
            
        }
         

    }
}
    


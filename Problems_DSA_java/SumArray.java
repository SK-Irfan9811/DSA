import java.util.ArrayList;
public class SumArray {
    public static boolean  summ(int idx,ArrayList<Integer> a,int[] arr,float sum,float avg){
        if(idx>=arr.length){

            if(a.size()>0 && sum/a.size()==avg && a.size()!=arr.length){
                System.out.println(avg);
                System.out.println(a);
                return true; 
            }
            return false;
        }
        a.add(arr[idx]);
        sum+=arr[idx];
        if(summ(idx+1,a,arr,sum,avg)==true)
            return true; 
        a.remove(a.size()-1);
        sum-=arr[idx];
        if(summ(idx+1,a,arr,sum,avg)==true)
             return true;
        return false;     
    }
    public static void main(String ar[]){
        int[] arr={1,2,-3,4,6,5,-1};
        ArrayList<Integer> a=new ArrayList<>();
        float s=0;
        for(int i=0;i<arr.length;i++){
            s+=arr[i];
        }
        float avg=s/arr.length;
        //ArrayList<Integer> ans=new ArrayList<Integer>();
        System.out.println(summ(0,a,arr,0,avg));
        //System.out.println(ans);
    }
}

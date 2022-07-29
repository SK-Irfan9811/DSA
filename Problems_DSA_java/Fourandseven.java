import java.util.*;
public class Fourandseven {

    public static void main(String ar[]){
        Integer[] arr={1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> al=new ArrayList<>(Arrays.asList(arr));
        int f=al.indexOf(4);
        int s=al.indexOf(7);
        String str="";
        int sum=0;
        for(int i=f;i<=s;i++){
            str+=String.valueOf(arr[i]);
            sum+=arr[i];
        }
        int res=arr.length*(arr.length+1)/2-sum;
        int ans=res+Integer.parseInt(str);
        System.out.println(ans);
        



        

    }
    
}

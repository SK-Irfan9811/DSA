import java.util.*;
public class Subarrayavg {
    public static void main(String ar[]){
        int[] arr={5,0,2,3,1};
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                int[] ans=Arrays.copyOfRange(arr,i,j+1);
                for(int k:ans)
                    sum+=k;
                if(sum%5==0)
                    System.out.println(Arrays.toString(ans));    
                
            }
            
            
        }
    }
    
}

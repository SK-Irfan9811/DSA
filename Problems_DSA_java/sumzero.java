import java.util.ArrayList;
public class sumzero {
    public static void main(String arrrr[]){
    int[] arr={3,4,-7,3,1,3,1,-4,-2,-2};
    ArrayList<Integer> ar=new ArrayList<>();
    int sum=0;
    for(int i=0;i<arr.length;i++){
        ar.add(arr[i]);
        sum+=arr[i];
        for(int j=i+1;j<arr.length;j++){
            ar.add(arr[j]);
            sum+=arr[j];
            if(sum==0)
                System.out.println(ar.toString());
        }
        ar.clear();
        sum=0;
} 
   }

    }

    


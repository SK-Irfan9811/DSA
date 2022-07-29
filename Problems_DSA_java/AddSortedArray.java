import java.util.*;

public class AddSortedArray {
    public static void main(String ar[]){
        int[] a={-1,0};
        int[] b={1,2,4,6};   //{-1,1,2,3,4,5,6,7}
        int i=0;
        int j=0;
        int base=(a.length+b.length)/2;
        int flag=0;
        ArrayList<Integer> ans =new ArrayList<>();
        while(i<a.length && j<b.length){
             if(a[i]>b[j]){
                 ans.add(b[j]);
                 j++;
             }
             else if(a[i]<=b[j]){
                ans.add(a[i]);
                i++;
             }
             if(ans.size()==base+1){
                flag=1;
                break;
             }
             
        }
        //System.out.println(i+""+j);
        while(i!=a.length && flag==0){
            ans.add(a[i]);
            if(ans.size()==base+1)
                break;
            i++;    
        }
        while(j!=b.length && flag==0){
            ans.add(b[j]);
            if(ans.size()==base+1)
                break;
            j++;    
        }
        System.out.println(ans);
        System.out.println(ans.get(ans.size()-1));
    }
    
}

import java.util.*;
public class MergeSort{
    static void divide(int[] arr,int l,int r){
        System.out.println(l+""+r);
        if(l>=r){
            return;
        }
        int mid=(l+r)/2;
        divide(arr,l,mid);
        divide(arr,mid+1,r);
        conquer(arr,l,mid,r);
    }
    static void conquer(int[] arr,int l,int mid,int r){
        int[] merged=new int[r-l+1];
        int i=l;
        int j=mid+1;
        int k=0;
        while(i<=mid && j<=r){
            if(arr[i]<=arr[j]){
                merged[k++]=arr[i++];
            }
            else{
                merged[k++]=arr[j++];
            }
        }
        while(i<=mid){
            merged[k++]=arr[i++];
        }
        while(j<=r){
            merged[k++]=arr[j++];
        }
        for(int ii=0,jj=l;ii<merged.length;ii++,jj++){
            arr[jj]=merged[ii];
        }
    }
    public static void main(String ar[]){
        int[] arr={5,-4,-4,8,1};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
       

    }
}
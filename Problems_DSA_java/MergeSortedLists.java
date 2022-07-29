import java.util.*;
public class MergeSortedLists {
    public static void main(String ar[]) { 
        int[] arr1={1,2,3,0,0,0};
        int[] arr2={2,5,6};
        int m=3;
        int n=3;

        //brute force
        /*int[] ans=new int[arr1.length+arr2.length];
        int i=0,j=0,k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                ans[k++]=arr1[i++];
            }
            else{
                ans[k++]=arr2[j++];
            }
        }
        while(i<arr1.length){
            ans[k++]=arr1[i++];
        }
        while(j<arr2.length){
            ans[k++]=arr2[j++];
        }
        System.out.println(Arrays.toString(ans));*/
        //O(1) space 
        /*for(int i=0;i<arr1.length;i++){
            if(arr1[i]>arr2[0]){
                int temp=arr1[i];
                arr1[i]=arr2[0];
                arr2[0]=temp;
            }
            Arrays.sort(arr2);
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));*/
        //another approach
        int i=m-1,j=n-1,k=m+n-1;
        while(i>0 && j>0){
            if(arr1[i]>=arr2[j]){
                arr1[k--]=arr1[i--];
            }
            else{
                arr1[k--]=arr2[j--];
            }
        }
        while(i>0){
            arr1[k--]=arr1[i--];
        }
        while(j>0){
            arr1[k--]=arr2[j--];
        }
        System.out.println(Arrays.toString(arr1));
    }
    
}

public class Binsch {
    static int ans=-1;
    static int  search(int low,int high,int target,int[] arr){
        if(low<=high){
            int mid=(low+high)/2;
            //System.out.println(mid);
            if(arr[mid]==target){

                return mid;
            }
            if(arr[mid]>target){
                return search(low,mid-1,target,arr);
            }    
            else{
                return search(mid+1,high,target,arr);
            }
        }

        return -1;

    }
    public static void main(String ar[]){
        int[] arr={4,5,6,7,8,9};
        int len=arr.length;
        System.out.println(search(0,(len-1),9,arr));
    }
    
}

import java.util.*;
public class CombinationalSum {
    static void solve(int idx,int nums[],int target,ArrayList<Integer> a,int sum,int[] prices){
        if(idx==nums.length){
            if(target==sum){
                int s=0;
                for(int i:a){
                   s+=prices[i-1];
                }
            System.out.println(a);
            System.out.print(s);
            }
            return;    
        }
        if(sum<target){
            a.add(nums[idx]);
            sum+=nums[idx];
            solve(idx,nums,target,a,sum,prices);
            sum-=nums[idx];
            a.remove(a.size()-1);
        }
        solve(idx+1,nums,target,a,sum,prices);
    } 
    public static void main(String ar[]){
        ArrayList<Integer> a=new ArrayList<>();
        int[] nums={1,2,3,4,5,6,7};
        int[] prices={1,3,3,3,4,4,6};
        solve(0,nums,7,a,0,prices);

    }
    
}

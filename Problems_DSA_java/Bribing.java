import java.util.*;
import java.util.Arrays;
public class Bribing {
        static  int solve(ArrayList<Integer> A, ArrayList<Integer> B) {
            int N=A.size();
            int ans=0;
            for(int i=1;i<=N;i++){
                System.out.println(Math.abs(A.indexOf(i)-(i-1))+" "+B.get(i-1));
                if(Math.abs(A.indexOf(i)-(i-1))<=B.get(i-1)){
                   // System.out.println("Here ");
                    ans+=Math.abs(A.indexOf(i)-(i-1));
                }
                else{
                    ans=-1;
                    break;
                }
                //System.out.println(ans); 
                
            }
            //System.out.println(ans);
            return ans;
            }
            public static void main(String ar[]){
                //Integer[] actual={};
                Integer[] a={2,5,1,3,4};
                Integer[] b={1,2,3,2,1};
                List<Integer> AA=Arrays.asList(a);
                List<Integer> BB=Arrays.asList(b);
                ArrayList<Integer> A=new ArrayList<>(AA);
                
                ArrayList<Integer> B=new ArrayList<>(BB);
                //System.out.println(A.toString());
                //System.out.println(B.toString());
                System.out.println(solve(A,B));
            }
            
        
        
    
}
/*entries. For example: if arr is [3, 1, 3, 5, 10, 6, 4, 3, 1
new int[] {5, 2, 4, 6}
    
Input: new int[] {3, 0, 0, -2, 0, 2, 0, -2}*/

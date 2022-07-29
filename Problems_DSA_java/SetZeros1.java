import java.util.*;
public class SetZeros1 {
    public static void main(String ar[]){
        int[][] arr={{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int m=arr.length;
        int n=arr[0].length;
        int[] dummy1=new int[m];
        int[] dummy2=new int[n];
        Arrays.fill(dummy1,-1);
        Arrays.fill(dummy2,-1);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    dummy1[i]=0;
                    dummy2[j]=0;
                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dummy1[i]==0 || dummy2[j]==0){
                    arr[i][j]=0;

                }
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        for(int i:dummy1){
            System.out.println(i);
        }
        for(int i:dummy2){
            System.out.println(i);
        }
    }
    
}

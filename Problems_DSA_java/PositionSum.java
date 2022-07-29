import java.util.ArrayList;
import java.util.Collections;
public class PositionSum {
    static boolean isPrime(int N){
        if(N>2 && N%2==0 || N==1){
            return false;
        } 
        for(int i=3;i<=(int)Math.sqrt(N);i+=2){
            if(N%i==0){
               return false;
            }
        }
        return true;
    }
    public static void main(String ar[]){
              int[] input1={10,41,18,50,43,31,29,25,59,96,67};
              int input2=11;
              ArrayList<Integer> arr=new ArrayList<Integer>(); 
              int sum=0;
              for(int i=0;i<input2;i++){
                 if(isPrime(input1[i])==true){
                    sum+=input1[i];
                    arr.add(input1[i]);

                 }
              }
    int min=Collections.min(arr);
    if(sum>0)
    System.out.println(sum-min);
    else
    System.out.println(0);
            }
}

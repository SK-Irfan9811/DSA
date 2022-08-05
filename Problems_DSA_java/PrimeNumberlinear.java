import java.util.*;
public class PrimeNumberlinear {
    static void seive(int n){
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        for(int i=2;i<=n;i++){
            if(prime[i]){
                System.out.println(i);
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
    }
    public static void main(String ar[]){
        seive(20);
    }
    
}

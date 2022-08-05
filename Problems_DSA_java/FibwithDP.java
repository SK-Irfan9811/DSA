public class FibwithDP {
    static int fib(int n,int[]dp){
        if(n<=1)
            return n;
        if(dp[n]!=-1)
            return dp[n];    
        return dp[n]= fib(n-1,dp)+fib(n-2,dp);        
    }
    public static void main(String ar[]){
        int[] dp={-1,-1,-1,-1,-1,-1};
        System.out.println(fib(5,dp));
    }
    
}

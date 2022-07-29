public class Armstrong {
    static boolean check(int N){
        String s=String.valueOf(N);
        int count=s.length();
        int sum=0;
        int A=N;
        while(N>0){
            int k=N%10;
            sum+=(int)Math.pow(k,count);
            N/=10;
        }
        return sum==A;

    }
    public static void main(String ar[]){
     System.out.println(check(371));
    }
}

public class Factorial {
    static int fact(int k){
        if(k==1 || k==0)
            return 1;
        return k*fact(k-1);    
    }
    public static void main(String ar[]){
        System.out.println(fact(5));
    }
}

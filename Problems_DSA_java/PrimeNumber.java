public class PrimeNumber {
    public static void main(String ar[]){
        int N=31;
        int f=0;
        if(N>2 && N%2==0 || N==1){
            System.out.println("No");
            f=1;
        } 
        for(int i=3;i<=(int)Math.sqrt(N);i+=2){
            if(N%i==0){
                System.out.println("No");
                f=1;
            }
        }
        if(f==0)
        System.out.println("YEs");

        
    }
    
}

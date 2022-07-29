public class JPMorgan2 {
    public static void main(String ar[]){
        int[] arr={1,2};
        int min=0;
        int sum=0;
        for(int x:arr){
            sum+=x;
            if(sum<min)
                min=sum;
        }
        System.out.println(1-min);
    }
    
}

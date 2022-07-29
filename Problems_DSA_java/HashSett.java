import java.util.HashSet;
import java.util.Arrays;
public class HashSett {
    public static void main(String ar[]){ 
    Integer[] a={1,2,3,4,5,6,6};
    Integer[] b={1,4,2,10,7};
    HashSet<Integer> hs=new HashSet<>(Arrays.asList(a));
    for(int i=0;i<b.length;i++){
        if(hs.contains(b[i])==false){
             System.out.println(b[i]);
    }
    }}
}

    


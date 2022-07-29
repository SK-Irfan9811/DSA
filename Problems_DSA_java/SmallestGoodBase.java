import java.util.*;
public class SmallestGoodBase {
    public static void main(String ar[]){
        String bin="476";
        String N=bin;
        char[] chr=bin.toCharArray();
        
        Arrays.sort(chr);
        for(char i:chr)
            System.out.println(i);
        bin=Arrays.toString(chr);
        int check=Character.getNumericValue(bin.charAt(bin.length()-2));
        System.out.println(check);
        System.out.println(Integer.parseInt(N,check+1));
    }
    
}

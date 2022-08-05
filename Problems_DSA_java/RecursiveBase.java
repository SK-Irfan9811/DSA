import java.util.*;

public class RecursiveBase {
    static String str="";
    static String baseConversion(int N,int base){
        if(N<=0){
           return str;
        }
        str+=String.valueOf(N%base);
        N/=base;
        return baseConversion(N, base);
    }
    public static void main(String ar[]){
        HashMap<String,String> hm=new HashMap<>();
        hm.put("10","A");
        hm.put("11","B");
        hm.put("12","C");
        hm.put("13","D");
        hm.put("14","E");
        hm.put("15","F");
        StringBuilder sb=new StringBuilder(baseConversion(14,16));
        String ans=sb.reverse().toString();
        System.out.println(ans);
        String str="";
        ans=ans.replace("13","D");
        System.out.println(ans);

    }
    
}

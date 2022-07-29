import java.util.*;
import java.util.Collections;
public class Diglen {
    public static void main(String ar[]){
        String str="Irfan:123,mayur:3749,friends:3949,yeah:7878";
        String[] a1=str.split(",");
        System.out.println(Arrays.toString(a1));
        //System.out.println(a1[0].split(":")[0]);
        for(int i=0;i<a1.length;i++){
            //System.out.println("Hello");
            ArrayList<Integer> a=new ArrayList<Integer>();
            //int len=a1[i].split(":")[0].length();
            //System.out.println(len);
            int num=Integer.parseInt(a1[i].split(":")[1]);
            //System.out.println(num);
            int res=0;
            /*while(num>0){
                int f=num%10;
                if(f<=len)
                    a.add(f);
                num=num/10;    
            }*/
            while(num>0){
                int f=num%10;
                res+=f*f;
                num/=10;
            }
            System.out.println(res);
            if(res%2==0){
                System.out.println(a1[i].split(":")[0].substring(2)+a1[i].split(":")[0].substring(0,2));
            }
            else
                System.out.println(a1[i].split(":")[0].substring(1)+a1[i].split(":")[0].substring(0,1));

                
            
            /* if(a.size()>0){
            System.out.println(a1[i].split(":")[0].charAt(Collections.max(a)-1));
            }
            else
            System.out.println("X");*/
        }
        //System.out.println(m);
        

    }
    
}

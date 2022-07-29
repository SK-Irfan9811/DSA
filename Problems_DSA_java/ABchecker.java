import java.util.*;
public class ABchecker {
    public static void main(String ar[]){
        String str="Laura sobs";
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a')
                a.add(i);
            else if(str.charAt(i)=='b')
                b.add(i);    
        }
        for(int i=0;i<a.size();i++){
            for(int j=0;j<b.size();j++){
                if(b.get(j)-a.get(i)-1==3){
                    System.out.println("Yes");
                    break;
                }
                    
            }
        }
        System.out.println(a);
        System.out.println(b);
        }
    }
    


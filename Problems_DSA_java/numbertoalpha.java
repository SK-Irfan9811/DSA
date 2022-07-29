import java.util.HashMap;
import java.util.*;
public class numbertoalpha {
    public static void main(String ar[]){
        String str="oneplus5minusnine";
        HashMap<String,String> hm=new HashMap<>();
        hm.put("one","1");
        hm.put("two","2"); 
        hm.put("three","3");
        hm.put("four","4");
        hm.put("five","5");
        hm.put("six","6");
        hm.put("seven","7");
        hm.put("eight","8");
        hm.put("nine","9");
        hm.put("plus","+");
        hm.put("minus","-");
        for(String name:hm.keySet()){
            str=str.replace(name,hm.get(name));
        }
        System.out.println(str);
        ArrayList<Integer> num=new ArrayList<>();
        ArrayList<Character> op=new ArrayList<>();
        String temp="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='+' || str.charAt(i)=='-'){
                op.add(str.charAt(i));
                num.add(Integer.parseInt(temp));
                temp="";
            }
            else{
                temp+=str.charAt(i);
            }
        }
        num.add(Integer.parseInt(temp));
        System.out.println(num+" "+op);
        int ans=num.get(0);
        for(int i=0;i<op.size();i++){
              if(op.get(i)=='+')
                  ans+=num.get(i+1);
              else 
                  ans-=num.get(i+1);    
        }
        String res=String.valueOf(ans);
        for(Map.Entry<String,String> entry:hm.entrySet()){
            res=res.replace(entry.getValue(),entry.getKey());
        }
        System.out.println(res);
        
    }
    
}

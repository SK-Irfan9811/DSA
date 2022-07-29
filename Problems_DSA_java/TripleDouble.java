import java.util.*;

public class TripleDouble {
    public static void main(String ar[]){
        ArrayList<String> a1=new ArrayList<>();
        ArrayList<String> a2=new ArrayList<>();
        int n1=465555;
        int n2=5597;
        String num1=String.valueOf(n1);
        String num2=String.valueOf(n2);
        for(int i=0;i<num1.length();i++){
            String str="";
            for(int j=i;j<i+3;j++){
                if(j<num1.length())
                     str+=String.valueOf(num1.charAt(j));
            }
            if(str.length()==3 && str.charAt(0)==str.charAt(1) && str.charAt(1)==str.charAt(2)){
                a1.add(str);
            }
            //System.out.println();
        }
        System.out.println(a1);
  
        for(int i=0;i<num2.length();i++){
            String str1="";
            for(int j=i;j<i+2;j++){
                if(j<num2.length())
                     str1+=String.valueOf(num2.charAt(j));
            }
            if(str1.length()==2 && str1.charAt(0)==str1.charAt(1)){
                a2.add(str1);
            }
            //System.out.println();
        }
        System.out.println(a2);
        for(int i=0;i<a1.size();i++){
            for(int j=0;j<a2.size();j++){
                if(a1.get(i).charAt(0)==a2.get(j).charAt(0))
                    System.out.println(1);
                    break;
            }
        }
        System.out.println(0);
    }
    
}

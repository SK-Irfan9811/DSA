public class Palindrome {
    public static void main(String ar[]){
        String st="DSDDS";
        int f=0;
        for(int i=0;i<st.length();i++){
         if(st.charAt(i)!=st.charAt(st.length()-i-1))
             f=1;
        }
        System.out.println(f==0?"True":"false");
    }
    
}

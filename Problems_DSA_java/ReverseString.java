public class ReverseString {
    public static void main(String ar[]){
        String st="Irfan";
        char ch[]=st.toCharArray();
        char[] ch1=new char[ch.length];
        for(int i=0;i<ch.length;i++){
            ch1[i]=ch[ch.length-i-1];
        }
        ch1.toString();
        System.out.println(ch1);
        System.out.println(Integer.toString(20));
        System.out.println(String.valueOf(2));

    }
    
}

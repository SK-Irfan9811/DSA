public class DectoBinmanually {
    public static void main(String ar[]){
        String str="";
        int N=233;
        while(N>0){
            str+=(String.valueOf(N%2));
            N/=2;
        }
        System.out.println(str);
    }
    
}

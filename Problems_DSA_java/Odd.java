
public 
class Odd {
    public static void main(String ar1[]){
        int [] ar={3,6,5,4,8,9};
        String str="";
        for(int i=1;i<ar.length;i+=2){
            str+=String.valueOf((int)Math.pow(ar[i],2));
        }
        System.out.println(str.substring(0,4));
    
}
}

import java.util.*;
public class Trains {
    public static void main(String ar[]){
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<Integer> arr={0900,0915,1030,1045};
        ArrayList<Integer> depar={0930,1100,1145,1300};
        for(int i=0;i<arr.size();i++){
            hm.put(arr.get(i),'A');
        }
        for(int i=0;i<depar.size();i++){
            hm.put(arr.get(i),'D');
        }
        System.out.println(hm);
        

    }
    
}

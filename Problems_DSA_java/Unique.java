import java.util.HashMap;
public class Unique {
    public static void main(String ar[]){
        HashMap<Integer, Boolean> map = new HashMap<>();
        int[] arr={1,2,3,1,2,4,5,6,7,8,4,3,1,0,-1};
        for(int i=0;i<arr.length;i++){
                if(map.containsKey(arr[i])==false)
                    map.put(arr[i],true);
                   
            }
            for (Integer i:map.keySet()){
                System.out.print(i+" ");
            }
        

        }

    }
    


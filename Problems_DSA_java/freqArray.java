import java.util.*;
public class freqArray {
    public static void main(String ar[]){
        HashMap<Integer,Integer> hm=new HashMap<>();
        int[] arr={5,4,4,3,3,3,3,2,2,2,1,1,1,1,1};
        for(int i:arr){
            if(hm.containsKey(i)){
                hm.put(i,hm.get(i)+1);
            }
            else{
                hm.put(i,1);
            }
        }
            //hm.put("Irfan",1);
            //hm.put("jai",2);
            //hm.put("Chandra",3);
        System.out.println(hm);
        
        //sort hashmap by key
        TreeMap<Integer,Integer> sorted=new TreeMap<>(hm);
          for(Map.Entry<Integer,Integer> entry:sorted.entrySet())
            System.out.println(entry.getKey()+""+entry.getValue());
        //sort by value

        ArrayList<Integer> keys=new ArrayList<Integer>();
        ArrayList<Integer> values=new ArrayList<Integer>();
        hm.forEach((k,v)->{
            keys.add(k);
            values.add(v);

        });
        //System.out.println(keys+" "+values);
        //sort based on frequency
        for(int i=0;i<values.size();i++){
            for(int j=i+1;j<values.size();j++){
                if(values.get(i)<values.get(j)){
                    int temp=values.get(j);
                    values.set(j,values.get(i));
                    values.set(i,temp);
                    int temp1=keys.get(j);
                    keys.set(j,keys.get(i));
                    keys.set(i,temp1);
                }
            }
        }
        System.out.println(values);
        System.out.println(keys);



    }
}

    
    


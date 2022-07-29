import java.util.*;
//import java.util.Arrays;
public class JPMorgn {
    public static void main(String ar[]){
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        //System.out.println(st);
        String[] words=st.split("\\s");
        ArrayList<String> aa=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            if(words[i].length()%2==0)
                 aa.add(words[i]);
        }
        //Integer[] array=new Integer[aa.size()];
        //array=aa.toArray(array);
        //Arrays.sort(array);
        aa.add("weeee");
        aa.add("bfrkg");
        for(String i:aa){
            System.out.println(i);
        }
        
        String[] arr = new String[aa.size()];
        arr = aa.toArray(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));  
        sc.close();
        

    } 
    
}

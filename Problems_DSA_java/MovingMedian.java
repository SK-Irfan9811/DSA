import java.util.*; 
import java.io.*;

class MovingMedian {

   public static int median(int [] A){
     Arrays.sort(A);
     //System.out.println(Arrays.toString(A));
     if(A.length==1)
         return A[0];
      else{
        if((A.length)%2==0){
          int mid=A.length/2;
          return ((A[mid]+A[mid-1])/2);
        }
        else{
          return A[(A.length/2)];
        }

      }   

   }
  public static String MovingMedian1(int[] string) {
    // code goes here 
    ArrayList<Integer> ans=new ArrayList<>();
    String str="";
    int win=string[0];
    int p=1;
    int q=1;
    while(q<string.length){
      if(q-p<win){
        //System.out.println(p+" "+q);
        ans.add(median(Arrays.copyOfRange(string,p,q+1)));
        q++;
    }
    else{
      p++;
      q++;
      ans.add(median(Arrays.copyOfRange(string,p,q)));
    }
    
  }
  int i=0;
  String strr="";
  for(i=0;i<ans.size()-1;i++){
    strr+=(ans.get(i)+",");
  }
  strr+=(ans.get(i));
  //System.out.println(strr);
  return strr;
  }
  public static void main (String[] args) {  
    // keep this function call here 
    int[] array={5,2,4,6};
    System.out.println(MovingMedian1(array));  


  }

}
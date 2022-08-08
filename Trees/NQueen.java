public class NQueen {
    static int[] x=new int[4];
static boolean Place(int k,int i){
    for(int j=0;i<k-1;i++){
        if(x[j]==i || Math.abs(x[j]-i)==Math.abs(j-k)){
            return false;
        }
    }
    return true;
}
static  void NQueens(int k,int n){
    for(int i=0;i<n;i++){
        if(Place(k,i)==true){
            x[k]=i;
            if(k==n)
                System.out.println("True");
        }
        else
            NQueens(k+1,n);
    }
}
  public static void main(String ar[]){
    NQueens(0,4);
  }  
}

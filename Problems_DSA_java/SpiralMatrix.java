public class SpiralMatrix {
    static int N=3;
    static int count=0;
    static int[][] arr=new int[3][5];
    static int[] ans={3,0,2,6,8,1,7,9,4,2,5,5,0,-1,-1};
    static int row=arr.length;
    static int col=arr[0].length;
    static void row_traverse_forward(int r,int c){
        for(int i=c;i<col-c && count!=row*col;i++) 
            arr[r][i]=ans[count++];    
    }
    static void col_traverse_down(int r,int c){
        for(int j=r+1;j<row-r && count!=row*col;j++)
            arr[j][c]=ans[count++];
    }

    static void row_traverse_back(int r,int c){
        for(int i=c-1;i>=col-c && count!=row*col;i--)
            arr[r][i]=ans[count++];
    }
    static void col_traverse_up(int r,int c){
        for(int i=r;i>=row-r && count!=row*col;i--){
            arr[i][c]=ans[count++];
        }
    }
    public static void main(String ar[]){
        int a=0;
        int b=0;
        while(row>a && col>b){
       row_traverse_forward(a,b);
       col_traverse_down(a,col-b-1);
       row_traverse_back(row-a-1,col-b-1);
       col_traverse_up(row-a-1,b);
       a++;
       b++;
        }
        //System.out.println(count);
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
       

        
        
}
    
}

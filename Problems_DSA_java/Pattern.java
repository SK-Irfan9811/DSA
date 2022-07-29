public class Pattern {
    static int N=6;
    static int count=0;
    static int[][] arr={{3},{2}};
    static int row=arr.length;
    static int col=arr[0].length;
    static void row_traverse_forward(int r,int c){
        for(int i=c;i<col-c && count!=row*col;i++){
            count++;
            System.out.print(arr[r][i]+" ");

        }
        
    }
    static void col_traverse_down(int r,int c){
        for(int j=r+1;j<row-r && count!=row*col;j++){
            count++;
            System.out.print(arr[j][c]+" ");
        }
    }

    static void row_traverse_back(int r,int c){
        //System.out.println("Her");
        for(int i=c-1;i>=col-c && count!=row*col;i--){
            count++;
            //System.out.println("GGgGGg");
            System.out.print(arr[r][i]+" ");
        }
    }
    static void col_traverse_up(int r,int c){
        for(int i=r;i>=row-r && count!=row*col;i--){
            count++;
            System.out.print(arr[i][c]+" ");
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
       

        
        
}
    
}

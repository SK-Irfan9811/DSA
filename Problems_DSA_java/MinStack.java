public class MinStack {
    static int top=-1;
    private static int[] stack;
    MinStack(int size){
        stack=new int[size];
    }
    static void push(int data){
        stack[++top]=data;
    } 
    static void pop(){
        top--;
    }
    static int seek(){
        return stack[top];
    }
    static void display(){
        for(int i=0;i<=top;i++)
            System.out.print(stack[i]+" ");
    }
    static int getMinimumElement(){
        int[] dummy=new int[stack.length];
        int dummyTop=-1;
        if(dummyTop==-1){
            //System.out.println("Here");
            dummy[++dummyTop]=stack[top];
        }

            while(top>=0){
                //System.out.println("In while loop");
                //System.out.println(stack[top]);
                if(stack[top]<dummy[dummyTop]){
                    dummy[++dummyTop]=stack[top--];
                }
                else{
                    top--;
                }
            }
        
        return dummy[dummyTop];



    }
    public static void main(String ar[]){
        MinStack m=new MinStack(5);
        //System.out.println(stack.length);
        push(-4);
        push(-2);
        push(-1);
        pop();
        push(-94);
        push(-100);
        //display();
        //System.out.println(top);
        System.out.println(getMinimumElement());


    }
    
}

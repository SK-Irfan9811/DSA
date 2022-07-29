public class ProducerConsumer {
    static int top=-1;
    static int[] stack=new int[5];
    static void produce(int data){
        if(top<stack.length-1){
            stack[++top]=data;
            System.out.println("produced");
        }

        else
            System.out.println("No more space to produce");    
    }
    static void consume(){
        if(top!=0){
            top--;
            System.out.println("Consumed");
        }

        else
            System.out.println("No more to consume");    
    }
    static void display(){
        for(int i=0;i<=top;i++){
            System.out.println(stack[i]);
        } 
    }
    public static void main(String ar[]){
        produce(100);
        produce(100);
        produce(100);
        produce(100);
        produce(100);
        consume();
        produce(100);
        consume();
        produce(200);
        consume();
        consume();
        consume();
        consume();
        consume();
        

    }
    
}

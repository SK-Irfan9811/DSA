public class CircularQueue {
    static int size=6;
    static int front,rear;
    static int[] queue=new int[size];
    CircularQueue(){
        front=-1;
        rear=-1;
    }
    static boolean isFull(){
        if(front==0 && rear==size-1)
            return true;
        else if(front==rear+1)
            return true;
        return false;        
    }
    static boolean isEmpty(){
        if(front==-1)
           return true;
        return false;   
    }
    static void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front==-1)
                front=0;
            rear=(rear+1)%size;
            queue[rear]=data;
        }
    }
    static int dequeue(){
        int element;
        if (isEmpty()) {
          System.out.println("Queue is empty");
          return (-1);
        } else {
          element = queue[front];
          if (front == rear) {
            front = -1;
            rear = -1;
          } 
          else {
            front = (front + 1) % size;
          }
          return (element);
        }
      }

    public static void main(String ar[]){
        enqueue(10);
    }
    }   


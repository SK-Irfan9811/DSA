public class CallByValue {
     int data=50;
     void change(int data){
       data+=100;
    }
    public static void main(String ar[]){
        CallByValue c=new CallByValue();
        c.change(500);
        System.out.println(c.data);
    }
    
}

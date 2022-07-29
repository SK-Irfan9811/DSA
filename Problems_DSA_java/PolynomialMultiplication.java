import java.util.Scanner;
 class ListNode{
    int data1;
    int data2;
    ListNode next;
}
public class PolynomialMultiplication {
    static ListNode head;
    static void insert(int data1,int data2){
        ListNode node=new ListNode();
        node.data1=data1;
        node.data2=data2;
        if(head==null){
            head=node;
        }
        else{
            ListNode n=head;
            while(n.next!=null)
                n=n.next;
            n.next=node;       
        }
    }
    static void show(){
        ListNode itr=head;
        while(itr!=null){
            System.out.println(itr.data1+" "+itr.data2);
            itr=itr.next;
        }
    }
   public static void main(String ar[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first polynomail");
    int N=sc.nextInt();
    for(int i=0;i<N;i++){
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        insert(d1,d2);
    }
    System.out.println("Enter second polynomail");
    int K=sc.nextInt();
    for(int i=0;i<K;i++){
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        insert(d1,d2);
    }

    show();
   }
    
    }
    
    


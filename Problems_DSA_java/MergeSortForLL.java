class Node{
    int data;
    Node next;
}
public class MergeSortForLL {
    static Node head;
    public static void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null){
            head=node;   
        }
        else{
            Node n=head;
            while(n.next!=null){
                n=n.next;
            }
            n.next=node;
        }
    }
        static Node mergeLL(Node n1,Node n2){
            if(n1==null || n2==null){
                return n1==null?n1:n2;
            }
            Node dummy=new Node();
            dummy.data=-1;
            Node temp=dummy;
            while(n1!=null && n2!=null){
                if(n1.data<n2.data){
                 temp.next=n1;
                 n1=n1.next;
                }

                else{
                    temp.next=n2;
                    n2=n2.next; 
                }
                temp=temp.next;
            }
            while(n1!=null){
               temp.next=n1;
               n1=n1.next;
               temp=temp.next; 
            }
            while(n2!=null){
                temp.next=n2;
                n2=n2.next;
                temp=temp.next; 
             }
             System.out.println(dummy.next);
          return dummy.next;

        }  
        static Node midNode(Node head){
            System.out.println("here");
            Node slow=head;
            Node fast=head;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    static  Node  mergeSort(Node head){
        System.out.println("Here");
        if(head==null || head.next!=null){
            System.out.println("Here too");
            return head;
        }
        Node mid=midNode(head);
        Node nhead=mid.next;
        mid.next=null;
        Node n1=mergeSort(head);
        Node n2=mergeSort(nhead);
        System.out.println(head);
        return mergeLL(n1,n2);

        
        
    }
  public static void main(String ar[]){
        insert(5);
        insert(2);
        insert(0);
        insert(1);
        Node n=head;
        mergeSort(n);
        
            
       

    }}

    


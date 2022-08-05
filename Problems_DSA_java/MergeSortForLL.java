class Node{
    int data;
    Node next;
}
public class MergeSortForLL {
    static Node head;
    static Node dummy=new Node();
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
            Node c1=n1;
            Node c2=n2;
           
            Node temp=dummy;
            
            while(c1!=null && c2!=null){
                if(c1.data<c2.data){
                Node n=new Node();
                n.data=c1.data;
                temp.next=n;
                temp=temp.next;  
                c1=c1.next;
                }

                else{
                    Node n=new Node();
                    n.data=c2.data;
                    temp.next=n;
                    temp=temp.next;  
                    c2=c2.next;
                }
                
            }
            temp.next=c1!=null?c1:c2; 
             
             //System.out.println(dummy.next);
          return dummy.next;

        }  
        static Node midNode(Node node){
           // System.out.println("here");
           if(node==null || node.next!=null)
               return node;
            Node slow=node;
            Node fast=node;
            while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            return slow;
        }
    static  Node  mergeSort(Node head){
        //System.out.println("Here");
        if(head==null || head.next!=null){
           // System.out.println("Here too");
            return head;
        }
        Node mid=midNode(head);
        Node nhead=mid.next;
        mid.next=null;

        Node n1=mergeSort(head);
        Node n2=mergeSort(nhead);
        //System.out.println(head);
        return mergeLL(n1,n2);   
    }
    
  public static void main(String ar[]){
        insert(5);
        insert(2);
        insert(-1);
        insert(1);
        mergeSort(head);
        System.out.println(dummy.next);
        
            
       

    }}

    


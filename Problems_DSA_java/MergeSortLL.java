 class Node{
    int data;
    Node next;
 }
 public class MergeSortLL{
    static Node head;
    static Node sortedMerge(Node n1,Node n2){
        Node result=null;
        if(n1==null)
            return n2;
        if(n2==null)
            return n1;  
        if(n1.data<=n2.data){
            result=n1;
            result.next=sortedMerge(n1.next,n2);
        }
        else{
            result=n2;
            result.next=sortedMerge(n1,n2.next);
        }
        return result;

    }
    static Node Merge(Node n){
        if(n==null || n.next==null){
            return n;
        }
        Node mid=getMiddle(n);
        Node nhead=mid.next;
        mid.next=null;
        Node left=Merge(n);
        Node right=Merge(nhead);
        Node sl=sortedMerge(left,right);
        return sl;
    }
    static Node getMiddle(Node h){
        if(h==null)
            return h;
        Node slow=h;
        Node fast=h;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        } 
        return slow;   
    }
    static void insert(int data){
        Node node=new Node();
        node.data=data;
        if(head==null)
            head=node;
        else {
            Node nn=head;
            while(nn.next!=null)
                nn=nn.next;
            nn.next=node;     
        }

    }
    static void show(Node head){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String ar[]){
        insert(5);
        insert(4);
        insert(2);
        insert(4);
        //Merge(head);
         show(Merge(head));
        
        //show();
        }
 }


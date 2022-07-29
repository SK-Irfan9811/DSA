class Node{
    int data;
    Node next;
}
public class LinkedList {
    static Node head;

    //Insert at end
    public static  void insert(int data){
    Node node =new Node(); 
    node.data=data;
    node.next=null;
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

    //Display node data
    public static  void show(){
        Node n=head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
       
        System.out.println(n.data);
    }

    //Delete the nodes
    public static void delete(int k){
        Node n=head;
        for(int i=0;i<k-2;i++){
            n=n.next;
        }
        Node nn=n.next;
        n.next=nn.next;
        nn.next=null;

    }
    //Insert at starting position
    public static void inserAtStart(int data){
        Node node =new Node();
        node.data=data;
        node.next=head;
        head=node;
    }
    //Insert at particular position
    //take index postion and data as parameters
    public static void insertAt(int idx,int data){
        Node node=new Node();
        node.data=data;
        node.next=null;
        Node n=head;
        for(int i=0;i<idx-2;i++){
            n=n.next;
        }
        node.next=n.next;
        n.next=node;
    }
    //sort the linked list

    public static void sort(){
        Node n=head;
        int c=0;
        while(n.next!=null){
            n=n.next;
            c++;
        }
        Node a=head;
        for(int i=0;i<c+1;i++){
            //System.out.println(a.data);
            Node b=a;
            for(int j=i;j<c+1;j++){
                //System.out.print(b.data);
                if(a.data<b.data){
                    int temp=b.data;
                    b.data=a.data;
                    a.data=temp;
                }
                b=b.next;
            }
            a=a.next;
            //System.out.println();
        }

    }

    //Search for an element
    public static boolean search(int c){
        Node n=head;
        while(n.next!=null){
            if(n.data==c)
                return true; 
            n=n.next;         
        }
        return false;
        
    }
    //reverse the linked list
    //reverse the link and go to other node till last
    public static void reverse(){
        Node curr=head;
        Node prev=null;
        //Node next=null;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }


    public static void main(String ar[]){
        insert(1);
        insert(2);
        insert(3);
        insert(4);
        insert(5);
        //delete(2);
        //System.out.println(search(0));
        sort();
        show();
        //reverse();
        //show();
        
    }
}

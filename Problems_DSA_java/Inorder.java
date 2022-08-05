import java.util.*;
class Nodee{
    int data;
    Nodee left;
    Nodee right;
    Nodee(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
public class Inorder {
    static ArrayList<Integer> ans=new ArrayList<>();
    static boolean inOrder(Nodee node1,Nodee node2){
        Stack<Nodee> st1=new Stack<>();
        Stack<Nodee> st2=new Stack<>();
        while(true){
            if(node1!=null && node2!=null){
                st1.push(node1);
                st2.push(node2);
                node1=node1.left;
                node2=node2.left;
            }
            else{
                if(st1.size()!=st2.size())
                    return false;
                if(st1.isEmpty() && st2.isEmpty())
                    break;      
                node1=st1.peek();
                node2=st2.peek();
                if(node1.data!=node2.data)
                    return false;
                st1.pop();
                st2.pop();
                node1=node1.right;  
                node2=node2.right;  
            }
            
        }
        return true;
       
    }
    public static void main(String ar[]){
        Nodee root=new Nodee(1);
        root.left=new Nodee(2);
        root.right=new Nodee(3);
        root.left.left=new Nodee(4);
        root.left.right=new Nodee(5);
        root.left.right.left = new Nodee(8);
        root.right.left = new Nodee(6);
        root.right.right = new Nodee(7);
        root.right.right.left = new Nodee(9);
        root.right.right.right = new Nodee(10);

        Nodee root2=new Nodee(1);
        root2.left=new Nodee(2);
        root2.right=new Nodee(3);
        root2.left.left=new Nodee(4);
        root2.left.right=new Nodee(5);
        root2.left.right.left = new Nodee(8);
        root2.right.left = new Nodee(6);
        root2.right.right = new Nodee(7);
        root2.right.right.left = new Nodee(9);
        root2.right.right.right = new Nodee(100);

        System.out.println(inOrder(root,root2));

    }
    
    
}

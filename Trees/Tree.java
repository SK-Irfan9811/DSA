import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        
    }
}
public class Tree {
    
    static void preOrder(Node root,ArrayList<Integer> ans){
        if(root==null)
            return ;
        ans.add(root.data);
        //System.out.println(root.data);
        preOrder(root.left,ans);
        preOrder(root.right,ans); 
    }
    static void inOrder(Node root,ArrayList<Integer> ans){
        if(root==null)
            return;
        inOrder(root.left,ans);
        ans.add(root.data);
        inOrder(root.right,ans);    
    }
    static void postOrder(Node root,ArrayList<Integer> ans){
        if(root==null)
            return;
        postOrder(root.left,ans);
        postOrder(root.right,ans);
        ans.add(root.data);
    }
    static void levelOrder(Node root,List<List<Integer>> ans){
        Queue<Node> q=new LinkedList<>();
        if(root==null)
            return;
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> sub=new ArrayList<>();
            int s=q.size();
            for(int i=0;i<s;i++){
                Node temp=q.poll();
                sub.add(temp.data);
                if(temp.left!=null)
                    q.offer(temp.left);
                if(temp.right!=null)
                    q.offer(temp.right);
            }
            ans.add(sub);
        } 
        }
        static void preOrderIterative(Node root,ArrayList<Integer> ans){
            Stack<Node> st=new Stack<>();
            if(root==null)
                return;
            st.push(root);
            while(!st.isEmpty()){
                Node temp=st.pop();
                ans.add(temp.data);
                if(temp.right!=null)
                    st.push(temp.right);
                if(temp.left!=null)
                    st.push(temp.left);    
            }    
        }
        static void postOrderIterative(Node root,ArrayList<Integer> ans){
           Node curr=root;
           Stack<Node> post=new Stack<>();
           while(curr!=null || !post.isEmpty()){
            if(curr!=null){
                post.push(curr);
                curr=curr.left;
            }
            else{
                Node temp=post.peek().right;
                if(temp==null){
                    temp=post.peek();
                    post.pop();
                    ans.add(temp.data);
                    while(!post.isEmpty() && temp==post.peek().right){
                        temp=post.peek();
                        post.pop();
                        ans.add(temp.data);
                    }

                }
                else
                    curr=temp;
            }

           }
        }
        static void inorderIterative(Node root,ArrayList<Integer> ans){
            Stack<Node> inorder=new Stack<>();
            Node node=root;
            while(true){
                if(node!=null){
                    inorder.push(node);
                    node=node.left;
                }
                else{
                    if(inorder.isEmpty())
                        break;
                    node=inorder.pop();
                    ans.add(node.data);
                    node=node.right;
                }
            }
        }
        
    public static void main(String ar[]){
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
       root.right.left=new Node(6);
        root.right.right=new Node(7);
        //root.left.left.right=new Node(8);
        ArrayList<Integer> ans=new ArrayList<>();
        //List<List<Integer>> ans=new ArrayList<>();
        //preOrderIterative(root, ans);
        //postOrderIterative(root, ans);
        inorderIterative(root, ans);
        //levelOrder(root,ans);
        System.out.println(ans);
        //preOrder(root,ans);
        //System.out.println(ans);
        //ans.clear();
        //inOrder(root,ans);
        //System.out.println(ans);
        //ans.clear();
        //postOrder(root,ans);
        //System.out.println(ans);



    }
    }
    


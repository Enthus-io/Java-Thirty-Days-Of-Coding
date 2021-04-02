import java.util.*;
import java.io.*;
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}
class Solution{

    static Queue<Node> q = new LinkedList<>();

    static void levelOrder(Node r) {
        // Write your code here
        if(r != null)
            q.add(r);

        while(!q.isEmpty()){
            Node t = q.remove();

            System.out.print(t.data + " ");

            if(t.left != null)
                q.add(t.left);

            if(t.right != null)
                q.add(t.right);
        }
    }



    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        Node root=null;
        while(T-->0){
            int data=sc.nextInt();
            root=insert(root,data);
        }
        levelOrder(root);
    }
}
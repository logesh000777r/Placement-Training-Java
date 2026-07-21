package DataStructuresAndAlgorithm.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node10{
    int data;
    Node10 left;
    Node10 right;

    Node10(int data){
        this.data=data;
    }
}

public class TreeBFS {
   
    static void levelOrder(Node10 root) {
        if(root==null)
            return;
        
        Queue<Node10>queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            Node10 current=queue.poll();
            System.out.print(current.data+" ");
            if(current.left!=null) {
                queue.offer(current.left);
            }
            if(current.right!=null) {
                queue.offer(current.right);
            }
        }



    }

    
    public static void main(String[] args) {
        Node10 root = new Node10(1);
        root.left = new Node10(2);
        root.right = new Node10(3);
        root.left.left = new Node10(4);
        root.left.right = new Node10(5);
        root.right.left = new Node10(6);
        root.right.right = new Node10(7);

        levelOrder(root);

      
    }

}

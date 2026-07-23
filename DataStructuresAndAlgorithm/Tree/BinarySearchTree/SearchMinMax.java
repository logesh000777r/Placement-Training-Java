package DataStructuresAndAlgorithm.Tree.BinarySearchTree;

public class SearchMinMax {
    static class Node2{
        int data;  //instance Variable
        Node2 left , right;

        //constructor
        Node2(int data) {
            this.data=data;
        }
    }
    static Node2 FindMin(Node2 root){
        while(root.left != null) {
            root=root.left;
            
        }
        return root;
        
    }
    static Node2 FindMax(Node2 root){
        while(root.right != null) {
            root=root.right;
            
        }
        return root;
        
    }
    public static void main(String[] args) {
        Node2 root = new Node2(30);
        root.left = new Node2(20);
        root.right = new Node2(70);
        root.left.right = new Node2(40);
        root.right.left = new Node2(60);
        root.right.right = new Node2(80);

        System.out.println("Minimum : "+FindMin(root));
        System.out.println("Maximum : "+FindMax(root));
    }
}

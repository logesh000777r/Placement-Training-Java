package DataStructuresAndAlgorithm.Tree.BinarySearchTree;

public class BstTraversal {
    static class Node1{
        int data;  //instance Variable
        Node1 left,right;

        //constructor
        Node1(int data) {
            this.data=data;
        }
    }
    //recursion
    static Node1 insert(Node1 root,int data){
        if(root==null) {
            return new Node1(data);
        }
        if(data<root.data) {
            root.left=insert(root.left,data);
        }
        else{
            root.right=insert(root.right,data);
        }
        return root;
    }
    static void inOrder(Node1 root) {
        if(root==null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node1 root =null;
        int[] arr = {50,30,70,20,40,60,80};
        for(int x : arr){
            root=insert(root,x);
        }
        inOrder(root);
    }
}


//                         50
//                  |                |
//                 30               70
//             |         |     |          |
//            20        40    60         80
//
// inOrder -> 20 30 40 50 60 70 80
//
//
//
//
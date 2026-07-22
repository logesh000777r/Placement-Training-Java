package DataStructuresAndAlgorithm.Tree.BinarySearchTree;

public class SearchElement {
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
    static boolean search(Node1 root,int key){
        if (root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if (key<root.data){
            return search(root.left,key);
        }
        return search(root.right,key);

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
        int key = 60;
        if(search(root,key)){
            System.out.println("Elemnt Found" );
        }
        else{
            System.out.println("Element Not Found");
        }
        inOrder(root);

}

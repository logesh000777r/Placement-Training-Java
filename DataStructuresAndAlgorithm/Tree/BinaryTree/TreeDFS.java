package DataStructuresAndAlgorithm.Tree.BinaryTree;


//                           1
//                      _____|_____
//                     2
//Implementation of tree
class Node10{
    int data;
    Node10 left;
    Node10 right;

    Node10(int data){
        this.data=data;
    }
}

public class TreeDFS {
    //*Traversal -> DFS -> Using preOder with Recursion */
    //PreOrder
    static void preOrder(Node10 root) {
        if(root==null)
            return;

        System.out.print(root.data+"->");
        preOrder(root.left);
        preOrder(root.right);    


    }

    //InOrder

    static void inOrder(Node10 root) {
        if(root==null)
            return;

        inOrder(root.left);
        System.out.print(root.data+"->");
        inOrder(root.right);    


    }

    //PostOrder

     static void postOrder(Node10 root) {
        if(root==null)
            return;

        postOrder(root.left);
        postOrder(root.right);    
        System.out.print(root.data+"->");

    }
    public static void main(String[] args) {
        Node10 root = new Node10(1);
        root.left = new Node10(2);
        root.right = new Node10(3);
        root.left.left = new Node10(4);
        root.left.right = new Node10(5);
        root.right.left = new Node10(6);
        root.right.right = new Node10(7);

        // preOrder(root);
        // inOrder(root);
        postOrder(root);

        //DFS -> Preorder -> {1,2,4,5,3,6,7}
        //-> InorDer -> {4,2,5,1,6,3,7}
        //-> PostOrder -> {4,5,2,6,7,3,1}
    }

}

package DataStructuresAndAlgorithm.LinkedList.SinglyLinkedList;
class Node{
    int data;
    Node next;
}

public class Create_Node {
    public static void main(String[] args) {
        Node first = new Node();
        first.data=100;
        first.next=null;
        System.out.println("Data : "+first.data);
        System.out.println("Null : "+first.next);
        
    }

}

package DataStructuresAndAlgorithm.LinkedList.SinglyLinkedList;
//Creating Node Class
class Node{
    int data;
    Node next;
}
public class Linking_Nodes {
    public static void main(String[] args) {
        //Creating Nodes
        Node first = new Node();
        Node second = new Node();
        Node third= new Node();

        //assigning Values
        first.data=100;
        second.data=200;
        third.data=300;

        //Linking Nodes
        first.next=second;
        second.next=third;
        third.next=null;

        System.out.println("Data 1: "+first.data);
        System.out.println("Address : "+first.next);
        System.out.println("Data 2: "+second.data);
        System.out.println("Address : "+second.next);
        System.out.println("Data 3: "+third.data);
        System.out.println("Null : "+third.next);
        
    }

}
